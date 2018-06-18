
public class OverrridingEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrridingEx so = new SubOex();
		/**
		 * getClass returns the name of the instantiated class 
		 */
		System.out.println(so.getClass());
		Integer k=9;
		so.fun(null);
	}
	public Number fun(int b) {
		System.out.println("In base class Integer");
		return null;
	}
	public Number fun(long  b) {
		System.out.println("In base class int");
		return null;
	}
	public Number fun(Number b) {
		System.out.println("In base class Number");
		return null;
	}
	public Number show(Integer l)throws Exception1 {
		System.out.println("long");
		return null;
	}
	
}

class SubOex extends OverrridingEx {
	public Integer fun(Object b){
		System.out.println("In Sub class");
		return null;
	}
	public Integer show(Integer l) {
		System.out.println("Integer");
		return null;
	}
	public Number fun(Integer b) {
		System.out.println("In sub class Integer");
		return null;
	}
	public Number fun(int  b) {
		System.out.println("In sub class int");
		return null;
	}
}

class Base {

}

class Sub extends Base {

}

class Exception1 extends Exception{
	
}
class Exception2 extends Exception1{
	
}
class Exception3 extends Exception{
	
}