class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            map.put(c1, map.getOrDefault(c1,0)+1);
            char c2=t.charAt(i);
            map.put(c2, map.getOrDefault(c2,0)-1);
        }
        for(int i:map.values())
        {
            if(i!=0)return false;
        }
        return true;

    }
}
