import java.util.*;
  public class ascending {
    public static void sort012(int a[],int n){
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                //then swap element
                int temp= a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }

public static void printArray(int a[],int n){
    for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }
    System.out.println(" ");
}
public static void main(String [] args){
    int a[]={0,2,1,2,0};
    int n=a.length;
    sort012(a,n);
    System.out.println();
printArray(a,n);
}
}

            
        
    

