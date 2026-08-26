import java.util.Scanner;
class q2 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

   System.out.println("-----------------------------------");
   System.out.println("Enter the size of first Array...");

      int size1 = sc.nextInt();      
      int[] arr1 = new int[size1];

   System.out.println("-----------------------------------");
   System.out.println("Enter the Elements of array.");

    for (int i = 0 ; i < arr1.length ; i++ ){
      System.out.println("Enter value " + (i + 1));
      arr1[i] = sc.nextInt();
    }


   System.out.println("-----------------------------------");
   System.out.println("Enter the size of Second Array...");

      int size2 = sc.nextInt();
      int[] arr2 = new int[size2];

      for (int i = 0 ; i < arr2.length ; i++ ){
      System.out.println("Enter value " + (i + 1));
      arr2[i] = sc.nextInt();
    }
   System.out.println("-----------------------------------");

   int size3 = size1 + size2;
   int[] arr3 = new int[size3];

   for(int i = 0; i < arr1.length; i++){
     arr3[i] = arr1[i];
    }

    for(int i = 0; i < arr2.length; i++){
     arr3[size1 + i] = arr2[i];
    }

     System.out.println("Elements From both array 1 and array 2 are..");
    for(int i = 0; i < arr3.length; i++){
     System.out.print(arr3[i] + " ");
    }
     System.out.println("\n-----------------------------------");
  }
}