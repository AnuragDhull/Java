public class arrays_2d {
    public static void main(String[] args) {
        
        int[][] arr=  new int[2][2];

        arr[0][0]=2;
        arr[0][1]=2;
        arr[1][0]=2;
        arr[1][1]=2;
        

        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
    
}
