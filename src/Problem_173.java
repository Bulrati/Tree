
public class Problem_173 {

    int counter=0;
    int chislo=1000000;
    public void recurse(int maxStep, int var, int variant){


        if(variant == 1){
            var=4*maxStep + var;
            if((var<=chislo) && (maxStep>=3)){
                maxStep-=2;
                counter++;
                recurse(maxStep,var, 1);
            }
        }

        if(variant == 2){
            var=4*maxStep + var;
            if((var<=chislo) && (maxStep>=2)){
                maxStep-=2;
                counter++;
                recurse(maxStep,var, 2);
            }
        }
    }



    public static void main(String[] args) {
        Problem_173 L = new Problem_173();
        int result=0;
        int var=4;
        int maxStep=0,maxStep2=0;
        maxStep = L.chislo/4;
        if(maxStep%2!=0){
            maxStep2 = maxStep-1;
        }
        else if(maxStep%2==0){

            maxStep2=maxStep;
            maxStep=maxStep-1;
        }


        while (maxStep>=3){
            var=0;
            L.recurse(maxStep,var,1);
            maxStep-=2;
        }

        while (maxStep2>=2){
            var=0;
            L.recurse(maxStep2,var,2);
            maxStep2-=2;
        }

        System.out.println("Sum:" + L.counter);
    }
}
