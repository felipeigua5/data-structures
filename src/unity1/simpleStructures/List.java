
package unity1.simpleStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import unity1.simpleStructures.Node;

/**
 *
 * @author Felipe
 */
public class List {
    private Node head;
    
    List(){
        head=null;
    }
    
    public void add(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
        }
        else{
            Node aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = n;
        }
    }
    
    
    public int count(){
        int count = 0;
        Node aux = head;
        
        while(aux != null){
            count++;
            aux = aux.next;
        }       
        return count;
    }
    
    public void printFirstElement(){
        Node aux = head;
        if(aux == null){
            System.out.println(-1);
        }
        else{
            System.out.println(aux.data);
        }
    }
    
    public void printLastElement(){
            Node aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            int elem = aux.data;
            System.out.println(elem);        
    }
    
    
    public void print(){
        Node aux = head;
        
        while(aux != null){
            System.out.print(" " + aux.data);
            aux = aux.next;
        }       
        System.out.println();
    }
    
    public int remove(int index){
        if(head == null){return -1;}
        
        if(index == 0){
            head = head.next;
            return 0;
        }

        Node aux = head;
        Node p = null;
        int counter = 0;
        for(counter = 0; counter < index && aux != null; counter++){
            p = aux;
            aux = aux.next;
        }
        if(aux != null){
            p.next = aux.next;
        }
        return aux.data;
    }
    
    public void removeFirstElement(){
        if(head != null){
            head = head.next;
        }
       
    }
    
    public void removeLastElement(){
        if(head != null){
            Node aux = head;
            Node p = null;
            if(head.next == null){
                head = head.next;
            }
            else{
                while(aux.next != null){
                    p = aux;
                    aux = aux.next;
                }
                p.next = aux.next;
            }
        }
    }
    
    public void duplicate(){
        
        if(head == null){
            return;
        }
        Node last = head;
        Node aux = head;
        
        while(last.next != null){           
            last = last.next;
            
        }
        int c = count();
        for(int i = 0; i<c; i++){
            last.next = new Node(aux.data);
            aux = aux.next;
            last = last.next;            
        }      
    }
    
    public void duplicateMirror(){
        if(head == null){
            return;
        }
        Node last = head;
        Node aux = head;
        
        while(last.next != null){           
            last = last.next;
            
        }
        int c = count();
        for(int i = 0; i<c; i++){
            Node n = new Node(aux.data);
            n.next = last.next;
            last.next = n;
            aux = aux.next;           
        }
    }
    
    public void reversPrint(){
        if(head == null) return;
        Node ok = null;
        Node aux;
        
        do {            
            aux = head;
            while(aux.next != ok){
                aux = aux.next;
            }
            System.out.print("  " + aux.data);           
            ok = aux;
        } while (ok != head);
        System.out.println();
    }
    
    public void invert(){
        if(head == null) return;
        Node aux = head;
        Node head2 = null;
        
        while(head != null){
            aux = head;
            head = head.next;
            aux.next = head2;
            head2 = aux;
        }       
        head = head2;
    }
    
    
    public void removeIntercalated(){
        if(head == null) return;
        
        Node aux = head;
        
        while(aux != null && aux.next != null){
             aux.next = aux.next.next;
             aux = aux.next;
        }     
    }
    
    public void DuplicateIntercalated(){
        if(head==null) return;
        
        Node aux = head,p=head;
                                   
        while(aux != null){
                       
            Node n = new Node(p.data);
            aux=aux.next;
             p.next=n;
             n.next=aux;
             p=aux;         
        }       
    }
    
    public void removeRecurrents(){
        if(head == null)
            return;
        Node aux = head;
        Node current = aux.next;
        while(current != null){
            Node runner = head;
            while(runner != current){
                if(runner.data == current.data){
                    Node temp = current.next;
                    aux.next = temp;
                    current = temp;
                    break;
                }
                runner = runner.next;
            }
            if(runner == current){
                aux = current;
                current = current.next;
            }
        }
    }
    
   
    public void removeMiddle(){
        
        if(head == null) return;
        Node aux = head;
        int c = count()/2;
        
        int cont = 1;
        while(aux.next != null){
            cont++;
            aux = aux.next;
            if(cont == c){
                aux.next = aux.next.next;
            }           
        }
    }
    
    public int countOdds(){
        int odds = 0;
        Node aux = head;
        
        while(aux != null){
            if(aux.data % 2 == 1){
                odds++;
            }
            aux = aux.next;
        }       
        return odds;
    }
    
    public void InsertZeros(){
        
        if(head==null) return;
        
        Node aux = head,p=head;
                                   
        while(aux.next != null){
       
            Node n = new Node(0);
            aux=aux.next;
            p.next=n;
            n.next=aux;
            p=aux;
          
        }
    }   
}
    