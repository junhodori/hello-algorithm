package test;

public class Test {
    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        Test test = new Test();
        int result = test.solution(d, budget);
        System.out.println(result);
    }

    public int solution(int[] d, int budget) {

        for (int x = 0; x < d.length; x++) {
            int min = x;
            for (int y = x + 1; y < d.length; y++) {
                if (d[y] < d[min]) {
                    min = y;
                }
            }

            int temp = d[x];
            d[x] = d[min];
            d[min] = temp;
        }

        int answer = 0;

        for (int x = 0; x < d.length; x++) {
            budget -= d[x];

            if (budget >= 0) {
                answer = x + 1;
            }
        }


        return answer;
    }

}
