public class arrays {
    public static void main(String[] args) {
        
        int[] arr= new int[5];
        arr[0] =1;
        arr[1]=2;
        arr[2]=5;
        arr[3]=4;
        arr[4]=33;

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int elements :arr)
        {
            System.out.println(elements);
        }

    }
}
