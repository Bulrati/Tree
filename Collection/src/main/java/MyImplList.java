import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Свет
 * Date: 03.11.13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class MyImplList<E extends Comparable<E>> implements List<E> {
    private Node<E> previous;
    private Node<E> next;
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public MyImplList() {
        this.previous = new Node<E>();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (E e : this) {
            if (e.equals(o)) return true;
        }
        return false;

    }

    @Override
    public Iterator<E> iterator() {
            return new Iterator<E>() {

                Node<E> next = first;
                Node<E> node = null;

                @Override
                public boolean hasNext() {
                    return (node != last);
                }

                @Override
                public E next() {
                    if (next == null)
                        throw new NoSuchElementException();

                    node = next;

                    if (node == last)
                        next = null;

                    next = node.getNext();
                    return node.getT();
                }
                public void remove() {
                    throw new UnsupportedOperationException();
                }

                };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = getByIndex(i).getT();
        }
        return array;

    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> node = new Node<E>();
        Node<E> root = first;
        node.setT(e);
        if(first == null){
            first = node;
            last = node;
        }else{
            previous = first;
        }
        if(size() == 1){
            first.setNext(node);
            node.setPrevious(first);
            last =  node;
        }  else{
            last.setNext(node);
            node.setPrevious(last);
            last=node;
        }
        size++;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> node = first;
        for(int i=0; i<size(); i++){
            if(node.equals(o)){
                if(node == first){
                    first = node.getNext();
                    size--;
                    return true;
                }
                else if(node == last){

                    last = node.getPrevious();
                    size--;
                    return true;
                }else{
                node.getPrevious().setNext(node.getNext());
                    size--;
                return true;
                    }
            }
            node = node.getNext();

            }
        return false;
        }




    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
    private Node<E> getByIndex(int index) {
      /*  Node<E> node = null;
        if (!isEmpty() && (index >= 0 && index < size)) {
            node = first;
            for(int i=1; i<=index; i++){
                node = node.getNext();
            }
        }  */
        return null;
    }
    @Override
    public E get(int index) {
        Node<E> node = first;
        if(index <=size()){
        for(int i = 1; i < index; i++) {
            node = node.getNext();
        }
        return node.getT();
        }
        else{
            return null;
        }
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = first;
        E e;
        if(index <=size()){
            for(int i = 1; i < index; i++) {
                node = node.getNext();
            }
            e = node.getT();
            node.setT(element);
            return e;
        }
        else{
            return null;
        }

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        E e = get(index);
        remove(e);
        return e;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public void mergeSort() {
        MyImplList<E> tmpList = new MyImplList<E>();
        for(int i = 1; i <= size(); i++)
            tmpList.add(null);
        mergeSort(MyImplList.this, tmpList, 1, size());
    }

    private void mergeSort(MyImplList<E> a, MyImplList<E> tmpArray, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmpArray, left, center);
            mergeSort(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }

    private void merge(MyImplList<E> a, MyImplList<E> tmpArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop                                                  s
        while (leftPos <= leftEnd && rightPos <= rightEnd)
            if (a.get(leftPos).compareTo(a.get(rightPos)) <= 0)
                tmpArray.set(tmpPos++, a.get(leftPos++));
            else
                tmpArray.set(tmpPos++, a.get(rightPos++));
        while (leftPos <= leftEnd)
            // Copy rest of first half
            tmpArray.set(tmpPos++, a.get(leftPos++));
        while (rightPos <= rightEnd)
            // Copy rest of right half
            tmpArray.set(tmpPos++, a.get(rightPos++));
        // Copy tmpArray back
        for (int i = 1; i <= numElements; i++, rightEnd--)
            a.set(rightEnd, tmpArray.get(rightEnd));
    }


}
