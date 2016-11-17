/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public abstract class DoubleList<T> implements ListADT<T> {
    protected DoubleNode<T> head,tail;
    protected int count;


    // no arg contructor
    public DoubleList(){
        head=null;
        tail=null;
        count=0;

        
    }
        /**  
     * Removes and returns the first element from this list. 
     * 
     * @return the first element from this list
     */
    @Override
    public T removeFirst() {
        //creates temp Node
        DoubleNode<T> temp;
        // check if empty, throw error if user attempts to Dequeue empty Deque
        if(isEmpty()){
            throw new EmptyCollectionException("List");
         // remove node and point head towards next Node   
        }else{
            temp = head;
            if(temp.getNext()!=null){
                head=head.getNext();
                head.setPrev(null);
                count--;//decrement
            }else{
                head=null;
                tail=null;
                count=0;
                
            }
        }
        return temp.getElement();
    
    }        
        
    
    /**  
     * Removes and returns the last element from this list. 
     *
     * @return the last element from this list
     */
    @Override
    public T removeLast() {
        //creates temp Node
        DoubleNode<T> temp;
        // check if empty, throw error if user attempts to Dequeue empty Deque
        if(isEmpty()){
            throw new EmptyCollectionException("List");
            // remove node and point tail towards previous Node
        }else{
            temp = tail;
            if(temp.getPrev()!=null){            
                tail=tail.getPrev();
                tail.setNext(null);
                count--;//decrement  
            }else{
                tail=null;
                head=null;
                count=0;
            }
          
        }

        return temp.getElement();// return the Item removed        
    }
    /**  
     * Removes and returns the specified element from this list. 
     *
     * @param element the element to be removed from the list
     */
    @Override
    public T remove(T element) {
        boolean found=false;
     DoubleNode<T> temp=head;
     while(temp!=null){
         if(element.equals(temp.getElement())){
             found=true;
             //if element is first element
             if(temp.getPrev()==null){
                return removeFirst();
                //if element is last element
             }else if(temp.getNext()==null){
                 return removeLast();
             }
             //if element in the middle
             else{
             temp.getPrev().setNext(temp.getNext());
             temp.getNext().setPrev(temp.getPrev());
             count--;
             break;
             }
         }
             temp=temp.getNext();
         
         
     }
     //if element is not found
     if(!found){
         throw new ElementNotFoundException("list");
     }
     return temp.getElement();
    }
    /**  
     * Returns a reference to the first element in this list. 
     *
     * @return a reference to the first element in this list
     */
    @Override
    public T first() {
        return head.getElement();
    }
    /**  
     * Returns a reference to the last element in this list. 
     *
     * @return a reference to the last element in this list
     */
    @Override
    public T last() {
        return tail.getElement();
    }
    /**  
     * Returns true if this list contains the specified target element. 
     *
     * @param target the target that is being sought in the list
     * @return true if the list contains this element
     */
    @Override
    public boolean contains(T target) {
        //temp for iterator
        DoubleNode<T> temp = head;
        //
        boolean contain=false;
        //search for element 
        while(temp!=null){
            if(target==temp.getElement()) {
                contain=true;
            }  
        }
        return contain;
    }
    /**  
     * Returns true if this list contains no elements. 
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if(head==null){
            empty=true;
        }
        return empty;       
    }
    /**  
     * Returns the number of elements in this list. 
     *
     * @return the integer representation of number of elements in this list
     */
    @Override
    public int size() {
        return count;
    }
    
}
