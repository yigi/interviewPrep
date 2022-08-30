package leetcode;

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
     
        char board[][] = 
        {
         {'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}
        };
        
        System.out.println(isValidSudoku(board));

}

public static boolean isValidSudoku(char[][] board) {
    HashSet<String> seen = new HashSet<>();
    
        for(int i=0; i<9; i++){
             for(int j=0; j<9; j++){
              if(board[i][j] != '.'){ 
                  char currentVal = board[i][j];
                   if(!(seen.add(currentVal + "found in row " + i)) ||
                      !(seen.add(currentVal + "found in column "+  j) ) ||
                      !(seen.add(currentVal + "found in sub box "+  i/3 + "-" + j/3)))
                       return false;
              }
          
           } 
        
        }
        return true;
    }

}