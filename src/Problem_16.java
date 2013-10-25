
public class Problem_16 {

    int mas[]=new int[1000];
    int max=0;

    public void umnozenie(int mas[]){
        int i=0;
        int var=0;

        int counter=0;
        boolean plus= false;
        while(counter<=1000 )     {
            // System.out.println(mas[i]);
            var = mas[i] * 2;

            //System.out.println(var);
            if(plus==true)   {
                //System.out.println("true");
                var++;
                //System.out.println(var);
                plus=false;
            }
            if(var>9){
                //System.out.println(">9");
                mas[i]=var%10;
                plus=true;
                //i++;
            }
            else{
                // System.out.println("<9");
                mas[i]=var;
            }
            if (  (mas[i + 1] == 0) && (plus == false) && (i+1>max)){
                i=0;
                counter++;
                System.out.println("new degree");
            }
            else{i++;
                if(i>max){
                    max=i;}
            }
            //System.out.println(mas[0] + " " + mas[1] + " " + mas[2] + " " + mas[3] + " " + mas[4] + " ");
            //System.out.println("end of cycle");
        }
    }



    public static void main(String[] args) {
        Problem_16 L = new Problem_16();
        for(int j=0;j<L.mas.length;j++){
            L.mas[j]=0;
        }
        L.mas[0]=2;

        L.umnozenie(L.mas);

        long result=0;
        for(int j=0;j<L.mas.length;j++){
            result = result+L.mas[j];
        }


        System.out.print(result);

    }

}
