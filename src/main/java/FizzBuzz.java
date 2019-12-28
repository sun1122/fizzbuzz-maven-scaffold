/**
 * @author flysun55
 * @date 2019/12/28
 */
public class FizzBuzz {



    public static String fizzBuzz(int sayNum, int firstNum, int secondNum) {
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

    }

    private static boolean isFizzBuzz(int sayNum, int firstNum, int secondNum) {
        return isFizz(sayNum, firstNum) && isBuzz(sayNum, secondNum);
    }


    private static boolean isFizz(int sayNum, int firstNum) {
        return isOrContain(sayNum, firstNum);
    }

    private static boolean isBuzz(int sayNum, int secondNum) {
        return isOrContain(sayNum, secondNum);
    }

    private static boolean isOrContain(int sayNum, int targetNum) {
        return (sayNum % targetNum == 0) || numToString(sayNum).contains(numToString(targetNum));
    }

    public static String numToString(int num) {
        return String.valueOf(num);
    }

 }
