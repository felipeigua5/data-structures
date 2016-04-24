/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simpleStructures;

/**
 *
 * @author Felipe
 */
public class Test {
    
    
    public static void testingList(){
        System.out.println("---------------List Testing-----------------");
        List l = new List();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(17);
             
        System.out.print("Initial values: ");
        l.print();
        int c = l.count();//cantidad de nodos
        System.out.println("Total nodes: "+c);
        System.out.print("The first element is: ");
        l.printFirstElement();
        System.out.print("The last element is: ");
        l.printLastElement();
        /*System.out.println("The Remove is: ");
        l.remove(1);
        l.print();
        System.out.println("The remove first element: ");
        l.removeFirstElement();
        l.print();
        System.out.println("The remove Last element: ");       
        l.removeLastElement();
        l.print();  */      
        /*System.out.println("The values after duplication: ");   
        l.duplicate();
        l.print();
        System.out.println("The values after duplication Mirror: ");   
        l.duplicateMirror();
        l.print();*/
        /*System.out.println("Values after invert: ");
        l.invert();
        l.print();
        System.out.println("Values with reversPrint(): ");
        l.reversPrint();*/
        
        System.out.println("The values with remove intercalated is");
        //l.removeIntercalated();
        //l.print();
        System.out.println("Elemts removed");
        System.out.println("Values after");
        //l.InsertZeros();
        l.DuplicateIntercalated();
        l.print();
               
    }
       
    public static void main (String [ ] args) {
        
        testingList();
        
    }
}
