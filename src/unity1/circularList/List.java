/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.circularList;

/**
 *
 * @author Felipe
 */
public class List {
    private Node head;
    
    public List(){
        head = null;        
    }
    
    public void add(int d){       
        Node n = new Node(d);
        if (head == null) {
            head = n;
        }else{
            Node aux = head;
            while(aux != head){
                aux = aux.next;
            }
            n.next = head;
            aux.next = n;
        }       
    }
    
    public void print(){
        
        if(head == null)return;
        Node aux = head;
        do{
            System.out.println(" "+aux.data);
            aux = aux.next;
        } while(aux != head);
        System.out.println("");        
    }   
}
