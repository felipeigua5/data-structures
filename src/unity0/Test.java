/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author AULA1
 */
public class Test {
    
    public static void main (String [ ] args) {       
        testingList();
        testingStacks();
        testingQueues();       
    }
    
    public static void testingList(){
        System.out.println("*********Testing List*********");
        List l = new List();
        l.add(55);
        l.add(15);
        
        l.add(20);
        System.out.print("The items of list are: ");
        l.print();
        
        System.out.println("\nThe element remove was: " + l.remove(20));
        System.out.print("The current list is: ");
        l.print();
        System.out.println();
    }
    
    public static void testingQueues () {
        System.out.println("*********Testing Queues*********");
        Queue q = new Queue();
        for(int i = 1 ; i<= 20 ; i++){
            q.add(i);
        }
        System.out.print("Initial Values: ");
        q.print();
        int d = q.remove();
        System.out.println("The element removed was: " + d);
        System.out.print("Current values: ");
        q.print();
    }
    public static void testingStacks (){
        System.out.println("*********Testing Stacks*********");
        Stack s = new Stack();
        
        s.add(10);
        s.add(20);
        s.add(30);
        
        s.print(); 
        s.remove();
        s.print();
        
        for(int i = 2; i < 20 ; i+=2){
            s.add(i);
        }       
        s.print();
    }
}
