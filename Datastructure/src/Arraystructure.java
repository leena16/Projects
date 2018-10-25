
public class Arraystructure {

	private int[] theArray= new int[50];
	int ArraySize=10;
	
	public void generateRandomNumber() {
		for(int i=0;i<ArraySize;i++) {
		theArray[i]=(int)(Math.random()*10) +10;
		}
	}
	
	public void NewArray() {
		for(int i=0;i<ArraySize;i++) {
		System.out.println("----------");
		System.out.print("|" + i + "|");
		System.out.println(theArray[i] + "|");
		System.out.println("----------");
		}
	}
	
	public void valueAtIndex(int index) {
		if(index<ArraySize) {
			System.out.println(theArray[index]);
		}
	}
	
	public boolean doesValueExist(int SearchValue) {
		boolean bValue = false;
		for( int i=0;i<ArraySize;i++) {
		
			if(theArray[i]==SearchValue) {
				bValue= true;
				break;
				}
		else{
			bValue=false;
		}
		}
		return bValue;
		
	}
	
	public void deleteValueAtindex(int index) {
		for(int i=index;i<ArraySize;i++) {
			theArray[index]=theArray[index+1];
		}
		ArraySize--;
	}
	  public void insertValue(int value) {
		  if(ArraySize<50) {
			  theArray[ArraySize++]=value;
			
		  }
		  
	  }
	  
	  public void linearSearch(int value) {
		  for(int i=0;i<ArraySize;i++) {
			  if(theArray[i]==value) {
				  System.out.println(i);
			  }
			  else {
				  System.out.println("not found");
			  }
		  }
	  }
	public void  bubbleSort() {
		
		System.out.println("---------------bubble sort ------------------------");
		for(int i=ArraySize-1;i>1;i++) {
			for(int j=0;j<ArraySize-1;j++) {
				if(theArray[j]>theArray[j+1]) {
					swap(j,j+1);
				}
			}
		}
	}
	
	public void swap(int one, int two) {
		int temp=theArray[one];
		theArray[one]=theArray[two];
		theArray[two]=temp;
		
		
	}
	
	// selection sort 
	
	public void selectionSort() {
		
		
		System.out.println("------------------------selection sort");
		for(int i=0;i<ArraySize;i++) {
			int arr_min=i;
			for (int j=i+1;j<ArraySize;j++) {
				if(theArray[j]<theArray[arr_min]) {
					arr_min=j;
					
					//swap
					int temp=theArray[arr_min];
					theArray[arr_min]=theArray[i];
					theArray[i]=temp;
			}
			
			
			
			}
		}
	}
	
	
	public void binarySearch(int value){
		System.out.println("---------------Binary search");
		 int lowindex=0;
		 int highindex= ArraySize-1;
		
		 while(lowindex <= highindex) {
			 int mid=(highindex-lowindex)/2;
			 if(theArray[mid]<value) 
				 lowindex=mid+1;
			 else if(theArray[mid]>value)
				 highindex=mid-1;
			 else {
				 System.out.println("found match at index" + mid);
			 lowindex=highindex+1;
			 }
		 } 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arraystructure as= new Arraystructure();
		as.generateRandomNumber();
		as.NewArray();
		/*as.valueAtIndex(5);
		System.out.println(as.doesValueExist(10));
		as.deleteValueAtindex(4);
		as.NewArray();
		as.insertValue(55);
		as.NewArray();
		//as.linearSearch(14);
		as.generateRandomNumber();*/
		//as.selectionSort();;
		as.bubbleSort();
		as.NewArray();
		as.binarySearch(12);
	}

}
