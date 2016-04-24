/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.imageBrowser;

import javax.swing.ImageIcon;

/**
 *
 * @author Felipe
 */
public class ImageStore {   
    protected ImageFile head, current;
    
    public ImageStore(){
        head = null;
        current = null;
    }
    
    public void add(String name){
        ImageFile n = new ImageFile(name);
        if(head == null){
            head = n;
        }   else{
            ImageFile aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = n;
            n.back = aux;
        }   current = n;
    }
    
    public boolean goForward(){
        if(current.next != null){
            current = current.next;
            return true;
        }   else{
            return false;
        }   
    }
    
    public boolean goBack(){
        if(current.back != null){
            current = current.back;
            return true;
        } else{
            return false;
        }
    }
    
    public ImageIcon getCurrent(){
        if(current == null){
            return new ImageIcon();
        } else{
            return new ImageIcon(current.name);   
        }       
    }
}
