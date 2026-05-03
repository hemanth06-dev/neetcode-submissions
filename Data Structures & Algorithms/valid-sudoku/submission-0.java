class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> seen;

        for(int i = 0; i < board.length;i++){
            seen = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.') continue; 
                if(seen.contains(board[i][j])) return false;
                seen.add(board[i][j]);
            }
        }
        for(int i = 0; i < board.length;i++){
            seen = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[j][i] == '.') continue;
                if(seen.contains(board[j][i])) return false;
                seen.add(board[j][i]);
            }
        }

        for(int sq = 0; sq < 9; sq++){
            seen = new HashSet<>();
            for(int i =0; i < 3; i++){
                for(int j = 0; j < 3; j++){

                    int r = (sq / 3) * 3 + i;
                    int c = (sq % 3) * 3 + j;
                    if(board[r][c] == '.') continue;
                    if(seen.contains(board[r][c])) return false;
                    seen.add(board[r][c]);

                }
            }
        }
        return true;
        

        
    }
}
