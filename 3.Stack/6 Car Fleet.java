class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet=0;
        double time[]=new double[target];
        for(int i=0;i<position.length;i++)
            time[position[i]]=(double)(target-position[i])/speed[i];
        
        double behind=0.0;
        //Car fleet occurs when behind car time is less than ahead car
        for(int i=time.length-1;i>=0;i--){
            double ahead=time[i];
            if(ahead>behind){
                behind=ahead;
                fleet++;
            }
        }
        return fleet;
    }
}
