
package unity1.doubleCircularList;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main(String args[]){
        List l = new List();
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(10);
        l.add(12);
        l.remove(3);
        l.invert();
        l.print();       
    }
}
