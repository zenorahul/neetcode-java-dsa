class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))) 
                str=str+s.charAt(i);
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
            return true;
        else
            return false;
    }
}
