    /*
	[baris][kolom]
*/

package array;

public class Dimention2 {
	static void uI() {
		//Langkah 1: Deklarasi vaiable array dan penciptaan
		int int2D[][] = new int[4][5];
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				int2D[i][j] = k++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(int2D[i][j] + " ");
			}
			System.out.println();	
		}
	}
	public static void main(String[] args) {
		uI();
	}
}