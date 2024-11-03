import java.util.*;
public class linearSearch {

   public static int linear(String foodArr[], String Itm) {
     for (int i = 0; i < foodArr.length; i++) {
       if (foodArr[i].equals(Itm)) {  // Use .equals() for string comparison

         return i;
       }
     }
     return -1;
   }


   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    String food[] = { "Dosa", "Idli", "Sambar", "Vada" };
    String Key = sc.nextLine();
    int result = linear(food, Key);

    if (result != -1) {
         System.out.println(Key + " found at index " + result);
    } else {
        System.out.println(Key+" not found");
    }
      sc.close(); // Close the scanner
  }
}