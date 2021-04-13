public class Threads {
    public static void main(String[] args) {
       

        Runnable runnable1=()->{
        	int total_Even=0;
            long start2=System.nanoTime();  
            for (int i = 1; i < 10000; i++) {
            	
                if(i%2==0) {
                	
                total_Even++;
                
            }
            }
            System.out.println("Even Numbers are:  \n"+total_Even);
            
        };

        Runnable runnable2=()->{
        	int i =0;
 	       int num =0;
 	       //Empty String
 	       int tota=0;
 	       String  primeNumbers = "";

 	       for (i = 1; i <= 10000; i++)         
 	       { 		  	  
 	    	   //System.out.println("HERE");
 	          int counter=0; 	  
 	          for(num =i; num>=1; num--)
 		  {
 	             if(i%num==0)
 		     {
 	 		counter = counter + 1;
 		     }
 		  }
 		  if (counter ==2)
 		  {
 		     //Appended the Prime number to the String
 		     primeNumbers = primeNumbers + i + " ";
 		     tota++;
 		  }	
 	       }	
 	       System.out.println("Prime numbers from 1 to 10000 are :");
 	       //System.out.println(primeNumbers);
 	       System.out.println(tota);
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
        
    }   
}
