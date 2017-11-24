
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorMethods c =new CalculatorMethods();
       int x = c.sum(30,5);
       System.out.println("sum: "+x);
       int y = c.sub(30,5);
       System.out.println("sub: "+y);
       int z = c.mul(30,5);
       System.out.println("mul: "+x);
       int w = c.div(30,5);
       System.out.println("div: "+x);
	}
}
class CalculatorMethods{

	int sum(int a,int b) {
		int ans;
		ans=a+b;
		return ans;
	}
    int sub(int a,int b) {
	int ans;
	ans=a-b;
	return ans;
}
    int mul(int a,int b) {
    	int ans;
    	ans=a*b;
    	return ans;
    }
    int div(int a,int b) {
    	int ans;
    	ans=a/b;
    	return ans;
    }
    }

