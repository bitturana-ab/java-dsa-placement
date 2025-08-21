
class StrictlySorted {

    // strictly sorted : not equals any number
    private static boolean isSorted(int arr[], int indx) {
        if (indx >= arr.length - 1) {
            return true;
        }
        if (arr[indx] >= arr[indx + 1]) {
            return false;
        }
        return isSorted(arr, indx + 1);
    }

    public static void main(String[] args) {
        int array[] = {25, 28, 34, 54, 56};
        System.out.println("Result is : " + isSorted(array, 0));
    }
}
