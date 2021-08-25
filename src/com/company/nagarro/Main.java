package com.company.nagarro;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("hello world");
        //my name is vikas bhalla fuck poota..
        String str = "malayalam";
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str)
    {
        int n = str.length();
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
