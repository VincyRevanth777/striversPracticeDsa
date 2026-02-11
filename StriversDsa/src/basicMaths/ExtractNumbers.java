package basicMaths;

public class ExtractNumbers {
	
	public static void main(String[] args) {
		
		int num = 7789;
		int temp = num;
		int lastDigit =0,revNum = 0;
		
		int c = (int)Math.log10(num)+1;		// used for counting no of digits 
		
		while(temp>0) {
			lastDigit=temp%10;
			//count++;
			System.out.print(lastDigit+",");
			temp=temp/10;
			revNum = (revNum*10) + lastDigit;
			
				
		}
		System.out.println("\nReverse of the "+num+" is "+revNum);
		System.out.println("\nNo of digits "+c);
	}

}
