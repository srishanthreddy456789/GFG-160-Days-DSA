public class Main {
    public static int maxPartition(String s) {
        int n = s.length();
        int partitions = 0;
        boolean[] visited = new boolean[26];

        for (int i = 0; i < n; ++i) {
            visited[s.charAt(i) - 'a'] = true;
            boolean isPartition = true;

       
            for (int j = i + 1; j < n; ++j) {
                if (visited[s.charAt(j) - 'a']) {
                    isPartition = false;
                    break;
                }
            }

            if (isPartition)
                partitions++;
        }

        return partitions;
    }
}
