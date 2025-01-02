class Solution { 
    public int maxScore(String s) {    
        int n=s.length();
        int max=-1;int zeros=0,ones=0;
        for(int i=0;i<n-1;i++){ 
            if(s.charAt(i)=='0'){ 
                zeros++;
            } else{
                ones++;     
            }                    
            max=Math.max(max,zeros-ones);
        }                                         
        if(s.charAt(n-1)=='1'){          
            ones++;
        }                              
        return (max+ones);                                    
    }
}