public class mSums {
    public static int Sum(int[] arr,boolean odd){
        int n=arr.length,cnt=0;
        
        if(odd) cnt=1;

        int sum=0;
        for(int i=cnt;i<n;i+=2) sum+=arr[i];

        return sum;        
    }
}
