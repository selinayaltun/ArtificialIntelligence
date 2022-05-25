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
public class Agent {
    
    private int score = 0;
    private int totaldirty=0;
    private int k;
    private int l;
   
    public Agent() {
        
    }
    
    public int Randomfunction(){
        int random = 0+ (int)(Math.random() * 4);
        return random;
    }
   
    public void BeginMove(Environment e){
        //Count of all 1s in matrix found
        for(k=0; k<4;k++){
            for(l=0;l<4;l++){
                if(e.place[k][l] == 1)
                    totaldirty++;
             }
        } 
      
        //For random start
         int a= Randomfunction();
         int b= Randomfunction();
        
        while(totaldirty>0){//To clean the matrix
            int RandomMove=Randomfunction();//For random action
            
            //0=Left, 1=Right, 2=Up; 3=Down
            if(RandomMove==0 && b>0){
                b=b-1;//New location
                if(e.place[a][b] == 1){
                    e.place[a][b]=0;
                    this.score = 1+this.score;  
                    e.display(a,b);
                    System.out.println("Agent has the location: " + a + "-" + b);
                     RandomMove=Randomfunction();//New action
                    totaldirty--;
                }
            }
            else if(RandomMove==1 && b<3){
                b=b+1;//New location
                if(e.place[a][b] == 1){
                    e.place[a][b]=0;
                    this.score = 1+this.score;
                    e.display(a,b);
                    System.out.println("Agent has the location: " + a + "-" + b);
                    RandomMove=Randomfunction();//New action
                    totaldirty--;
                }

            }
            else if(RandomMove==2 && a>0){
                a=a-1;//New location
                if(e.place[a][b] == 1){     
                    e.place[a][b]=0;
                    this.score = 1+this.score;
                    e.display(a,b);
                    System.out.println("Agent has the location: " + a + "-" + b);
                    RandomMove=Randomfunction();//New action
                    totaldirty--;
                }
            }
            else if(RandomMove==3 && a<3){
                a=a+1;//New location
                if(e.place[a][b] == 1){
                    e.place[a][b]=0;
                    this.score = 1+this.score;
                    e.display(a,b);
                    System.out.println("Agent has the location: " + a + "-" + b);
                    RandomMove=Randomfunction();//New action
                    totaldirty--;
                }

            }
            else{
                
                RandomMove=Randomfunction();//New action
                
            }
                
    
        }
        System.out.println("Total Number step is: " + score);
    
    }

}
