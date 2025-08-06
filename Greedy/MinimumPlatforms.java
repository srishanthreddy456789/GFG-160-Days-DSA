
class GfG {

    static int minPlatform(int[] arr, int[] dep) {
        int n = arr.length;
        int res = 0;

        for (int i = 0; i < n; i++) {

            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)

                    if (arr[i] >= arr[j] && dep[j] >= arr[i]) {
                        cnt++;
                    }
            }

            res = Math.max(cnt, res);
        }
        return res;
    }
}
