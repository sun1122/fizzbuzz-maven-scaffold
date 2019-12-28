/**
 * @author flysun55
 * @date 2019/12/28
 */
public class FizzBuzz {



/*    public static String fizzBuzz(int sayNum, int firstNum, int secondNum) {
        String result = "";
        //是3FIZZ 和 5BUZZ
        if (isFizzBuzz(sayNum, firstNum, secondNum)) {
            result = "FizzBuzz";
        } else if (isFizz(sayNum, firstNum)) {
            result = "Fizz";
        } else if (isBuzz(sayNum, secondNum)) {
            result = "Buzz";
        } else {
            result = String.valueOf(sayNum);
        }
        return result;

    }*/

    /**
     * 能被3整除
     *
     * @param sayNum
     * @param firstNum
     * @param secondNum
     * @param thirdNum
     * @return
     */
    public static String fizzBuzz(int sayNum, int firstNum, int secondNum, int thirdNum) {

        if (sayNum <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        String result = "";
        //3FIZZ  5BUZZ 7Whizz
        if (isFizzBuzzWhizz(sayNum, firstNum, secondNum, thirdNum)) {
            result += "FizzBuzzWhizz";
        } else if (isFizzBuzz(sayNum, firstNum, secondNum)) {
            result += "FizzBuzz";
        } else if (isFizz(sayNum, firstNum)) {
            result += "Fizz";
        } else if (isBuzz(sayNum, secondNum)) {
            result += "Buzz";
        } else if (isWhizz(sayNum, thirdNum)) {
            result += "Whizz";
        } else if (result.length() == 0) {
            result = String.valueOf(sayNum);
        }
        return result;

    }


    private static boolean isFizzBuzzWhizz(int sayNum, int firstNum, int secondNum, int thirdNum) {
        return isFizz(sayNum, firstNum) && isBuzz(sayNum, secondNum) && isWhizz(sayNum, thirdNum);
    }

    private static boolean isFizzBuzz(int sayNum, int firstNum, int secondNum) {
        return isFizz(sayNum, firstNum) && isBuzz(sayNum, secondNum);
    }


    private static boolean isFizz(int sayNum, int firstNum) {
        return isMulit(sayNum, firstNum);
    }

    private static boolean isBuzz(int sayNum, int secondNum) {
        return isMulit(sayNum, secondNum);
    }

    private static boolean isWhizz(int sayNum, int thirdNum) {
        return isMulit(sayNum, thirdNum);
    }

    /*private static boolean isOrContain(int sayNum, int targetNum) {
        return (sayNum % targetNum == 0) || numToString(sayNum).contains(numToString(targetNum));
    }*/

    private static boolean isMulit(int sayNum, int targetNum) {
        return sayNum % targetNum == 0;
    }

    /*public static String numToString(int num) {
        return String.valueOf(num);
    }*/

}
