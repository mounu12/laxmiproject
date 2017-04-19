
public class SortingDemo {
	 static int arr1[]={2,4,5,7,9}; 
	int arr2[] = new int[arr1.length];
	int top = -1;
	
public void push (int e){
if(top<arr1.length){
	top = top+1;
	arr2[top] = e;
	}
}
public void display(){
	for(int i=0;i<=top;i++)
	System.out.println(arr2[i]);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SortingDemo ref = new SortingDemo();
ref.push(arr1[3]);
ref.display();
	}

}
