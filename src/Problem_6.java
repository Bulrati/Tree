
public class Problem_6 {


    public static void main(String[] args) {
        int result = 0;
        int sum1=0,sum2=0,sum3=0;
        for(int i=1;i<101;i++){
            sum1+=i*i;
            sum2+=i;
        }

        sum3=(int)Math.pow(sum2,2)-sum1  ;
        System.out.println(sum3);

    }

}
