/**
 * This program provides an implementation of the Deque interface
 * and demonstrates it.
 * 
 * @author Ron Miller SER222 10-29-16
 * @version 1
 */
import java.util.NoSuchElementException;
    

public class BaseDeque<Item> implements Deque<Item> {
    Node head;
    Node tail;
    int count=0;

// helper class node to be used in conjuntion with BaseDeque
    public class Node{
        Item item;
        Node next;
        Node prev;
    /**  
     * Initializes new Node Object 
     * @param element the element stored in the node  
     */        
    // node contructor that accepts Item element     
      Node(Item element){
        next=null;
        prev=null;
        item=element;
          
      }
          /**  
     * Returns,next attribute
     * @return next attribute
     */
       Node getNext(){
          return next;
      }
     /**  
     * Returns,prev attribute
     * @return prev attribute
     */
       Node getPrev(){
           return prev;
       }
     /**  
     * Sets, next attribute
     * @param next attribute
     */       
       void setNext(Node n){
          next=n;
      }
     /**  
     * Sets, prev attribute
     * @param prev attribute
     */         
       void setPrev(Node p){
          prev=p;
       }
     /**  
     * Returns,item attribute
     * @return item attribute
     */       
       Item getItem(){
           return item;
       }
     /**  
     * Sets, item attribute
     * @param element, element stored as item attribute
     */           
       void setItem(Item element){
           item=element;
           
       }
    }
    /**
     * Program entry point for deque. 
     * @param args command line arguments
     */    
    public static void main(String[] args) {
        BaseDeque<Integer> deque = new BaseDeque<>();

        //standard queue behavior
        
        //standard queue behavior
        deque.enqueueBack(3);
        deque.enqueueBack(7);
        deque.enqueueBack(4);
        deque.dequeueFront();        
        deque.enqueueBack(9);
        deque.enqueueBack(8);
        deque.dequeueFront();
        System.out.println("size: " + deque.size());
        System.out.println("contents:\n" + deque.toString());   

        //deque features
        System.out.println(deque.dequeueFront());        
        deque.enqueueFront(1);
        deque.enqueueFront(11);                         
        deque.enqueueFront(3);                 
        deque.enqueueFront(5);         
        System.out.println(deque.dequeueBack());
        System.out.println(deque.dequeueBack());        
        System.out.println(deque.last());                
        deque.dequeueFront();
        deque.dequeueFront();        
        System.out.println(deque.first());        
        System.out.println("size: " + deque.size());
        System.out.println("contents:\n" + deque.toString());           
    }
    /**  
     * Adds one element to the front of this deque. 
     * @param element the element to be added to the front of the deque  
     */
    @Override
    public void enqueueFront(Item element) {
        // intitialize new Node object assigning element arument to item attribute
        Node node = new Node(element);
        //if the enque is empty its sets the first element and head,tail pointers
        if(isEmpty()){
            head=node;
            tail=node;
            count++;// count increased
        // if elements exist in enque, the element is added at tail
        }else{
            
            node.setPrev(tail);
            tail.setNext(node);
            tail=node;
            count++;  // count increased          
 
        }
        
    }
    /**  
     * Adds one element to the back of this deque. 
     * @param element the element to be added to the back of the deque  
     */
    @Override
    public void enqueueBack(Item element) {
        // intitialize new Node object assigning element arument to item attribute        
        Node node = new Node(element);
//if the enque is empty its sets the first Node and head,tail pointers        
        if(isEmpty()){
            head=node;
            tail=node;
            count++;// count increased 
        // if elements exist in enque, the Node is added at tail    
        }else{
            Node tmp=head;
            node.setNext(tmp);
            tmp.setPrev(node);
            head=node;
            count++;// count increased 
        }
        
    }
    /**  
     * Removes and returns the element at the front of this deque.
     * Throws an exception if the deque is empty.
     * @return the element at the front of this deque
     * @throws NoSuchElementException if the deque is empty
     */
    @Override
    public Item dequeueFront() throws NoSuchElementException {
        //creates temp Node
        Node temp;
        // check if empty, throw error if user attempts to Dequeue empty Deque
        if(isEmpty()){
            throw new NoSuchElementException("Enqueue");
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

        return temp.getItem();// return the Item removed
    }
    /**  
     * Removes and returns the element at the back of this deque.
     * Throw an exception if the deque is empty.
     * @return the element at the back of the deque. 
     * @throws NoSuchElementException if the deque is empty
     */
    @Override
    public Item dequeueBack() throws NoSuchElementException {
        //creates temp Node
        Node temp;
        // check if empty, throw error if user attempts to Dequeue empty Deque
        if(isEmpty()){
            throw new NoSuchElementException("Enque");
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
        return temp.getItem();
    
    }
    /**  
     * Returns, without removing, the element at the front of this deque.
     * Should throw an exception if the deque is empty.
     * @return the first element in the deque
     * @throws NoSuchElementException if the deque is empty
     */
    @Override
    public Item first() throws NoSuchElementException {
        //check if empty and throw error if empty
        if(isEmpty()){
            throw new NoSuchElementException("Enque");
        }
        //return first Item
        return tail.getItem();
    }
    /**  
     * Returns, without removing, the element at the back of this deque.
     * Should throw an exception if the deque is empty.
     * @return the last element in the deque
     * @throws NoSuchElementException if the deque is empty
     */
    @Override
    public Item last() throws NoSuchElementException {
        //check if empty and throw error if empty
        if(isEmpty()){
            throw new NoSuchElementException("Enqueue");
        }
        //return last Item
        return head.getItem();
    }
    /**  
     * Returns true if this deque is empty and false otherwise.
     * @return if deque empty
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
     * Returns the number of elements in this deque. 
     * @return the number of elements in the deque
     */
    @Override
    public int size() {
        return count;
    }
        /**  
     * Returns a string representation of this deque. The back element
     * occurs first, and each element is separated by a space. If the
     * deque is empty, returns "empty".
     * @return the string representation of the deque
     */
    @Override
    public String toString(){
        //temp Node for iterating
        Node tmp=head;
        String outString ="";
        //iterate through Enque and add Item to string
        while(tmp!=null){
            outString+=tmp.getItem()+" ";
            tmp=tmp.getNext();
        }
        //return produced string
        return outString;
    }
} 

