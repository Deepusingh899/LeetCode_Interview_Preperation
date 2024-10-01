class CustomStack {

    int[] stk;
    int cap;
    int size;
    int index;
    public CustomStack(int maxSize) {
        stk=new int[maxSize];
        cap=maxSize;
        size=0;
        index=-1;
    }
    
    public void push(int x) {
        if(size==cap) return;
        index++;
        size++;
        stk[index]=x;        
    }
    
    public int pop() {
        if(size==0){
            return -1;
        }
        int value=stk[index];
        index--;
        size--;
        return value;        
    }
    
    public void increment(int k, int val) {
        if(size==0) return;
        int min=Math.min(size,k);
        for(int i=0;i<min;i++){
            stk[i]=stk[i]+val;
        }        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */