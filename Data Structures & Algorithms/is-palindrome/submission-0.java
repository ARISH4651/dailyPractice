class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        if(Character.isLetterOrDigit(s.charAt(i)))
        s1.append(s.charAt(i));
        for(int i=0;i<s.length();i++)
        if(Character.isLetterOrDigit(s.charAt(i)))
        s2.append(s.charAt(i));
        if(s1.toString().equals(s2.toString()))
        return true;
        return false;
        


    }
}
