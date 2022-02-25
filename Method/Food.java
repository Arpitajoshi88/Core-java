	class Food{
          
          public static void main(String []args){
         
         
             float ans =  breakfast("idly",20f,10,15);
               System.out.println(ans);
                

            }

       static Float breakfast(String name,float price,int quantity,int noOfpeople){
                   float total=price*quantity;
                   float totalprice= price*quantity;
                   float avr= total/noOfpeople;
               
                    return avr;      
                   
                  }  
                   
             
        }
           

          
           