class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        boolean palindrome = true;
        int i =0;
        int j = str.length()-1;
        
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) palindrome = false;
            i++;j--;
        }
        return palindrome;
    }
}
// class Solution {
//     public boolean isPalindrome(int x) {
//         int ori = x;
//         int rev=0;
//         while(x>0){
//             int digits=x%10;
//             rev=rev*10+digits;
//             x=x/10;
//         }
//         return ori == rev;
//     }
// }