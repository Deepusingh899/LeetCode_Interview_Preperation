class Solution {
    public String pushDominoes(String dominoes) {
        int count=0;
        char last='L';
        StringBuilder sb =new StringBuilder();
        for(char d: dominoes.toCharArray()){
            if(d=='.') count++;
            else{
                if(d==last) append(count,last,sb);
                else if(last=='L'){
					append(count,'.',sb);
                }else {
                    append(count/2,'R',sb);
                    if(count%2!=0) append(1,'.',sb);
                    append(count/2,'L',sb);
                }
                sb.append(d);
                last=d;
                count=0;
            }
        }
    append(count,last=='R'?'R':'.',sb);
    return sb.toString();
        
    }
    private void append(int count,char last,StringBuilder sb){
        for(int i=0;i<count;i++){
            sb.append(last);
        }
    }
}