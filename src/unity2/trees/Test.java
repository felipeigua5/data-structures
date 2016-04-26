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
    
    public static void main (String args[]){ 
    tree t = new tree();
    int values[]= {8,4,16,2,6,12,20,1,10,14,13,15 };
    for (int i=0; i<values.length; i++){
    t.add(values[1]);
}
    int v=13;
    System.out.print("Path to"+ v + ":");
    t.printpath(v);
    
    if(t.isLeaf(v)){
        System.out.println("");
    }else{
    System.out.print("");   
}
    System.out.print("print tree");
    t.print();
    System.out.print("");
    
    t.Max();
    t.Min();
   // t.Printleafs();
    t.Count();
    System.out.println("recursive print");
    t.recursivePrint();
    
    t.recursivePrint();
    System.out.println("recursive count");
    int r = t.recursiveCount();
    System.out.println("total node"+ r);
    
    }  
    
}
