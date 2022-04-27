import java.util.*;
class Main{
    public static void printArr(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void swap(int [] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void descendingArray(int [] array){
        for(int i=0; i<array.length-1;i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]<array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }
    public static void main(String [] args) {
        try(Scanner sc = new Scanner(System.in)){
            int N=sc.nextInt();
            int [] array=new int[N];
            for(int i=0; i<N; i++){
                array[i]=sc.nextInt();
            }
            descendingArray(array);
            printArr(array);
        }
        
    }
}
    

