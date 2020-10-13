/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlinklist;

/**
 *
 * @author Henz Montera
 */
public class CircularLinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//------------------------------------------ Rotation A (Head to Tail) Singly Linked List --------------------------------------------        
        
        System.out.print("Rotation A (Head to Tail) Singly Linked List"+"\n"+"\n");

        slistcll<String> cll = new slistcll<>();    
        
        cll.addlast("1");
        cll.addlast("2");
        cll.addlast("3");
        
        System.out.print("Head: " + cll.head() +"\n"+ "Tail: " + cll.tail() +"\n"+ "Size: "+ cll.size() +"\n");
        cll.rotateA();
        System.out.print("Rotated: " + cll.rotatedA() + "\n"+"Head: " + cll.head() +"\n"+ "Tail: " + cll.tail() +"\n"+ "Size: "+ cll.size() +"\n" );
        cll.rotateA();
        System.out.print("Roatated: " + cll.rotatedA() + "\n"+"Head: " + cll.head() +"\n"+ "Tail: " + cll.tail() +"\n"+ "Size: "+ cll.size() +"\n" );
        cll.rotateA();
        System.out.print("Roatated: " + cll.rotatedA() + "\n"+"Head: " + cll.head() +"\n"+ "Tail: " + cll.tail() +"\n"+ "Size: "+ cll.size() +"\n" );
       
        
//----------------------------------------- Rotation B (Tail to Head)  Doubly Linked List --------------------------------------------- 

        System.out.print("\n");
        System.out.print("Rotation B (Tail to Head) Doubly Linked List"+"\n"+"\n");

        dlistcll<String> dcll = new dlistcll<>(); 

        dcll.addlast("1");
        dcll.addlast("2");
        dcll.addlast("3");

        System.out.print("Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n");
        dcll.rotateB();
        System.out.print("Rotated: " + dcll.rotatedB() + "\n"+"Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n" );
        dcll.rotateB();
        System.out.print("Roatated: " + dcll.rotatedB() + "\n"+"Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n" );
        dcll.rotateB();
        System.out.print("Roatated: " + dcll.rotatedB() + "\n"+"Head: " + dcll.head() +"\n"+ "Tail: " + dcll.tail() +"\n"+ "Size: "+ dcll.size() +"\n" );
 

    }
    
}
