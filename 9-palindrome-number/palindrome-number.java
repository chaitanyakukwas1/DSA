class Solution {
    public boolean isPalindrome(int x) {
        
        int palindrome = x;

        int reverse = 0;

        while(x > 0){

            int lastDigit = x % 10;

            x = x /10;

            reverse = (reverse * 10) + lastDigit;

        }

        if(palindrome == reverse){
            return true;
        }
        return false;
    }
}