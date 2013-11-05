/**
 * Created with IntelliJ IDEA.
 * User: Свет
 * Date: 03.11.13
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
     MyImplList<Integer> lol = new MyImplList<Integer>();
        /*System.out.println(lol.size());
        lol.add(3.0);
        System.out.println(lol.size());
        lol.add(5.0);
        System.out.println(lol.size());
        lol.add(67.0);
        System.out.println(lol.size());
        for(Double n : lol){
               System.out.println(n);
        }
        System.out.println("get " + lol.get(1));
        lol.remove((Double)3.0);
        System.out.println(lol.size());
        for(Double n : lol){
            System.out.println(n);
        }
        System.out.println("get " + lol.get(2));
        Double b = lol.set(2,44.0);
        System.out.println("get " + lol.get(2));
        lol.set(2,b);
        System.out.println("get " + lol.get(2));*/
        lol.add(3);
        lol.add(7);
        lol.add(4);
        lol.add(1);

        for(Integer n : lol){
            System.out.print(n + " ");
        }
        System.out.println();
        lol.mergeSort();
        for(Integer n : lol){
            System.out.print(n + " ");
        }
    }
}
