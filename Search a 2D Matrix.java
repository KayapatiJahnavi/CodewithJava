class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;        // number of rows
        int n = matrix[0].length;     // number of columns

        int left = 0;
        int right = m * n - 1;        // treat as 1D array

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int midElement = matrix[mid / n][mid % n]; // convert 1D index to 2D

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
