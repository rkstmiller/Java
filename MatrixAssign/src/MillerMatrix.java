/**
 * An implementation of the Matrix ADT. Provides four basic operations over an
 * immutable type.
 * 
 * @author (your name), Ruben Acuna
 * @version (version)
 */
public class MillerMatrix implements Matrix {
    
    private final int[][] matrix;
     /**
     * Constructor
     * Takes 2D array as argument and intitialized class 2D array
     * @param m 2d array
     */

    // constructor
    MillerMatrix(int [][] m){
       matrix = m;  
      
    }
     /**
     * Returns the element at particular point in the matrix.
     * @param y y position
     * @param x x position
     * @return element
     */
    public int getElement(int y, int x){
        int [][]elemMatrix=new int[matrix.length][matrix[0].length];
                for( int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                elemMatrix[i][j]=matrix[i][j];
            }
                }
        
        return elemMatrix[x][y];
    }
    /**
     * Returns the number of rows in the matrix.
     * @return rows
     */
    @Override
    public int getRows(){
        return matrix.length;
    }
    
    /**
     * Returns the number of columns in the matrix.
     * @return columns
     */
    @Override
    public int getColumns(){
        return matrix.length;
    }       
    /**
     * Returns this matrix scaled by a factor. That is, computes kA where k is a
     * constant and A is a matrix (this object).
     * 
     * @param scalar scalar
     * @return matrix
     */
    @Override
    public Matrix scale(int scalar){
        int[][] newMatrix= new int[matrix.length][matrix[0].length];
        for( int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                newMatrix[i][j]=matrix[i][j];
                newMatrix[i][j]=newMatrix[i][j]*scalar;
            }
        }
        Matrix scalMatrix=new MillerMatrix(newMatrix);
        return scalMatrix;
    }
    
    /**
     *  Returns this matrix added with another matrix. That is, computes A+B 
     *  where A and B are matrices (this object, and another respectively).
     * @param other addend
     * @return matrix
     * @throws RuntimeException if matrices do not have matching dimensions.
     */
    @Override
    public Matrix plus(Matrix other){
      int[][] adderOut=new int[matrix.length][matrix[0].length];
      int[][] addMatrix=new int[matrix.length][matrix[0].length];
      if(other.getColumns()!=addMatrix.length || other.getRows()!=addMatrix[0].length){
          throw new RuntimeException("Lengths Do not match");
      }else{
          int[][] adder=new int[other.getColumns()][other.getRows()];
         
          for(int i =0 ;i<addMatrix.length;i++){
            for(int j=0;j<addMatrix[0].length;j++){
                adder[i][j]=other.getElement(j, i);
                addMatrix[i][j]=matrix[i][j];
                adderOut[i][j]=addMatrix[i][j]+adder[i][j];
                
            }
         }   
          
      }
      
      
        Matrix outMatrix=new MillerMatrix(adderOut);
        return outMatrix;         
    }
    
    /**
     * Returns this matrix subtracted by another matrix. That is, computes A-B 
     *  where A and B are matrices (this object, and another respectively).
     * @param other subtrahend
     * @return matrix
     * @throws RuntimeException if matrices do not have matching dimensions.
     */
    
    @Override
public Matrix minus(Matrix other){
      int[][] adderOut=new int[matrix.length][matrix[0].length];
      int[][] addMatrix=new int[matrix.length][matrix[0].length];
      if(other.getColumns()!=addMatrix.length || other.getRows()!=addMatrix[0].length){
          throw new RuntimeException("Lengths Do not match");
      }else{
          int[][] adder=new int[other.getColumns()][other.getRows()];
         
          for(int i =0 ;i<addMatrix.length;i++){
            for(int j=0;j<addMatrix[0].length;j++){
                adder[i][j]=other.getElement(j, i);
                addMatrix[i][j]=matrix[i][j];
                adderOut[i][j]=addMatrix[i][j]-adder[i][j];
                
            }
         }   
          
      }
      
      
        Matrix outMatrix=new MillerMatrix(adderOut);
        return outMatrix;         
    }
    
    /**
     * Returns true if this matrix matches another matrix.
     * @param other another matrix
     * @return equality
     */
    @Override
    public boolean equals(Object other){
        if(other==this)return true;
        if(other==null)return false;
        if(other.getClass()!= this.getClass()){
            return false;
        }
        return false;
      
    }
    
    /**
     * Returns a string representation of this matrix. A new line character will
     * separate each row, while a space will separate each column.
     * @return string representation
     */
    @Override
    public String toString(){
        String outString="";
    
        for(int i =0 ;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                outString+=Integer.toString(matrix[i][j])+"\t";
         }
            outString+="\n";
            }
        return outString;
    }
    /**
     * Entry point for matrix testing.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] data1 = new int[0][0];
        int[][] data2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] data3 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        
        Matrix m1 = new MillerMatrix(data1);
        Matrix m2 = new MillerMatrix(data2);
        Matrix m3 = new MillerMatrix(data3);
        
        System.out.println("m1 --> Rows: " + m1.getRows() + " Columns: " + m1.getColumns());
        System.out.println("m2 --> Rows: " + m2.getRows() + " Columns: " + m2.getColumns());
        System.out.println("m3 --> Rows: " + m3.getRows() + " Columns: " + m3.getColumns());
        
        //check for reference issues
        System.out.println("m2 -->\n" + m2);
        data2[1][1] = 101;
        System.out.println("m2 -->\n" + m2);

        //test equals
        System.out.println("m2==null: " + m2.equals(null));             //false
        System.out.println("m3==\"MATRIX\": " + m2.equals("MATRIX"));   //false
        System.out.println("m2==m1: " + m2.equals(m1));                 //false
        System.out.println("m2==m2: " + m2.equals(m2));                 //true
        System.out.println("m2==m3: " + m2.equals(m3));                 //false
        
        //test operations (valid)
        System.out.println("2 * m2:\n" + m2.scale(2));
        System.out.println("m2 + m3:\n" + m2.plus(m3));
        System.out.println("m2 - m3:\n" + m2.minus(m3));
        
        //test operations (invalid)
        //System.out.println("m1 + m2" + m1.plus(m2));
        //System.out.println("m1 - m2" + m1.minus(m2));
    }

    
}