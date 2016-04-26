
package unity2.trees;

/**
 *
 * @author Felipe
 */
public class Tree {
    private Node root;
    
    public Tree() {
        root = null;
    }
    
    public void add(int d) {
        Node n=new Node(d);
        if(root==null) {
            root=n;
        } else {
            Node aux=root, p=null;
            while(aux !=null) {
                if(d < aux.data) {
                    p=aux;
                    aux=aux.left;
                } else if(d > aux.data) {
                    p=aux; aux = aux.right;
                } else {
                    return;
                }
            }
            if(d < p.data) {
                p.left =n;
            } else {
                p.right =n;
            }
        } 
    }
    
    
    
    
    public void recursivePrint(){
        
        recursivePrint(root);
        System.out.println();
        
    }
    
    private void recursivePrint(Node r){
        
        if(r==null)return;
        recursivePrint(r.left);
        System.out.print(" " + r.data);
        recursivePrint(r.right); 
        
    }
    
    public int recursiveCount(){
        return recursiveCount(root);
    }
    
    private int recursiveCount(Node r){
        if(r==null)return 0;
        return recursiveCount(r.left) + 
               recursiveCount(r.right)+ 1;   
    }
    
}
