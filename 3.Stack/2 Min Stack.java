class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> minVal;

    public MinStack() {
        stack=new Stack<>();
        minVal=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        val=Math.min(val,minVal.isEmpty()?val:minVal.peek());
        minVal.push(val);
    }
    
    public void pop() {
        stack.pop();
        minVal.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minVal.peek();
    }
}
