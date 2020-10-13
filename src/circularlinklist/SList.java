/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlinklist;

/**
 *
 * @author Enubs
 * @param <E>
 */
public class SList<E> {

    private SNode<E> head, tail;
    private int size;

    public SList() {
        head = null;
        tail = null;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public E first() throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        }
        return head.getElement();
    }
    public E last() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        }
        return tail.getElement();
    }   
    public void addFirst(E element) {
        SNode<E> newNode = new SNode<>(element, null);

        if (size() == 0) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    public void addLast(E element) {
         SNode<E> newNode = new SNode<>(element, null);       
        if (size() == 0) {
            head = newNode;         
            tail = newNode;         
        }        
         tail.setNext(newNode);     
        tail = newNode;       
        size++;
    }
    public E removeFirst() throws EmptyListException {
        SNode<E> temp = head;
        head = head.getNext();

        if (head == null) {
            throw new EmptyListException("");
        }

        temp.setNext(null);
        size--;

        return temp.getElement();
    }  
    //----------------------------------------------------------------------        ROTATION A (HEAD TO TAIL)
    public E rotatedA() throws EmptyListException{ 
        if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        }
        return tail.getElement();
    }    
    
    public E rotateA() throws EmptyListException{
        SNode<E> temp = head;
        head = head.getNext();
        if (head == null) {
            throw new EmptyListException("");
        }
        tail.setNext(temp);
        tail = temp;   
        return tail.getElement();     
    }
   
}
