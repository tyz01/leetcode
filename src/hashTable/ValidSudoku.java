package hashTable;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board.length; k++) {
                    for (int l = 0; l < board.length; l++) {
                        if (i == k && j == l) {
                            continue;
                        }
                        if (board[i][j] != '.' && board[k][j] != '.' && board[i][l] != '.') {
                            System.out.println(board[i][j] + ", " + board[k][j]);
                            System.out.println(i + ":" + j + ", " + k + ":" + j);
                            if (board[i][j] == board[k][j]) {
                                System.out.println("lol");
                                if (board[i][j] == board[i][l]) {
                                    isValid = false;
                                    break;
                                }
                            }
                            if (board[i][j] == board[i][l]) {
                                if (board[i][j] == board[k][j]) {
                                    isValid = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return isValid;
    }
}
