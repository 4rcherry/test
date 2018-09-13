/*
Persoalan :
	Diketahui suatu bilangan bulat, lakukan pemeriksaan terhadap bilangan itu untuk menentukan apakah bilangan itu merupakan bilangan prima?

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buatlah kelas (Prime) yang menyediakan layanan pemeriksaan bilangan prima untuk suatu bilangan yang dimasukkan.
*/
package block_env;

public class Prime {
	// Atribut-atribut
	private int number;
	// flag untuk prima, true bila bilangan prima dan false bila bukan bilangan prima.
	// Untuk mencatat angka yang dipertanyakan.
	private boolean fPrime = true;

	// Untuk mencatat apakah bilangan yang dipertanyakan adalah bilangan prima. Pada saat constructor, kita langsung melakukan pemeriksaan apakah bilangan merupakan bilangan prima.
	public Prime(int number) {
		this.number = number;
		doPrime();
	}
	public int getNumber() {
		return number;
	}
	public boolean isPrime() {
		return fPrime;
	}

	// Kita memanfaatkan metode toString() untuk menyatakan state object sehingga kita dapat menguji kelas dengan hanya mengirim object itu ke System.out.println() sebagai berikut :
	@Override
	public String toString() {
		String str = "";
		if (fPrime) {
			str += number + " is prime number\n";
		} else {
			str += number + " is error\n";
		}
		return str;
	}

	static void userInterface() {
		for (int i = 1; i < 10; i++) {
			System.out.print(new Prime(i));
		}		
	}

	public static void main(String[] args) {
		userInterface();
	}

	// Bilangan prima ditandai bilangan tidak dapat dibagi utuh dengan 2 sampai dengan √bilangan itu sendiri.
	private void doPrime() {
		System.out.printf("[^%d]", (int)Math.floor(Math.sqrt(number)));
		for (int i = 2; i <= (int)Math.floor(Math.sqrt(number)); i++) {
			System.out.printf("[%dmod%d = %d]", number, i, (number % i));
			if ((number % i) == 0) {
				fPrime = false;
				return;
			}
		}
		// Pertama-tama kita mengansumsikan bilangan adalah bilangan prima. Bila ternyata bilangan dapat dibagi utuh diantara 2 sampai √bilangan maka bilangan itu bukan prima dan langsung keluar dari metode.
	}
}