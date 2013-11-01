import static org.junit.Assert.assertEquals;
import org.junit.Test;
import tree.BTree;
import tree.*;

public class Testa {

    @Test
    public void testAdd() {
        BTree<Integer,Integer> root = new BTree<Integer, Integer>();
        root.add(5,12);
        int a = root.get(5);
        assertEquals(a, 12);
}
    @Test
    public void testDelete() {
        BTree<Integer,Integer> root = new BTree<Integer, Integer>();
        root.add(5,12);
        root.add(3,4);
        root.delete(3);
        assertEquals(root.get(3),null);
    }

}
