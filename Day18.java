public class Solution {
    Stack stack = new Stack();
    Queue queue = new LinkedList();
     void pushCharacter(char ch){
         stack.push(ch);   
    }
     void enqueueCharacter(char ch){
         queue.add(ch);
    }
      char popCharacter(){
        return (char)stack.pop();
    }
      char dequeueCharacter(){
         return (char)queue.remove();
    }

