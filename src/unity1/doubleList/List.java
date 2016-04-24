
package unity1.doubleList;

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
        }       
        else{
            Node aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = n;
            n.back = aux;
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
        
        if(head == null){
            System.out.println(-1);
        }else{
            System.out.println(head.data);
        }      
    }
    
     public void PrintLastElement(){
        
        if(head==null){
            System.out.println("-1");
        }       
        else{           
           Node aux = head;
           while(aux.next!=null){
               aux=aux.next;
           }
            System.out.println(" " + aux.data);
        }       
    }
    
    public void print(){
        Node aux = head;
        while(aux != null){
            System.out.print(" "+aux.data);
            aux = aux.next;
        }
        System.out.println();
    }
    
    public void reversePrint(){
        if(head == null) return;
        Node aux = head;
        while(aux.next != null){
            aux = aux.next;
        }
        while(aux != null){
            System.out.print(" "+aux.data);
            aux = aux.back;
        }
        System.out.println();
    }
    
    public void push(int d){
        Node n = new Node(d);
        if (head == null) {
            head = n;
        }else{
            n.next = head;
            head.back = n;
            head = n;
        }
    }
    
    
    public void remove(int index){
        
        Node current;
        current = head.next;
        
        if(index == 0){
            head = head.next;
        }           
        for(int i=0;i<index;i++) {
            current = current.next;
        }       
        current.back.next = current.next;
        current.next.back = current.back;
	
    }
    
    public void removeLast(){
        
        if(head==null)return;
        
        Node aux= head;
        Node p = head;
        
        while(aux.next!=null){
            aux=aux.next;           
            while(p.next!=aux){
                p=p.next;
            }
        }        
        p.next=null;
        aux.back=p;
        
    }
    
    public void removeFirst(){
        if(head == null) return;
        head = head.next;
        head.back = null;
    }
    
    public void invert(){
        
        Node aux = head;
        Node p = null;
        while (aux !=  null){
          p = aux.back;
          aux.back = aux.next;
          aux.next = p;              
          aux = aux.back;
        }      

        if(p != null ){
            head = p.back;
        }
        
    }
    
    public void duplicate(){
        if (head==null) return;
        Node aux=head;
        Node last=head;
        int c = count();
        int i = 0;
        while(last.next!=null) {
            last=last.next;   
        }
        while(i < c) {

            Node n= new Node(aux.data);

            n.back=last;
            last.next=n;
            n.next=null;

            aux=aux.next;
            last=last.next;
            i++;
        }
    }
    
    public void duplicateMirror(){
        if (head==null) return;
        Node aux=head,last=head;
        int c = count();
        while(last.next!=null) {
            last=last.next;
            aux=last;
        }
        while(aux!=null) {
            Node n= new Node(aux.data);
            n.back=last;
            last.next=n;
            n.next=null;
            last=last.next;
            aux= aux.back;
        }
    }
    
    public void duplicateIntercaled(){
        if(head == null)return;
        Node aux = head;
        Node p = head;
        while(aux != null){
            Node n = new Node(p.data);
            aux = aux.next;
            p.next = n;
            n.back=p;
            n.next = aux;
            p = aux;
        }
    }
}
