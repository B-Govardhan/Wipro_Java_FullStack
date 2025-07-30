package ArrayCom;

public class Add2Matrix {
    public static void main(String[] args){
        int[][] A={
                {9,8,7,13},
                {4,5,6,8},
                {3,2,1,45}
        };

        int [][] B={
                {4,8,5,5},
                {64,8,46,4},
                {9,5,1,97}
        };

        int [][] out=new int[A.length][A[0].length];

        for (int i=0; i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                out[i][j]=A[i][j]+B[i][j];
            }
        }

        for (int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(out[i][j]+" ");
            }
        }



    }


}
