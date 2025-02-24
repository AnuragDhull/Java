public class matrix_add {
    public static void main(String[] args) {
        int [][] m1 = new int[2][2];
        int[][] m2 =new int[2][2];

        m1[0][0]  =2;
        m1[0][1]  =2;
        m1[1][0]  =2;
        m1[1][1]  =2;

        m2[0][0]  =2;
        m2[0][1]  =2;
        m2[1][0]  =2;
        m2[1][1]  =2;


        int [][] result= new int[2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0 ;j<2;j++)
            {
                result[i][j] = m1[i][j]+m2[i][j];
            }
        }

        // printing result

        for(int p=0;p<result.length;p++)
        {
            for(int q=0;q<result[p].length;q++)
            {
                System.out.println(result[p][q]);
            }
        }

    }
}
