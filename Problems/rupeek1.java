import java.util.*;

class Main {

    public static long solution(int N, int k, List<Integer> cost, List<Integer> sell) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long pl = sell.get(i) - cost.get(i);
            if (pl > 0) {
                mp.put(cost.get(i), (int) pl);
            }
        }

        long res = k;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (k >= entry.getKey()) {
                k += entry.getValue();
            }
        }

        return k - res;
    }

    public static void main(String[] args) {
        int N = 5;
        int k = 3;
        List<Integer> cost = Arrays.asList(9, 1, 10, 8, 9);
        List<Integer> sell = Arrays.asList(8, 7, 8, 8, 8);

        long result = solution(N, k, cost, sell);
        System.out.println("Maximum profit: " + result);
    }
}
