import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testa {

  @Test
  public void testAdd() {
      MyImplList<Integer> lol = new MyImplList<Integer>();
      lol.add(3);
      lol.add(7);
      Integer result = lol.get(2);
      assertEquals(new Integer(7),result);
  }

    @Test
      public void testDeleteObject() {
        MyImplList<Integer> lol = new MyImplList<Integer>();
        lol.add(3);
        lol.add(7);
        lol.add(4);
        lol.remove(new Integer(7));
        Integer result = lol.get(2);
        assertEquals(new Integer(4),result);
    }

    @Test
    public void testDeleteIndex() {
        MyImplList<Integer> lol = new MyImplList<Integer>();
        lol.add(3);
        lol.add(7);
        lol.add(4);
        lol.remove(1);
        Integer result = lol.get(1);
        assertEquals(new Integer(7),result);
    }

    @Test
    public void testSize() {
        MyImplList<Integer> lol = new MyImplList<Integer>();
        lol.add(3);
        lol.add(7);
        lol.add(4);
        Integer result = lol.size();
        assertEquals(new Integer(3),result);
    }

    @Test
    public void testContain() {
        MyImplList<Integer> lol = new MyImplList<Integer>();
        lol.add(3);
        lol.add(7);
        lol.add(4);
        Boolean result = lol.contains(new Integer(4));
        assertEquals(true,result);
    }

    @Test
    public void testSort() {
        MyImplList<Integer> lol = new MyImplList<Integer>();
        lol.add(3);
        lol.add(7);
        lol.add(4);
        lol.add(1);
        lol.mergeSort();
        boolean result=false;
        if(lol.get(1)==1 && lol.get(2)==3 && lol.get(3)==4 && lol.get(4)==7 ){
         result = true;
        }
        assertEquals(true,result);
    }
}
