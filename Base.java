package blocks;

abstract class BaseA {
	static final long serialVersionUID = -3387516993124229948L;
	int a = 20;

	abstract void show() throws  BlockExceptionC;
}

public class Base extends BaseA {
	static final long serialVersionUID = -23;

	void show() throws BlockExceptionC {
		System.out.println("Base functionality");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
/*******************************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub_7 s1 = new Sub_7();
		System.out.println(s1.a);
		 s1.show();
	}
/***********************************************************************/
}

class Sub_1 extends Base {
	{
		a = 30;
	}

	void show() throws BlockExceptionC {
		super.show();
		System.out.println("Sub_1 functionality");
	}
}

class Sub_2 extends Sub_1 {
	{
		a = 30;
	}

	void show() throws BlockExceptionC {
		System.out.println("Sub_2 functionality");
	}
}

class Sub_3 extends Sub_2 {
	{
		a = 30;
	}

}

class Sub_4 extends Sub_3 {
	{
		a = 30;
	}

	void show() throws BlockExceptionC {
		System.out.println("Sub_4 functionality");
	}
}

class Sub_5 extends Sub_4 {
	{
		a = 309;
	}

	public Object clone() {
		return this;
	}
}

class Sub_6 extends Sub_5 implements Cloneable {
	{
		a = 304;
	}

}

class Sub_7 extends Sub_6 {
	/****************************************************************************************/
	void show() 
	{
		// super.show();
		System.out.println("Sub_7 functionality");
//		throw new NullPointerException();
	}
	/****************************************************************************************/
	void show2() {
		throw new BlockExceptionR();
	}
}

class BlockExceptionC extends Exception {
	public BlockExceptionC() {
		super();
	}
}

class BlockExceptionR extends RuntimeException {
	public BlockExceptionR() {
		super();
	}
}
