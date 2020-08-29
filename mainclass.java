import java.util.Scanner;

class mainclass 
{   
		static String one[] = { "", "One ", "Two ", "Three ", "Four ", 
								"Five ", "Six ", "Seven ", "Eight ", 
								"Nine ", "Ten ", "Eleven ", "Twelve ", 
								"Thirteen ", "Fourteen ", "Fifteen ", 
								"Sixteen ", "Seventeen ", "Eighteen ", 
								"Nineteen " }; 
 
		static String ten[] = { "", "", "Twenty ", "Thirty ", "Forty ", 
								"Fifty ", "Sixty ", "Seventy ", "Eighty ", 
								"Ninety " }; 
		
		static String numToWords(int n, String s) 
		{ 
			String str = "";  
			if (n > 19) { 
				str += ten[n / 10] + one[n % 10]; 
			} 
			else { 
				str += one[n]; 
			} 

			if (n != 0) { 
				str += s; 
			} 

			return str; 
		} 

		static String convertTotext(long n) 
		{ 
			
			String out = ""; 
  
			out += numToWords((int)((n / 100000) % 100), "Lakh "); 

			out += numToWords((int)((n / 1000) % 100), "Thousand "); 

			out += numToWords((int)((n / 100) % 10), "Hundred "); 

			if (n > 100 && n % 100 > 0) { 
				out += "and "; 
			} 

			out += numToWords((int)(n % 100), ""); 

			return out; 
		} 
 
		public static void main(String[] args) 
		{ 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number");
			double val = sc.nextDouble();
			
			if(val<0) System.out.println("The value is smaller than 0, please enter valid positive number");
		    else if(val>=1000000) System.out.println("The value is greater than 1000000, please enter valid positive number");
		    else 
		   {
			//Splitting
		    String[] arr=String.valueOf(val).split("\\.");
		    String strng = "";
		    int[] intArr=new int[2];
		    intArr[0]=Integer.parseInt(arr[0]);
		    intArr[1]=Integer.parseInt(arr[1]);
		    
		    long l = (long)intArr[0];
		    
		    strng = convertTotext(l);
		    
		    if(intArr[1]!=0) {
		    	int len = arr[1].length();
		    	int x = (int) Math.pow(10,len);
			    strng = strng + arr[1] +"/"+ x;
		  } 
		    System.out.println(strng + " only");
	
		    	} 
		}
	}  
