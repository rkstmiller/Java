
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
public class Miller_A05Q2 {
    /**
     * Program entry point for drop-out stack testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
        ArrayDropOutStack<Integer> stack = new ArrayDropOutStack<Integer>(4);
        
        System.out.println("DROP-OUT STACK TESTING");
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);       
        stack.push(5);               
        
        System.out.println("The size of the stack is: " + stack.size());        
        if(!stack.isEmpty())            
            System.out.println("The stack contains:\n" + stack.toString());
        
        stack.pop();        
        stack.push(7);
        stack.push(8);      
        
        System.out.println("The size of the stack is: " + stack.size());                
        if(!stack.isEmpty())            
            System.out.println("The stack contains:\n" + stack.toString());
    }
    
   public static class ArrayDropOutStack<T> implements StackADT<T>
    {
        private final static int DEFAULT_CAPACITY = 4;
        private int count;
        private int top;  
        private T[] stack;
        private int cap;// I added this to take input from constuctor for loop
        /**
         * Creates an empty stack using the default capacity.
         */
        public ArrayDropOutStack()
        {
            this(DEFAULT_CAPACITY);
        }
    
        /**
         * Creates an empty stack using the specified capacity.
         * @param initialCapacity the initial size of the array 
         */
        @SuppressWarnings("unchecked") //see p505.
        public ArrayDropOutStack(int initialCapacity)
        {   cap = initialCapacity;
            top = 0;
            stack = (T[])(new Object[initialCapacity]);
        }
    
        /**
         * Adds the specified element to the top of this stack, expanding
         * the capacity of the array if necessary.
         * @param element generic element to be pushed onto stack
         */
        public void push(T element)
        {
            //checks to see if array is full
            if (size() == cap ){ 
                // this cycles through array shifting indexes
                for( int i=0;i<cap-1;i++){
                    stack[i] = stack[i+1];
                }
                // this is required to make sure that top doesn't exceed bounds
                top--;
                
                }
            stack[top] = element;
            top++;
        }
    
        /**
         * Creates a new array to store the contents of this stack with
         * twice the capacity of the old one.
         */

        /**
         * Removes the element at the top of this stack and returns a
         * reference to it. 
         * @return element removed from top of stack
         * @throws EmptyCollectionException if stack is empty 
         */
        public T pop() throws EmptyCollectionException
        {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
    
            top--;
            T result = stack[top];
            stack[top] = null; 
    
            return result;
        }
       
        /**
         * Returns a reference to the element at the top of this stack.
         * The element is not removed from the stack. 
         * @return element on top of stack
         * @throws EmptyCollectionException if stack is empty
         */
        public T peek() throws EmptyCollectionException
        {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
    
            return stack[top-1];
        }
    
        /**
         * Returns true if this stack is empty and false otherwise. 
         * @return true if this stack is empty
         */
        public boolean isEmpty()
        {
            if (size() == 0){
                return true;
                
            }else{
            return false;
        }
        }
     
        /**
         * Returns the number of elements in this stack.
         * @return the number of elements in the stack
         */
        public int size()
                
        {       count = 0;
                for(int i = 0;i<stack.length;i++){
                if(stack[i] != null){
                    count++;
                }
            }
                return count;
        }

        /**
         * Returns a string representation of this stack. The string has the
         * form of each element printed on its own line, with the top most
         * element displayed first, and the bottom most element displayed last.
         * If the list is empty, returns the word "empty".
         * @return a string representation of the stack
         */
        public String toString(){
             StringBuilder sb = new StringBuilder();
    if (size() > 0) {
        for (int i = size() - 1; i > -1 ; i--) {
            sb.append(stack[i]).append(System.lineSeparator());
        }
        return sb.toString();
    } 
    return "This stack is empty";
}
                    
               
             
      
    }
    public static class EmptyCollectionException extends RuntimeException
{
    /**
     * Sets up this exception with an appropriate message.
     * @param collection the name of the collection
     */
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}
    public class LinearNode<T>
{
    private LinearNode<T> next;
    private T element;
 
    /**
     * Creates an empty node.
     */
    public LinearNode()
    {
        next = null;
        element = null;
    }
 
    /**
     * Creates a node storing the specified element.
     * @param elem element to be stored
     */
    public LinearNode(T elem)
    {
        next = null;
        element = elem;
    }
 
    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public LinearNode<T> getNext()
    {
        return next;
    }
 
    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setNext(LinearNode<T> node)
    {
        next = node;
    }
 
    /**
     * Returns the element stored in this node.
     * @return element stored at the node
     */
    public T getElement()
    {
        return element;
    }
 
    /**
     * Sets the element stored in this node.
     * @param elem element to be stored at this node
     */
    public void setElement(T elem)
    {
        element = elem;
    }
}
    public interface StackADT<T>{

    /**  
     * Adds the specified element to the top of this stack. 
     * @param element element to be pushed onto the stack
     */
    public void push(T element);
  
    /**  
     * Removes and returns the top element from this stack. 
     * @return the element removed from the stack
     */
    public T pop();

    /**  
     * Returns without removing the top element of this stack. 
     * @return the element on top of the stack
     */
    public T peek();
  
    /**  
     * Returns true if this stack contains no elements. 
     * @return true if the stack is empty
     */
    public boolean isEmpty();

    /** 
     * Returns the number of elements in this stack. 
     * @return the number of elements in the stack
     */
    public int size();

    /**  
     * Returns a string representation of this stack. 
     * @return a string representation of the stack
     */
    public String toString();


    }
}
    
    
