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
public interface dcll<E> {
    
    int size();
    boolean isEmpty();
    
    E head() throws EmptyListException;
    E tail()throws EmptyListException;
    E rotatedB() throws EmptyListException;
    E rotateB() throws EmptyListException;
    
    void addlast(E element);
    void addfirst(E element);
    
    
}
