public class PalindromicRunner {
    public static void main(String[] args) {
        // be sure you're testing each method as you work then produce your final output using the toString method
      //int num1 = 123;
      Integer num2 = 72927;
      PalindromicNumberFinder test = new PalindromicNumberFinder(num2);
      System.out.println("reverse: " + test.reverseNum(num2));
      //System.out.println("number is " + test.getNum());
      test.searchForPalindromicNum(num2);
      System.out.println(test);
      //System.out.println(test.searchForPalindromicNum(num2));
    }
}
