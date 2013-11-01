package tree;

public class App
{


    public static void main(String[] args) {


        BTree<Integer,Integer> myTree = new BTree<Integer, Integer>();
        myTree.add(4,15);
        myTree.add(3,15);
        myTree.add(8,15);
        myTree.add(6,9);
        myTree.add(10,15);
        myTree.add(12,4);
        myTree.add(2,15);
        myTree.add(1,15);
        myTree.add(5,15);
        myTree.print();
        myTree.delete(3);


        System.out.println();
        myTree.print();

        }


    }
