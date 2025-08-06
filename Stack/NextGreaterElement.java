// Java implementation to find the next
// greater element using two loops
import java.util.ArrayList;

class GfG {

    static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        // Initialize res with -1 for all elements
        for (int i = 0; i < n; i++) {
            res.add(-1);
        }

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {

            // Check for the next greater element
            // in the rest of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    res.set(i, arr[j]);
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 8, 0, 1, 3 };

        ArrayList<Integer> res = nextLargerElement(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
