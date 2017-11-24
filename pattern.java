
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern obj = new pattern();
        obj.pattern1(6);
	}

	  void pattern1(int n) {
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<i;j++) {
				  System.out.print(" * ");
			  }
			  System.out.println();
		  }
	  }
}
