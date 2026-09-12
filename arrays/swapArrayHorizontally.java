class swapArrayHorizontally{
	public static void main(String[] args ){

		int[][] arr = {
            {3, 7, 2},
            {8, 4, 1},
            {5, 9, 6}
        };;

		System.out.println("------------------------------------");
		System.out.println("Original array values are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            if (j < arr[i].length - 1) {
                    System.out.print("  |  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nHorizontally flipped array is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j]);
                if (j > 0) {
                    System.out.print("  |  ");
                }
            }
            System.out.println();
        }
	}
}