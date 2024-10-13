import java.util.Arrays;

public class Aufgabe3 {
    public int[] sum(int[] num1, int[] num2){
        int[] result = new int[num1.length];
        int carry = 0;
        for(int i = num1.length - 1; i >= 0; i--){
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry != 0){
            int[] extended_result = new int[result.length + 1];
            System.arraycopy(result,0,extended_result,1,result.length);
            extended_result[0] = carry;
            return extended_result;
        }
        return result;
    }

    public int[] difference(int[] num1, int[] num2){
        int[] result = new int[num1.length];
        int borrow = 0;

        for(int i = num1.length - 1; i >= 0; i--){
            int diff = num1[i] - num2[i] - borrow;
            if(diff < 0){
                diff = diff + 10;
                borrow = 1;
            }
            else borrow = 0;
            result[i] = diff;
        }
        return result;
    }

    public int[] MultiplyBySingleDigit(int[] num, int digit){
        int[] result = new int[num.length + 1];
        int carry = 0;
        for(int i = num.length - 1; i >= 0; i--){
            int product = num[i] * digit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }
        result[0] = carry;
        if (carry != 0)
            return result;
        int[] good_result = new int[result.length - 1];
        for (int i = 0; i < good_result.length; i++)
            good_result[i] = result[i + 1];
        return good_result;
    }

    public int[] divideBySingleDigit(int[] num, int digit) {
        int[] result = new int[num.length];
        int remainder = 0;

        for (int i = 0; i < num.length; i++) {
            int current = remainder * 10 + num[i];
            result[i] = current / digit;
            remainder = current % digit;
        }

        int leadingZeros = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                break;
            }
            leadingZeros++;
        }

        if (leadingZeros == 0) {
            return result;
        } else {
            int[] finalResult = new int[result.length - leadingZeros];
            for (int i = 0; i < finalResult.length; i++) {
                finalResult[i] = result[i + leadingZeros];
            }
            return finalResult;
        }
    }


}
