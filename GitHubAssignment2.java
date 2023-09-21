/**
 * GitHub-Assignment-2
 */
import java.util.Scanner;
import java.util.Random;

public class GitHubAssignment2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter size of the array: ");
       
        int size = scan.nextInt();
        int[] arr = new int[size];
        Random rand = new Random();
        
        for(int i = 0; i < size; i++){
            int elt = rand.nextInt(101);
            arr[i] = elt;
        }

        int option = 0;
        while(option != 4){
            System.out.print("Please enter your choice: ");
            option = scan.nextInt();
            if(option == 1){
                int min = 101; int max = -1;
                for(int i = 0; i < size; i++){
                    if(arr[i] <= min){
                        min = arr[i];
                    }
                    if(arr[i] >= max){
                        max = arr[i];
                    }
                }
            }
            else if(option == 2){
                AvgArr.findAvg(arr);
            }
            else if(option == 3){
                System.out.println(mSums.Sum(arr,false)+" "+mSums.Sum(arr,true));
            }
            //Enter 4 to exit
        }
        scan.close();
        
    }
}

    

