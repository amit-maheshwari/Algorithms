/*
Given a non-negative integer num, write a program to return the number obtained after reversing the bits of num.

The actual binary representation of the number is being considered for reversing the bits, no leading 0’s are being considered.
Ex-
Input: 13
Output: 11
Explanation: Binary representation of 13 is 1101. After reversing the bits we get 1011 which is equal to 11.
 */

import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        while(true){
            System.out.println("Enter a non-negative number to reverse in bits or -1 to exit -");
            num = Integer.parseInt(scanner.next());
            if(num <0 ){
                break;
            }
            System.out.println("Binary Num:"+Integer.toBinaryString(num));
            System.out.println("Reversed Bits :"+reverseBits(num));
        }

    }

    private static int reverseBits (int number){
        StringBuilder convertedNum = new StringBuilder();
        int reversedNumber = 0;
        while(number >0){
            int y = number %2;
            reversedNumber = reversedNumber*2+y;
            convertedNum.append(y);
            number = number/2;
        }
        //System.out.println(reversedNumber);
        return reversedNumber;
    }
}
