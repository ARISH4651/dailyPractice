class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
      StringBuilder sb =new StringBuilder(s);
      for(int i=0;i<t.length();i++){
        char target=t.charAt(i);
        int index=sb.indexOf(String.valueOf(target));

        if(index!=-1){
            sb.deleteCharAt(index);
        }
      }
      return sb.isEmpty();

    }
}


