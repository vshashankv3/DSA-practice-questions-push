class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        int n = arr.length;
        
        int leader = arr[n-1];
        ArrayList<Integer> leaderArray = new ArrayList<>();
        
        leaderArray.add(leader);
        
        if(arr.length == 1){
            leaderArray.add(arr[0]);
            return leaderArray;
        }
        
        for(int i = n-2; i>=0 ; i--){
            
            if(arr[i] >= leader){
                leader = arr[i];
                leaderArray.add(leader);
            }
                
        }
        Collections.reverse(leaderArray);
        
        return leaderArray;
        
    }
}
