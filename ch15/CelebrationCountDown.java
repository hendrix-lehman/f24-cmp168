class CelebrationCountDown {

  public static void countDown(int count) {
    try {
      if (count == 0) { // base case
        Thread.sleep(1000); 
        System.out.println("Happy New Year!"); // termination point
      } else {
        Thread.sleep(1000);
        System.out.println(count);
        countDown(count - 1); // recursive call (calls itself)
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
      return;
    }
  }

  public static void main(String[] args) {
    countDown(10);
  }
}
