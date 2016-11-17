/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class Bin {
	private int pieces;
	private boolean store;
	private int owner;
	
	public Bin(boolean store, int owner){
		pieces = 4;
		this.store = store;
		this.owner = owner;
	}
	
	public void empty(){
		pieces = 0;
	}
	
	public int getPieces(){
		return pieces;
	}
	
	public void addPiece(){
		pieces++;
	}
	
	public int getOwner(){
		return owner;
	}
	
	public boolean isStore(){
		return store;
	}
	
	public void setPieces(int numPieces){
		pieces = numPieces;
	}
	
	public void setAsStore(){
		store = true;
	}
}

