package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        int i ;
        for (i = firstBoarder;firstBoarder <= secondBoarder; i++){
        sum = sum + i;
        }
        System.out.println(sum);
    }

}
