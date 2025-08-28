class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length ==0){
            return ""; //handles edge cases 
        }

        
        StringBuilder longestPrefix = new StringBuilder(); //have to use stringbuilder instead of string bc we need it to be muteable. prefix starts with a value of ""
        
        String firstWord = strs[0];//access the first word and all its characters
        for (int i=0; i< firstWord.length(); i++){ //go through all the chars in the first word
            char c = firstWord.charAt(i); //stores the current char we are looking at
        


        
        //compare this to all other words in strs
        for (int j= 1;j<strs.length;j++){
            if(i >= strs[j].length() || strs[j].charAt(i) != c){         //if index is out of range or there is not a match then stop
                return longestPrefix.toString(); 
            }
        }
                    longestPrefix.append(c);

    }
     
        return longestPrefix.toString(); //our class wants us to return the type "String" not "Stringbuilder"
    }

}
