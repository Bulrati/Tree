
public class BSTree <T1 extends Comparable<T1>, T2>   {

    static class Node<T1,T2>{
        Node<T1,T2> left, right;
        T1 key;
        T2 value;
        Node(T1 key, T2 value){
            this.key=key;
            this.value=value;
        }
    }
        private Node<T1,T2> root = null;

    public void add(T1 ke, T2 val){
        Node<T1,T2> x=root, y = null;
        int cmp=0;
        while(x!=null){
            cmp = ke.compareTo(x.key);
            if(cmp==0){
                x.value=val;
                return;
            }else{
                y=x;
                if(cmp<0){
                    x=x.left;
                }else{
                    x=x.right;
                }
            }
        }

        Node<T1,T2> newNode = new Node<T1,T2>(ke,val);
        if(y==null){
            root=newNode;
        }else{
            if(ke.compareTo(y.key)<0){
                y.left=newNode;
            }
            if(ke.compareTo(y.key)>0){
                y.right=newNode;
            }
        }
    }

    public T2 get(T1 ke){
        Node<T1,T2> x = root;
        while(x!=null){
            int cmp= ke.compareTo(x.key);
            if(cmp==0){
                return x.value;
            }else{
                if(cmp<0){
                    x=x.left;
                }else{
                    x=x.right;
                }

            }

        }
        return null;
    }

    /*public void prosto(T1 ke){
         Node<T1,T2> x=root,y=null, del=null;
         int cmp = 0;
         while(x!=null){
             cmp = ke.compareTo(x.key);
             if(cmp==0){
                 del = x;
                 System.out.print(x.key + " del1 " + del.key);
                 del= del.left;
                 System.out.print(x.key + " del2 " + del.key);
             }
         }
     }
        */

    public void delete(T1 ke){
        Node<T1,T2> x=root,y=null,z=null, del=null, leftNode=null,rightNode=null;
        int cmp = 0;
        boolean pravo = false;
        while(x!=null){
            cmp = ke.compareTo(x.key);

            if(cmp==0){
                del = x;
                if(x.right==null && x.left==null){
                    if(pravo==true) {

                    y.right = null;
                    break;
                    }
                    if(pravo==false) {

                        y.left = null;
                        break;
                    }
                }
                if((x.left!=null) && (x.right==null)){

                    del=x.left;
                    rightNode=x.right;
                    while(del!=null){
                        z=del;
                        del=del.right;
                    }
                    if(pravo==true) {
                        y.right=z;
                        y.right.right = rightNode;

                        break;


                    }
                    if(pravo==false){
                        y.left=z;
                        y.left.right = rightNode;

                        break;

                    }


                }
                if((x.left==null && x.right!=null) ||
                        (x.left!=null && x.right!=null)){

                    del=x.right;
                    leftNode=x.left;
                    while(del!=null){
                        z=del;
                        del=del.left;
                    }
                    if(pravo==true) {
                        y.right=z;
                        y.right.left = leftNode;

                        break;

                    }
                    if(pravo==false){
                        y.left=z;
                        y.left.left = leftNode;

                        break;
                    }

                }

            }
            else{
                y = x;
                if(cmp<0){
                    y=x;
                    pravo = false;
                x=x.left;
            }
                if(cmp>0){
                    y=x;
                    pravo = true;
                    x=x.right;
                }

        }
    }
  }

    public void print(){
        Node<T1,T2> x=root;
        visiting(x);
    }

    private void visiting(Node x){
        Node<T1,T2> y=null;
        if(x!=null){
        System.out.print(x.key + " ");
        if(x.left!=null){
        y = x;
        x=x.left;
            visiting(x);
            x=y;
        }

        if(x.right!=null){

        x=x.right;

            visiting(x);

        }
    }
    }

    public T2  depthSearch(T1 ke){
        //System.out.println("depthSearch " + ke);
        Node<T1,T2> x=root;
     return poisk(x,ke);
    }

    private T2 poisk(Node x, T1 ke){
        Node<T1,T2> y=null;
        if(x!=null){

            if(ke.compareTo((T1) x.key)==0)
            {
                return (T2)x.value;}
            if(x.left!=null){

                y = x;

                x=x.left;

                T2 result =poisk(x,ke);
                if(result!=null){
                    return result;
                }
                x=y;
            }

            if(x.right!=null){

                x=x.right;

                T2 result =poisk(x,ke);
                if(result!=null){
                    return result;
                }

            }
        }
        return null;
    }

    public T2 breadthSearch(T1 ke){
        Node<T1,T2> x=root;

        int i=0,j=1;
        boolean trigger = true;
       Node<T1,T2>[] mas=new Node[1000];
        for(int k=0;k<1000;k++){
            mas[k]=null;
        }
        mas[0]=x;
        while(trigger!=false){
            trigger=false;

            if(ke.compareTo((T1) mas[i].key)==0){

                return (T2)mas[i].value;
            }else{
                if(mas[i].left!=null){

                  mas[j]=mas[i].left;

                    j++;
                    trigger=true;
                }
                if(mas[i].right!=null){
                    mas[j]=mas[i].right;

                    j++;
                    trigger=true;
                }
                if(mas[i+1]!=null){
                    trigger=true;
                }

                i++;
            }

        }
         return null;

    }
}
