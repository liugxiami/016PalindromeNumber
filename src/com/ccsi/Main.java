package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int num=1321;
        boolean b=palindromeNum(num);
        System.out.println(b);
    }

    //Determine whether an integer is a palindrome. Do this without extra space;
    public static boolean palindromeNum(int number){
        if(number<0) return false;           //negative number is not palindrome number
        if(number==0) return true;           //0 is a palindrome number
        int temp=number;
        int rev=0;
        while(number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        return rev==temp?true:false;
    }
}
