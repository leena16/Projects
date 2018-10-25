
public class array2 {
	int[] theArray=new int[50];
	 int size=10;
	public void generateRandomNumber() {
		
		for (int i=0;i<size;i++) {
			theArray[i] =(int) (Math.random()*10)+10;
			
		}
		
		
	}
	
	/*public void displayArray() {
		for (int i=0;i<size;i++) {
			System.out.println(theArray[i]);
			
		}
	}*/
	
	public void displayWithIndex() {
		
			for (int i=0;i<size;i++) {
				System.out.print(i  +": ");
				System.out.println(theArray[i]);
				
			}
	}
	
	
	public void valueatIndex(int index) {
		if(index<size) {
			
		//System.out.println(theArray[index]);
		System.out.println("the value at index  "+ index+ " is:"+ theArray[index]);
	
		}
		
	}
	
	public void isValueFound(int value) {
		int counter = 0;
		for(int i=0;i<size;i++) {
			if(theArray[i]==value) {
				System.out.println("the value is found at index: "+i);
				counter=1;
			}
			
		}
		if(counter==0) {
			System.out.println("value doesnot exist");
		}
	}
	
	public void numberOfOccurance(int value) {
		int counter=0;
		for(int i=0;i<size;i++) {
			if(theArray[i]==value) {
				counter++;
			}
			
		}
		System.out.println("the value occured "+counter+ " times");
	}
	
	/*public void bubblesort() {
		for(int i=size-1;i<=)
	}*/
	
	
	//linear search 
	public void binarySearch(int value){
		 int lowindex=0;
		 int highindex= size-1;
		 int mid=(highindex-lowindex)/2;
		 while(lowindex <= highindex) {
			 if(theArray[mid]<value) lowindex=mid+1;
			 else if(theArray[mid]>value)highindex=mid-1;
			 else {
				 System.out.println("found match at index" + mid);
			 }
		 }
		  
	}
	
	public static void main(String[] args) {
		array2 a= new array2();
		a.generateRandomNumber();
		a.displayWithIndex();
		a.valueatIndex(5);
		a.isValueFound(17);
		a.numberOfOccurance(17);
		
}
}