package solution;

public class DynamicProgramming {
    // 메모리 사이즈
    final static int MEMOIZATION_SIZE = 6;

    static int normalCount = 0;
    static int dynamicCount = 0;
    static int dynamicCount2 = 0;

    public static void main(String[] args) {
        int n = 5;
        System.out.println("피보나치 수열 입력값 : " + n + " (0번째 부터 시작)");
        System.out.println();
        System.out.println("[일반 피보나치 수열 계산] " + "결과 값 : " + fibonacci(n) + " / 실행횟수 : " + normalCount);
        System.out.println("[동적 프로그래밍(1) 피보나치 수열 계산] " + "결과 값 : " + dpFibonacci(n) + " / 실행횟수 : " + dynamicCount);
        System.out.println("[동적 프로그래밍(2) 피보나치 수열 계산] " + "결과 값 : " + dpFibonacci2(n) + " / 실행횟수 : " + dynamicCount2);

    }

    /**
     * 재귀호출을 이용한 피보나치 수열 계산
     * @param n : 피보나치 수열 자리수
     * @return
     */
    public static int fibonacci(int n) {
        normalCount++;

        if (n == 0 || n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int[] memo = new int[MEMOIZATION_SIZE];

    /**
     * 동적 프로그래밍 알고리즘을 이용한 피보나치 수열 계산
     * 재귀 호출을 실행하지만 계산 결과를 메모리에 저장하면서 동작하고 이미 계산된 값이면 메모리에서 읽어서 사용
     * @param n : 피보나치 수열 자리수
     * @return
     */
    public static int dpFibonacci(int n) {
        dynamicCount++;

        if (n == 0 || n == 1) return 1;
        if (n < MEMOIZATION_SIZE && memo[n] != 0) return memo[n];

        return n < MEMOIZATION_SIZE ? memo[n] = dpFibonacci(n - 1) + dpFibonacci(n - 2) : dpFibonacci(n - 1) + dpFibonacci(n - 2);
    }

    static int[] memo2 = new int[MEMOIZATION_SIZE];
    static boolean pre = true;

    /**
     * 동적 프로그래밍 알고리즘을 이용한 피보나치 수열 계산 (점화식 추가 버전)
     * 메모리 크기 내에서는 재귀호출을 하지 않고 점화식을 이용해 미리 계산해서 메모리에 저장
     * 메모리 크기를 초과하는 경우에만 재귀호출을 실행하며 이 경우에도 이미 계산된 값이 나오면 메모리에서 읽어서 사용
     * @param n : 피보나치 수열 자리수
     * @return
     */
    public static int dpFibonacci2(int n) {
        dynamicCount2++;

        if (pre) {
            memo2[0] = 1;
            memo2[1] = 1;

            for (int x = 2; x <= n && x < MEMOIZATION_SIZE; x++) {
                memo2[x] = memo2[x - 1] + memo2[x - 2];
            }
            pre = false;
        }

        if (n < MEMOIZATION_SIZE && memo2[n] != 0) {
            return memo2[n];
        }
        return dpFibonacci2(n - 1) + dpFibonacci2(n - 2);
    }
}
