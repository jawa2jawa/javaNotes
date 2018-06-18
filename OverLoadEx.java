
public class OverLoadEx {
	final int k = 0;

	public OverLoadEx(int i) {

	}

	public int add(long l) {
		System.out.println("long");
		return 0;
	}

	public long add(int l) {
		System.out.println("int");
		return 0;
	}

	public void print(int i) {
		if (i == 5) {
			return;
		}
		print(++i);
		System.out.println(i);
	}

	public static void main(String[] args) {
		OverLoadEx oe=new OverLoadEx(5);
		oe.print(0);
	}

}
