class dupValues{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,1,2};

		System.out.println(" ");
		System.out.println("--------------------------------");
		System.out.println("Orignal array is...");
		System.out.println(" ");

		System.out.print("{ ");
		for(int i = 0; i < arr.length; i++ ){
		System.out.print( arr[i] + " ");
		}
		System.out.print("}");		
		System.out.println("\n------------------------------");
		System.out.println(" ");

		int[] tempArray = new int[arr.length];

		int newSize = 0;

		for (int i = 0;i < arr.length ;i++ ) {
			boolean isDup = false;

			for (int j = 0;j < newSize ;j++ ) {
				if (arr[i] == tempArray[j]) {
					isDup = true;
					break;
				}
			}

			if (!isDup) {
				tempArray[newSize] = arr[i];
				newSize++;
			}
		}

		int[] newArray = new int[newSize];
		for (int i = 0;i < newSize ;i++ ) {
			newArray[i] = tempArray[i];
		}
		System.out.println("\n\nNew Array After Removing Duplicates:");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println("\n\nSize of Original Array: " + arr.length);
        System.out.println("Size of New Array: " + newArray.length);
	}
}