package blocks;

public class Binding implements TestI {

	public void add(Integer aa, Integer b) {
		System.out.println("Integer" + aa + b);
	}

	public void add(Long a, Integer b) {
		System.out.println("Long" + a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binding b = new Binding();
		b.add(2, 3);
	}

}
