public class arrays_sum{
    public static void main(String[] args) {
        float [] arr ={1,2,3,4,5};
        float sum =0;


        for(int i=0;i<arr.length;i++)
        {
            sum=sum +arr[i];
        }
        System.out.println(sum);
    }
}