/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ron Miller SER 222 10-30-16
 * @param <T>
 */
public class DoubleNode<T> {
    
    private DoubleNode<T> prev;
    private DoubleNode<T> next;
    T element;
 /**
 * No argument constructor
 */
    DoubleNode(){
        prev=null;
        next=null;
        element=null;
    }
 /**
  * Constructor with argument e
 * @param e, element store as Node attribute
 */    
    DoubleNode(T e){
        prev=null;
        next=null;
        element=e;
    }
 /**
  * Returns Previous Node
 * @return prev, previous Node object
 */       
    DoubleNode<T> getPrev(){
        return prev;  
    }
 /**
 * Sets previous to DoubleNode p
 * @param p, previous Node object
 */     
    void setPrev(DoubleNode<T> p){
        prev=p;
          
    } 
   /**
  * Returns Next DoubleNode
 * @return next, next DoubleNode object
 */       
    DoubleNode<T> getNext(){
        return next;  
    }
 /**
 * Sets previous to DoubleNode p
 * @param n, next DoubleNode object
 */     
    void setNext(DoubleNode<T> n){
        next=n;       
    } 
  /**
 * Returns element 
 * @return element, 
 */       
    T getElement(){
        return this.element;
    }
 /**
 * Returns element
 * @param element, 
 */     
    void setElment(T e){
        element=e;
    }
    
    
    
}
