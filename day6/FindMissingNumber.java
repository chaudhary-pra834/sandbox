import java.util.Scanner;
class FindMissingNumber {
    public static void swap(int arr [],int i,int correctpos){
        int temp=arr[i];
        arr[i]=arr[correctpos];
        arr[correctpos]=temp;
    }
    public static int missingNumber(int arr[],int size){
        for(int i=0;i<size;i++){
            int correctpos=arr[i]-1;
            while(arr[i]>0 && arr[i]<=size && arr[i]!=arr[correctpos]){
                swap(arr,i,correctpos);
                correctpos=arr[i]-1;
            }
        }
        for(int i=0; i<size; i++){
            if(i+1!=arr[i]){
                return i+1;
            }
        }
        return size+1;
    }
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number of value ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter value");
       for(int i=0; i<arr.length; i++){
           arr[i]=sc.nextInt();
       }
       missingNumbe(arr);
       print(arr);
       }
    
    }

