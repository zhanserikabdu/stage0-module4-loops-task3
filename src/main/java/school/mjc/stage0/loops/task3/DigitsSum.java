package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        if(t<0){
            int b = t*(-1);
            int sum;
            for(sum =0; b>0; sum = sum+b%10, b= b/10 );
            System.out.println(sum);
        }else{
            int sum2;
            for(sum2 =0; t>0; sum2 = sum2+t%10, t= t/10 );
            System.out.println(sum2);
        }
        }
    }
