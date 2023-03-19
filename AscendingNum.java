import java.util.Scanner;

public class AscendingNum {
    public static void main(String args[]){
        int temp;
       // int[] arr = {9,6,4,3,7,2,1,8};
       System.out.print("Enter array size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       // Scanner sc = new Scanner(System.in);
       System.out.print("Enter value in array : ");
       int [] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
           // System.out.print(" "+ arr[i]);
        }

       /* */ for(int i = 0; i<arr.length;i++){

            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }System.out.print("Ascending order : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        } 
        for(int i=0; i<arr.length; i++){

            for(int j=0; j+i<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=arr[temp];
                }
            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.print("Descending order :  "+ arr[i]);
        }
    
    }
}
