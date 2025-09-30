class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> charMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char original = s.charAt(i);
            char replace=t.charAt(i);

            if(!charMap.containsKey(original)) {
                if(!charMap.containsValue(replace))
                charMap.put(original, replace);
                else
                    return false;
            }
            else{
                char mappedChar=charMap.get(original);
                if(mappedChar != replace)
                return false;
            }
        }
        return true;
    }
}