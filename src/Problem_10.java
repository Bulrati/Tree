
public class Problem_10 {
    public boolean prov(int a){
        int i=1;
        if(a%2==0)return false;
        else{
            for(i=a-2;i>1;i-=2){
                if(a%i==0)return false;

            }
        }
        return true;
    }


    public static void main(String[] args) {
        Problem_10 L = new Problem_10();
        int result = 0;
        boolean qw=false;
        for(int j=3;j<2000000;j++){
            qw = L.prov(j);
            if(qw==true)
            {result=result+j;}
        }
        result+=2;

        System.out.println();

    }

}
