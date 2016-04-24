
package unity1.doubleList;

/**
 *
 * @author FELIPE
 */
public class Test {
    
    public static void main (String [] args){        
        testingList();
    }
  
    public static void testingList(){
        List l = new List();
        l.add(4);
        l.add(7);
        l.add(2);
        l.add(3);
        l.add(9);
        l.remove(1);
        l.print();
        //l.duplicate();
        //l.invert();
        //l.removeFirst();
    }
}
