/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1_17050111031;

/**
 *
 * @author SELİNAY
 */
public class Environment {
    
    public final int[][] place= new int [4][4];
    private int Dirty;
   

    public Environment() {//Random matrix generation
        int i;
        int j;
        for(i=0; i<place.length ; i++){
    
            for(j=0; j<place[i].length ; j++){
                
                 place[i][j]=(int) Math.round(Math.random());

            }   
        }
        
    }
    
    public int getplaceDirty(){
    
        return Dirty;
    }
    
     public void change(int cleaned)
     {
         Dirty = cleaned;
     }
     
     public void display(int a,int b){//Displaying matrix steps with x
         
         int i;
         int j;
         for(i=0; i<place.length ; i++){
            
            for(j=0; j<place[i].length ; j++){
                if(i==a && j==b){
                System.out.print("x" + " "); 
                }
                else{
                System.out.print(place[i][j]+ " "); }
            }
            System.out.println();
        } 
     }
    
    
}
