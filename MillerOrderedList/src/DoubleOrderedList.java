
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class DoubleOrderedList<T> extends DoubleList<T> implements OrderedListADT<T> {
    
    /**
     * Adds the specified element to this list at the proper location
     *
     * @param element the element to be added to this list
     */
    @Override
    public void add(T element) {
        // create new Node with elements
        DoubleNode<T> node=new DoubleNode<T>(element);
        // if list is empty set head and tail 
        if(isEmpty()){
            head=node;
            tail=node;
            count++; 
           
        }else{
            //create variable element cast as integer for comparison
            int compare=(Integer)element;
            //create temp iterator
            DoubleNode<T> temp=head;
            //iterate while number larger than existing list numbers
            while( compare >=(Integer)temp.getElement() && temp.getNext()!=null){
                temp=temp.getNext(); 

            }
            //if only 1 item in the list
            if(temp.getPrev()== null){
                temp.setPrev(node);
                node.setNext(temp);
                head=node;
                count++;   
                //add in order to the list
            }else{                 
                node.setPrev(temp.getPrev());
                node.setNext(temp);
                temp.getPrev().setNext(node);
                temp.setPrev(node);
                count++;
                
            }
            
            
        }
    }
    //to string method to build string for printing
    @Override
    public String toString(){
        //intitalize string for output
        String outString="";
        //throw exception if empty
        if(isEmpty()){
            throw new EmptyCollectionException("List");
        }else{
            //else add each number separated by space to string
            DoubleNode temp=head;
            while(temp!=null){
                outString+=temp.getElement()+" ";
                temp=temp.getNext();
                
                
            }
        }
        //return built string
        return outString;
    }

    
}
