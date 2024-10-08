class Solution {
    public int minSwaps(String s) {
        int counter=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                counter++;
            }else if(counter>0){
                counter--;
            }
        }
        System.out.println(counter);
        return (counter+1)/2;        
    }
}