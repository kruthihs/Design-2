// Time Complexity : push - O(n) Pop - O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class MyQueue {
    
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    
    public void push(int x) {    
        s1.push(x);
        
    }
    
    public int pop() {
    
        while(!s1.isEmpty()){
        s2.push(s1.pop());
        }
        
        int temp = s2.pop();
        
        while(!s2.isEmpty()){
        s1.push(s2.pop());
        }
        
        return temp;
    }
    
    public int peek() {
          while(!s1.isEmpty()){
        s2.push(s1.pop());
        }
        
        int temp = s2.peek();
        
        while(!s2.isEmpty()){
        s1.push(s2.pop());
        }
        
        return temp;
    }
    
    public boolean empty() {
        
        return s1.isEmpty();   
    }
}
