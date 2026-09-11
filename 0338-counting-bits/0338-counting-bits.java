class Solution {
    public int[] countBits(int n) {
        int [] arr = new int[n+1];
        for (int i=0;i<=n;i++){
            int a = i;
            int sum = 0;
            while(a>0){
                if((a&1)==1){
                sum ++;
            }a = a>>1;
        }arr[i] = sum ;

        }return arr;


        
        
        
    }
}