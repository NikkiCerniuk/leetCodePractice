class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() %2 == 1 ){ // * 1. check if odd or null string and return false if yes
            return false; 
        }
        
        Deque<Character> closeParenStack = new ArrayDeque<>();// * 2. delcare a stack using a deqeue array interface 
        for (int i=0; i<s.length();i++){
            char c = s.charAt(i);

            switch(c){  // 3a. push all closing brackets onto the stack using push 
                case '(' -> closeParenStack.push(')');
                case '{' -> closeParenStack.push('}');
                case '[' -> closeParenStack.push(']');
                default -> {
                  if (closeParenStack.isEmpty() || closeParenStack.pop() != c){
                    return false;
                  }
                }
            }
        }
        return (closeParenStack.isEmpty() ? true: false);
    }
}

/*
 * 3. iterate through the string 
 *      3b. pop things off the stack. If stack is empty or c! pop then return false
 * 
 * 
 4. return true if made it through the entire string
 */
