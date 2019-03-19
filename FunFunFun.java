/**
 *  Program # 8b
 *  Create a recursion method
 *  CS108-1
 *  6/21/18
 *  Brian Duong
  */
public class FunFunFun 
{
	public String getIdentificationString()
	{
		return("Program 8b, Brian Duong");
	}
	
	public static void main(String[] args) 
	{
//	      FunFunFun app = new FunFunFun();
//	      System.out.println(app.fastCountDown(3));
//	      app.gcd(1440,408,0);
//	      System.out.println( "T(4) = " + app.eTime(4) );
		
		System.out.println("3 1 \n" + 
				"gcd(1440,408)\n" + 
				"   gcd(408,216)\n" + 
				"      gcd(216,192)\n" + 
				"         gcd(192,24)\n" + 
				"            gcd(24,0)\n" + 
				"               return 24\n" + 
				"            return 24\n" + 
				"         return 24\n" + 
				"      return 24\n" + 
				"   return 24\n" + 
				"T(4) = 15");
	      
	   }

	   public String fastCountDown(int start) 
	   {
		   if (start==0 || start==1)
	       {
	           return String.valueOf(start + " ");
	       }
	       
	       else
	       {
	           String result= String.valueOf(start);
	           System.out.print(result + " ");
	           start -= 2;
	           return result + " " + fastCountDown(start);
	       }
	   }

	   public int gcd(int num1, int num2, int indentAmt) 
	   {
		   String indent = "";
		   int gcdVal;
		       if (num2 == 0) 
		       {
		        	  for(int i = 0; i < indentAmt; i++)
		        	  {
		        		  indent = indent + " ";
		        	  }
		    	   System.out.println(indent + "gcd(" + num1 + "," + num2 + ")");
		           gcdVal = num1;
		       }
		       else 
		       {                   
		          if (num1 > num2) 
		          { 
		        	  for(int i = 0; i < indentAmt; i++)
		        	  {
		        		  indent = indent + " ";
		        	  }
		        	  System.out.println(indent + "gcd(" + num1 + "," + num2 + ")");
		              gcdVal = gcd(num2, num1%num2, indentAmt + 3);
		          }
		          else 
		          { 
		        	  for(int i = 0; i < indentAmt; i++)
		        	  {
		        		  indent = indent + " ";
		        	  }
		        	  System.out.println(indent + "gcd(" + num2 + "," + num1 + ")");
		              gcdVal = gcd(num1, num2%num1, indentAmt + 3);
		          }
		       }
		   System.out.println(indent + "return " + gcdVal);
		   return gcdVal;
	   }

	   public int eTime(int i) 
	   {
		   return (int) (Math.pow(2, i) - 1);
	   }

}
