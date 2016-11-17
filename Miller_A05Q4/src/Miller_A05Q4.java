/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class Miller_A05Q4{ 

    /**
     * Program entry point for stack testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        
        System.out.println("STACK TESTING");
        
        System.out.println("The stack contains:\n" + stack.toString());
        
        stack.push(3);
        stack.push(7);
        stack.push(4);
        stack.pushLast(5);// test pushLast()
        System.out.println(stack.peek());
        stack.pop();        
        stack.push(9);
        stack.push(8);
        stack.pushLast(7);//test pushLast()
        System.out.println(stack.peek());        
        System.out.println(stack.pop());
        System.out.println(stack.peek());        
        
        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The stack contains:\n" + stack.toString());        
    }
    
    /**
     * Represents a linked implementation of a stack.
     *
     * @author Java Foundations 
     * @version 4.0
     */
    public static class LinkedStack<T> implements StackADT<T>{
        private int count;  
        private LinearNode<T> top; 
        private LinearNode<T> bottom;
        private String tempString = "";
        /**
         * Creates an empty stack.
         */
        public LinkedStack()
        {
            count = 0;
            top = null;
            bottom = null;
        }
    
        /**
         * Adds the specified element to the top of this stack.
         * @param element element to be pushed on stack
         */
        public void push(T element)
        {
            LinearNode<T> temp = new LinearNode<T>(element);
    
            temp.setNext(top);
            top = temp;
            count++;
        }
        /** --Caution-- this method is not part of StackADT interface and may cause
         * non-standard results
         * Adds the specified element to the bottom of the stack
         * @param element element to be pushed on stack
         */
        
        public void pushLast( T element){
            //create some temporary nodes
                LinearNode<T> tmp = new LinearNode<T>(element);
                LinearNode<T> tmp1 = new LinearNode<T>(null);
                tmp1 = top;
                //cycle to bottom of stack
                while (top.next != null) {
                top = top.next;
    }
                     // set bottom link
                     top.setNext(tmp);
                     // go back to top
                     top=tmp1;
                     //increment list
                     count++;
                     
      
   }

            
            
            
            
            
            
       
    
        /**
         * Removes the element at the top of this stack and returns a
         * reference to it. 
         * @return element from top of stack
         * @throws EmptyCollectionException if the stack is empty
         */
        public T pop() throws EmptyCollectionException
        {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
    
            T result = top.getElement();
            top = top.getNext();
            count--;
     
            return result;
        }
       
        /**
         * Returns a reference to the element at the top of this stack.
         * The element is not removed from the stack.  
         * @return element on top of stack
         * @throws EmptyCollectionException if the stack is empty  
         */
        public T peek() throws EmptyCollectionException
        {
            if(isEmpty()){
                throw new EmptyCollectionException("stack");}
            
            return top.getElement();
        }
    
        /**
         * Returns true if this stack is empty and false otherwise. 
         * @return true if stack is empty
         */
        public boolean isEmpty()
        {
            // since linked if top is null stack is empty
            return (top == null);
        }
     
        /**
         * Returns the number of elements in this stack.
         * @return number of elements in the stack
         */
        public int size()
        {
            //seems to simple but works
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
               
       
    if (!isEmpty()) {
        for(int i = 0;i<size();i++){
            tempString += "\n" + String.valueOf(top.getElement())+"\n";
            top = top.getNext();
        }
        return tempString;
    }else{
    return "empty";
    }
}
        
    }

        
    
    
    public static class EmptyCollectionException extends RuntimeException{
    /**
     * Sets up this exception with an appropriate message.
     * @param collection the name of the collection
     */
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
    }

    public static class LinearNode<T>{
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
//    
}
    
    

