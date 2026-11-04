class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
         
        HashMap<HashMap<Character, Integer>, List<String>> doubleMap = new HashMap<>(); 

        for(int i = 0; i < strs.length; i++) { 

            HashMap<Character, Integer> strMap = new HashMap<>();
            String currWord = strs[i]; 

            for(int j = 0; j < strs[i].length(); j++) {

                Character currLetter = currWord.charAt(j);
                
                if (strMap.containsKey(currLetter)){ 
                    strMap.put(currLetter, strMap.get(currLetter) + 1);
                }

                else{ 
                    strMap.put(currLetter, 1);  
                }
            }

            if (doubleMap.containsKey(strMap)) { 
                doubleMap.get(strMap).add(currWord); 
            }

            else{
                doubleMap.put(strMap, new ArrayList<>(List.of(currWord))); 
            }
        }

        return new ArrayList<>(doubleMap.values()); 
    }
}
