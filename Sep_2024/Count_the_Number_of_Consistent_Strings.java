class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // int a=allowed.length();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        // System.out.println(set);
        for(String b: words){
            int c=b.length();
            int flag=1;
            for(int i=0;i<c;i++){
                if(!set.contains(b.charAt(i))){
                    flag=0;
                    break;
                }
            }
            count+=flag;

        }
        return count;
        
    }
}