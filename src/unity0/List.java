
package unity0;

/**
 *
 * @author Felipe
 */
public class List {
    private int data[];
    private int top;
    
    public List(){
        data = new int[100];
        top = 0;
    }
    
    public void add(int d){
        data[top] = d;
        top++;
    }
    
    public void add (int d,int index){       
       top++;
       if(index<top){
            for(int i=top-1;i>=index;i--){
                data[i+1]=data[i];
            }
        data[index]=d;
       }
    }
    
    public int remove(int d){
        int i;
        for(i = 0; i < top; i++){
            if(data[i] == d){
                top--;
                break;                
            }
        }
        
        for(int j = i; j < top; j++){
            data[j] = data[j+1];
        }
        return data[top];
    }
    
    public void print(){
        for(int i = 0; i < top ; i++){
            System.out.print(" " + data[i]);            
        }
    }
}
