import java.util.Scanner;
class magicArray2{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];

		System.out.println("------------------------------------");
		System.out.println("Enter the Values of array...");

		for (int i = 0;i < 3;i++ ) {
			for (int j = 0;j < 3 ;j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}

		int firstSum = 0;
		for (int i = 0;i < 3;i++ ) {
			firstSum += arr[i][0];
		}

		boolean isMagic = true;

		for (int j = 1;j < 3;j++ ) {
			int colmnSum = 0;
			for (int k = 0;k < 3;k++ ) {
				colmnSum += arr[k][j];
			}

			if (colmnSum != firstSum) {
					isMagic = false;
					break;
				}
		}

		if (isMagic) {
				System.out.print("Magic Array.");
			}else{
				System.out.print("Is NOT a Magic Array.");
			}
	}
}