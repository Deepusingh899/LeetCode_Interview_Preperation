class MyCalendar {

    private List<int[]> cal;
    public MyCalendar() {
        cal=new ArrayList<>();        
    }    
    public boolean book(int start, int end) {
        // System.out.println(cal);
        for(int[] x:cal){
            if((start<x[0] && end>x[0])  || start==x[0] || (start>x[0] && start<x[1])){
                return false;
            }          
        }
        // System.out.println(start+" "+end);
        cal.add(new int[]{start,end});        
        return true;        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */