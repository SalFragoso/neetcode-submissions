class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false; 
        }

        HashMap<Character, Integer> sTable = new HashMap<>();

        for(Character letter : s.toCharArray()) { 

            if(sTable.containsKey(letter)){
                sTable.put(letter, sTable.get(letter) + 1);
            }

            else{
                sTable.put(letter, 1); 
            }
        }

        HashMap<Character, Integer> tTable = new HashMap<>();

        for(Character letter : t.toCharArray()) { 

            if(tTable.containsKey(letter)){
                tTable.put(letter, tTable.get(letter) + 1);
            }

            else{
                tTable.put(letter, 1); 
            }
        }

        return sTable.equals(tTable); 


    }
}
