public class ChocolatesExample {

	public static void main(String[] args) {
		int array[]= {1,2,3};
		
		for(int i=1; i<=array.length-1;i++) {
		
			if(array[i]<array[i+1]) {
				System.out.print(i);
			}
		}
		
	}

}
