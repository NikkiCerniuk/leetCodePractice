class Solution {//goal: convert roman numeral to int
    public int romanToInt(String s) {
      Map<Character,Integer> romanToIntMap = Map.of(// * 1. map each value. roman = key, int = value
        'I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);  

        int total= 0;
        for(int i=0;i<s.length();i++){
            int curr = romanToIntMap.get(s.charAt(i)); //look up the associated value for the current roman numeral from our input using the map
            int next = (i+1<s.length() ? romanToIntMap.get(s.charAt(i+1)): 0); //while there is a next character, the next character is equal to this
            if(curr<next){
                total -= curr;
            }else{
                total += curr;
            }
        }
        return total;
    
    }
} 


//map look up is O(1)
// you have to traverse all chars in the string exactly once so the time efficency for this solution overall is O(n)
