package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum;
        for (sum = 0; t > 0; sum = sum + t % 10, t = t / 10);
        System.out.println(sum);
    }
}