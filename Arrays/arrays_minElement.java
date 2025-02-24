public class arrays_minElement {
    public static void main(String[] args) {
        int [] arr= {55,22,33,44,54,5};
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=min)
            {
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
