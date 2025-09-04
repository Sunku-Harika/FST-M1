package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10, 77, 10, 54, -11, 10,10,10};
		int searchnum=10;
		int fixed=30;
		
		
		
		
		System.out.println("Result: " + isTargetSumValid(a, searchnum, fixed));
		

	}
	
	
	public static boolean isTargetSumValid(int[] numbers,int searchnum,int fixed) {
		int sum=0;
		for(int b:numbers) {
			
			if(b==searchnum) {
				sum=sum+b;
			}
			if (sum > fixed) {
                break;
            }
			
		}
		
		
		
		return sum==fixed;
		
	}

}
