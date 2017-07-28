

import java.util.Scanner;
import java.util.Stack;

public class PeraTrimmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Exp:");
		String exp = sc.nextLine();
		Stack<String> callStack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		String tos = "",aux="",temp="";
		int len = exp.length();
		for (int i = 0; i < len; i++) {
			if (exp.charAt(i) == ')') {
				sb.delete(0, sb.length());
				tos="";
				while (!callStack.isEmpty()) {
					tos=callStack.pop();
					if (tos.equals("(")) {
						if (sb.toString().length() != 0) {
							temp=sb.toString();
							if(temp.startsWith("(")&&temp.endsWith("")) {
								callStack.push(sb.toString());
							}else {
								callStack.push("(" + sb.toString() + ")");
							}
						}
						break;
					}
					aux = sb.toString();
					sb.delete(0, sb.length());
					sb = sb.append(tos).append(aux);
				}
			} else {
				callStack.push(exp.charAt(i) + "");
			}
		}
		sb.delete(0, sb.length());
		while (!callStack.isEmpty()) {
			tos = sb.toString();
			sb.delete(0, sb.length());
			sb = sb.append(callStack.pop()).append(tos);
		}
		System.out.println(sb.toString());
	}

}