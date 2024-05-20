class Solution {
    public boolean isValidSudoku(char[][] board) {
    Set<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char val = board[row][column];
                if (val != '.') {
                    if (!set.add(val + " in row " + row) ||
                        !set.add(val + " in column " + column) ||
                        !set.add(val + " in block " + (row / 3) + "," + (column / 3)))
                            return false;
                }
            }
        }
        return true;
    }
}
