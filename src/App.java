public class App {
    public static void main(String[] args) throws Exception {

      boolean testLess20 = App.less20(10);
      boolean testCloseFar = App.closeFar(10, 11, 14);
      String testFirstHalf = App.firstHalf("WooHoo");
      String testRepeatEnd = App.repeatEnd("hello", 3);
      int testCountYZ = App.countYZ("da fyyyz");

      System.out.println(testCloseFar);
      System.out. println(testLess20);
      System.out.println(testFirstHalf);
      System.out.println(testRepeatEnd);
      System.out.println(testCountYZ);
    }


      // Logic 1
      public static boolean less20(int n) {
        int remainder = n %20;
        
        if (remainder == 18 || remainder == 19) {
          return true;
        }
          return false;
      }

      // Logic 2
      public static boolean closeFar(int a, int b, int c) {
       
        if(Math.abs(a-b) <= 1 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2) {
            return true;
        }
       
        if(Math.abs(a-c) <= 1 && Math.abs(a-b) >= 2 && Math.abs(b-c) >= 2) {
            return true;
        }
       
        return false;
    }

    // String 1
    public static String firstHalf(String str) {
      return str.substring(0, str.length()/2);
    }

    // String 2 
    public static String repeatEnd(String str, int n) {
      
      String endLetters = str.substring(str.length()-n);
      String finalString = "";

      for (n = n; n > 0; n--) {
        finalString += endLetters;
      }

      return finalString;
    }

    // String 3
    public static int countYZ(String str) {
      
        int count = 0;
        str = str.toLowerCase() + " ";
        
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }
        
        return count;
    }
    
    }
    

    

     
    

