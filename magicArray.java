import java.util.Scanner;
class magicArray{
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
			firstSum += arr[0][i];
		}

		boolean isMagic = true;

		for (int j = 1;j < 3;j++ ) {
			int rowSum = 0;
			for (int k = 0;k < 3;k++ ) {
				rowSum += arr[j][k];
			}

			if (rowSum != firstSum) {
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