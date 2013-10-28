package com.tree.app;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args) {

       /* BSTree<Integer,Integer> myTree = new BSTree<Integer,Integer>();
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


        System.out.println();  */
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
        //myTree.delete(3);
        //System.out.println(myTree.depthSearch(6));
        //System.out.println(myTree.breadthSearch(12));

    }
}
