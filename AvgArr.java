public class AvgArr {
    public static void findAvg(int[] arr){
        int sum=0,n=arr.length;

        for(int i=0;i<n;i++) sum+=arr[i];

        int avg=sum/n;

        for(int i=0;i<n;i++) System.out.print(arr[i]-avg+" ");
        System.out.println();
    }
}
