package algorithms.excercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> column = new HashMap<>();
        HashMap<Integer, HashSet<Character>> square = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (row.containsKey(i) && !row.get(i)
                        .add(board[i][j])) {
                    return false;
                } else {
                    HashSet<Character> set = new HashSet<>();
                    set.add(board[i][j]);
                    row.put(i, set);
                }
                if (column.containsKey(j) && !column.get(i)
                        .add(board[j][i])) {
                    return false;
                } else {
                    HashSet<Character> set = new HashSet<>();
                    set.add(board[j][i]);
                    column.put(j, set);
                }
                if (square.containsKey(j) && !column.get(i)
                        .add(board[j][i])) {
                    return false;
                } else {
                    HashSet<Character> set = new HashSet<>();
                    set.add(board[j][i]);
                    column.put(j, set);
                }
            }

        }
        return true;
    }
}
