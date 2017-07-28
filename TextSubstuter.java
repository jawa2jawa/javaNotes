package dsalgos;

import java.util.HashMap;
import java.util.Stack;

public class TextSubstuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> table = new HashMap<String, String>();
		Stack<Character> callSt = new Stack<Character>();
		table.put("name1", "name2");
		table.put("name2", "name3");
		table.put("name3", "name4");
		table.put("name4", "name5");

		String tobePrased = "asdsd${${name1}}dasdas${name2}";
		String aux = "";
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder auxsb = new StringBuilder();
		int len = tobePrased.length();
		int index = 0;
		for (int i = 0; i < len; i++) {
			if (tobePrased.charAt(i) == '$' || !callSt.isEmpty()) {
				if (tobePrased.charAt(i) == '$') {
					callSt.push(tobePrased.charAt(i));
					sb1.append(tobePrased.charAt(i));
				}
				i++;
				while (tobePrased.charAt(i) != '}') {
					sb1.append(tobePrased.charAt(i));
					if (tobePrased.charAt(i) == '$') {
						callSt.push(tobePrased.charAt(i));
					}
					i++;
				}
				if (tobePrased.charAt(i) == '}') {
					auxsb = auxsb.delete(0, auxsb.capacity());
					sb1 = sb1.reverse();
					index = sb1.indexOf("{");
					auxsb = auxsb.append(sb1.toString().substring(0, index));
					auxsb = auxsb.reverse();
					aux = table.get(auxsb.toString());
					auxsb = auxsb.delete(0, auxsb.capacity());
					auxsb = auxsb.append(aux);
					aux = sb1.toString().substring(index + 2);
					callSt.pop();
					sb1 = sb1.delete(0, sb1.capacity());
					sb1 = sb1.append(aux);
					sb1 = sb1.reverse();
					sb1 = sb1.append(auxsb.toString());
				}

				if (callSt.isEmpty()) {
					sb.append(sb1.toString());
					sb1 = sb1.delete(0, sb1.capacity());
				} else {
					i--;
				}
			} else {
				sb.append(tobePrased.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}