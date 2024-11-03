public class largestNum {

  public static int largestInt(int arr[]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }
  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 5, 6, 72, 1 };
    System.out.println(largestInt(arr));
  }
}
