import java.util.Scanner;
class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int[] arr1 = new int[5];
      int[] arr2 = new int[5];

  System.out.println("-----------------------------------");
  System.out.println("Enter the Elements of array.");

  for (int i = 0 ; i < 5 ; i++ ){
    arr1[i] = sc.nextInt();
    }

  System.out.println("-----------------------------------");
  System.out.println("Array in reverse order.");
  for(int i = 4; i >= 0; i--){
      arr2[arr2.length - i - 1] = arr1[i];
    }

  for(int i = 0; i < 5; i++){
      System.out.print(arr2[i] + " ");
    }

  System.out.println("\n-----------------------------------");
  System.out.println("Array 1 copyed to array 2.");

  }
}