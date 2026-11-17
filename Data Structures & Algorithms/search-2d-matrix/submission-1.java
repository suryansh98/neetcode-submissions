class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int startR = 0, startC = 0, endC = matrix[0].length - 1, endR = matrix.length - 1;


        while(startR < endR){

            int midR = (startR + endR) / 2;
           

            if(matrix[midR][0] == target)
                return true;
            else if(matrix[midR][endC] < target){
                startR = midR + 1;
            }
            else if(matrix[midR][0] < target)
            {
                startR = midR;
                break;
            }
            else
                endR = midR - 1;

        }


        while(startC <= endC){

            int midC = (startC + endC) / 2;

            if(matrix[startR][midC] == target)
                return true;
            else if(matrix[startR][midC] < target)
                startC = midC + 1;
            else 
                endC = midC - 1;
        }

        return false;



    }
}
