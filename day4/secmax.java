class secmax{
    public static void main(String [] args) {
        int a[]={5,8,7,9,4,6};
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                second_max=max;
                max=a[i];
            }
            else if(a[i]>second_max && a[i]!=max){
                second_max=a[i];
            }
        }
       if(second_max==Integer.MIN_VALUE){
           System.out.println("element is not second_max");
       }else{
           System.out.println("secondmax value is a "+second_max);
       }
    }
}