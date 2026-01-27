class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> l1 = new ArrayList<>();
        int m = mat.length - 1;
        int n = mat[0].length - 1;
        int srow = 0, erow = m;
        int scol = 0, ecol = n;

        while (srow <= erow && scol <= ecol) {
            // top
            for (int j = scol; j <= ecol; j++)
                l1.add(mat[srow][j]);

            // right
            for (int i = srow + 1; i <= erow; i++)
                l1.add(mat[i][ecol]);

            // bottom
            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow)
                    break;
                l1.add(mat[erow][j]);
            }

            // left
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol)
                    break;
                l1.add(mat[i][scol]);
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return l1;

    }
}