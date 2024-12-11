class LinearSearchRecursive {

  public static int linearSearch(int[] arr, int target, int currentIndex) {
    if (currentIndex < 0 || currentIndex >= arr.length) { // base case, not found
      return -1;
    } else if (arr[currentIndex] == target) { // base case, found
      return currentIndex;
    } else {
      return linearSearch(arr, target, currentIndex + 1); // recursive case (call itself)
    }
  }

  public static void main(String[] args) {

    // int[] scores = new int[9999];
    // for (int i = 0; i < scores.length; i++) {
    //   scores[i] = i;
    // }
    int[] scores = { 82, 87, 75, 99, 91, 95, 72, 54 };
    int target = 99;
    int index = linearSearch(scores, target, 0);

    if (index != -1) {
      System.out.println("The target " + target + " was found at index: " + index);
    } else {
      System.out.println("The target " + target + " was not found in the array.");
    }

  }
}
