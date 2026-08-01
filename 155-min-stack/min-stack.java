class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(value);
            minStack.push(value);
            return;
        }
        stack.push(value);
        if(value <= minStack.peek()){
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int val = stack.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */