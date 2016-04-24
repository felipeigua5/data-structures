
package unity1.minedzone;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Felipe
 */
public class Zone extends JFrame{
   
   private Mine head,current;
   
   public Zone(){
       setTitle("zona minada");
       setSize(500,400);
       launchEvents();
       setVisible(true);
       head = current = null;
   }
   
   public void addMine(int x,int y){
       Mine n = new Mine(x, y, this);
       
       if( head == null ){
           head = n;
       }else{
           Mine aux = head;
           while(aux.next != null){
               aux = aux.next;
           }
           aux.next = n;
           n.back = aux;
       }      
       current = n;
   }
   
   public void goForward(){
       if( current.next != null ){
           current = current.next;
       }
   }
   
   public void goBack(){
        if( current.back != null ){
           current = current.back;
       }
   }
   
   public void explode(){
       if(current != null){
           current.state = true;
       }
   }
   
   public void paint(Graphics g){
       if( head == null ){
           return;
       }       
       Mine aux = head;      
       while(aux != null){
           aux.paint(g, aux == current);
           aux = aux.next;
       }
   }
   
   public void launchEvents(){
       addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
               System.exit(0);
           }
       });
       
       addMouseListener(new MouseListener() {
          
           public void mouseClicked(MouseEvent e) {
               addMine(e.getX(), e.getY());
               repaint();
           }

           public void mousePressed(MouseEvent e) {
               
           }
         
           public void mouseReleased(MouseEvent e) {
           
           }
          
           public void mouseEntered(MouseEvent e) {
              
           }
         
           public void mouseExited(MouseEvent e) {
              
           }
       });
       
       addKeyListener(new KeyListener() {

           public void keyTyped(KeyEvent e) {          
           }
           
                    public void keyPressed(KeyEvent e) {
               switch(e.getKeyCode()){
                   case KeyEvent.VK_RIGHT: goForward(); break;
                   case KeyEvent.VK_LEFT: goBack();    break;
                   case KeyEvent.VK_ENTER: explode(); break;
               }
           }
          
           public void keyReleased(KeyEvent e) {
               
           }
       });
   }
   
   public static void main(String args[]){
       new Zone();
   }
}
