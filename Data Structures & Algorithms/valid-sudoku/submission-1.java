class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Character>> square = new HashMap<>();

        for(int i = 0; i < 9; i++){

            rows.put(i, new HashSet<Character>());
            cols.put(i, new HashSet<Character>());
            square.put(i, new HashSet<Character>());
        }

        for(int row = 0; row < 9;row++){

            for(int col = 0; col < 9; col++){
                
                int sqrIndex = (row / 3) * 3 + col / 3;
                char ele = board[row][col];

                if(ele == '.')
                    continue; 
                    
                HashSet<Character> tempRow = rows.get(row);
                
                if(tempRow.contains(ele))
                    return false;
                else{
                    tempRow.add(ele);
                    rows.put(row, tempRow);
                }

                HashSet<Character> tempCol = cols.get(col);
                
                if(tempCol.contains(ele))
                    return false;
                else{
                    tempCol.add(ele);
                    cols.put(col, tempCol);
                }

                HashSet<Character> tempSq = square.get(sqrIndex);
                
                if(tempSq.contains(ele))
                    return false;
                else{
                    tempSq.add(ele);
                    square.put(sqrIndex, tempSq);
                }
            }
        }

        return true;
        
    }
}
