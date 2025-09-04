package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {8,7,6,3,4,1};
		
		ascendingsort(a);
		
		System.out.print("Sorted Array in Ascending Order: "  );
		System.out.print(Arrays.toString(a) );
		
	}
	
	
	public static void ascendingsort(int b[]) {
		
		for(int i=1;i<b.length;i++) {
			//{8,7,6,3,4,1}
			int key=b[i];//7
			int j=i-1;//8,j=0
			
			while(j>=0 && key < b[j]) {
				b[j+1]=b[j];  //{8,8,6,3,4,1}
				--j;  //j=0
			}
			b[j + 1] = key;
		}
		
		
	}

}
