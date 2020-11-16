public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
        num += 1;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
    // System.out.println(reverseNum(num));
     String mun = reverseNum(num);
     Integer mun1 = Integer.valueOf(mun);
     if (testPalindromicNum(mun1) == true){
       num += 1;
       mun = reverseNum(num);
       mun1 = Integer.valueOf(mun);
     }
     else{
     while (testPalindromicNum(mun1) == false){
        mun1++;
     }
    }
     //System.out.println("palindrom - original: " + (mun1 - num));
     return mun1 - num;
    //  if (testPalindromicNum(mun1) == true){
    //    return num;
    //  }else {
    //    num++;
    //  }
    //   return num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String number = String.valueOf(num);
      boolean pal = true;
      int length = number.length();
      // System.out.println("length: " + length);
      // System.out.println("start: " + number.substring(1-1, 1));
      // System.out.println("end: " + number.substring(length - 1, length));
      String start = number.substring(1-1, 1);
      String end = number.substring(length - 1, length);
      //System.out.println(number.substring(0, 0+1));
      //System.out.println(number.substring(length-0, length));
     for (int i = 1; i < 2; i++){
       String start1 = number.substring(i-1, i);
       Integer start2 = Integer.valueOf(start);
       String end1 = number.substring(length-i, length);
       Integer end2 = Integer.valueOf(end);
        if (start2 == end2){
         start1 = number.substring(i, i+1);
         start2 = Integer.valueOf(start1);
         end1 = number.substring(length - i - 1, length - i);
         end2 = Integer.valueOf(end1);
          //pal = true;
         // System.out.println("i: " + i);
        } else {
          return false;
        }
      }
      return pal;
    }


    // // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
    String number = String.valueOf(num);
    String reverse = "";
    for (int i = number.length(); i > 0; i--){
      String start = number.substring(i-1,i);
      reverse += start;
    }
    Integer num1 = Integer.valueOf(reverse);
   // System.out.println(testPalindromicNum(num1));
      return reverse;


    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
