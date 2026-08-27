class arrayFreq{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,1,2,2,1,3,3,3};

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

		for (int i = 0;i < arr.length ;i++ ) {

		int count = 1;
		boolean alreadyCount = false;

			for (int j = 0;j < i ;j++ ) {
				if (arr[i] == arr[j]) {
					alreadyCount = true;
					break;
				}
			}

			if (!alreadyCount) {
				for (int k = i + 1;k < arr.length ;k++ ) {
					if(arr[i] == arr[k]){
						count++;	
					}	
				}

				System.out.println(arr[i] + " occurs " + count + " times");
			}
		}
	}
}