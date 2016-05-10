/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.trees;

/**
 *
 * @author AULA1
 */
public class Test {
    
  public static void main(String args[]){
        Tree t = new Tree();
        int values[]={8,4,16,2,6,12,20,1,10,14,13,15};
        for (int i = 0; i < values.length ; i++) {
            t.add(values[i]);
        }
        int v = 15;
        System.out.println("Path to "+v+":");
        t.printPath(v);        
        //---------------------------
        if(t.isleaf(v)) {
            System.out.println(" "+v+" is a leaf");
        } else {
            System.out.println(" "+v+" doesn't a leaf");
        }
        int c = t.count();
        System.out.println("Total nodes: "+c);  
            
        System.out.println("Max: "+t.max());
        
        System.out.println("Min: "+t.min());  
        
        System.out.print("recursivePrint: ");
        t.recursivePrint();
        
        int r = t.recursiveCount();
        System.out.println("RecursiveCount: "+r);
        
        System.out.println("The height of tree is: " + t.height());
        
        System.out.println("The leafs are: ");
        t.printLeafsR();
        t.rDraw();
    }
  
  
  
}
