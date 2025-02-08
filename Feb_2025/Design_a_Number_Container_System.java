import java.util.HashMap;
import java.util.TreeSet;

class NumberContainers {
    HashMap<Integer,TreeSet<Integer>> numberIdx;
    HashMap<Integer,Integer> idxNumber;
    public NumberContainers() {
        numberIdx=new HashMap<>();
        idxNumber=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(idxNumber.containsKey(index)){
            int prev=idxNumber.get(index);
            numberIdx.get(prev).remove(index);
            if(numberIdx.get(prev).size()==0){
                numberIdx.remove(prev);
            }
        }
        idxNumber.put(index,number);
        if(!numberIdx.containsKey(number)){
            numberIdx.put(number,new TreeSet<>());
        }
        numberIdx.get(number).add(index);
        
    }
    
    public int find(int number) {
        if(!numberIdx.containsKey(number)){
            return -1;
        }
        return numberIdx.get(number).first();        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */