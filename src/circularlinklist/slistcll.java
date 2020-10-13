/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlinklist;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public class slistcll<E> implements scll<E> {
    
    private final SList<E> list;
    
    public slistcll(){
        list = new SList<>();
    }

    @Override
    public int size() {
         return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E head() throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("The List is Empty");
        }
        return list.first();
    }

    @Override
    public E tail() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("The List is Empty");
        }
        return list.last();
    }
//-------------------------------------------------------------------------------   ROTATION A (HEAD TO TAIL)
    @Override
    public E rotatedA() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("The List is Empty!");
        }
        return list.rotatedA();
    }


    @Override
    public E rotateA() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("There's Nothing to be rotate! ");
        }
        return list.rotateA();
    }

    @Override
    public void addlast(E element) {
        list.addLast(element); 
    }

    @Override
    public void addfirst(E element) {
        list.addFirst(element);
    }

    

   
}
