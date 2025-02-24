public class arrays_isSorted {
    public static void main(String[] args) {
        int[] arr ={22,33,11,8,66,4,1};
        boolean isSorted=true;

        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
            }
        }

        System.out.println(isSorted);
    }
}
