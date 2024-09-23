package graphPractice.shortestpath;

public class FloydWarshal {

    // solving in-place
    public void shortest_distance(int[][] matrix)
    {
        // Code here
        int n=matrix.length;
        int m=matrix[0].length;
        final int INFINITE=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=INFINITE;
                }
            }
        }

        for(int k=0;k<n;k++){

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][k] < INFINITE && matrix[k][j] < INFINITE &&  matrix[i][k]+matrix[k][j] < INFINITE){
                        matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==INFINITE){
                    matrix[i][j]=-1;
                }
            }
        }



    }

}
