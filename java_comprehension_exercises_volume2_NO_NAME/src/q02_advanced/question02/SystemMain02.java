package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();

		List<Member> members = new ArrayList<>();
		members.add(Member.getInsyance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInsyance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		MemberManager.showAllMembers(members);
		int id = 0;

		String newpassword = null;

		try {

			System.out.print("input target id>> ");
			id = cr.inputNumber();

			System.out.println("input new password>>");
			newpassword = cr.inputString();

		} catch (IOException | NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		}
		MemberManager.updatePasswaord(members, id, newpassword);
		MemberManager.showAllMembers(members);

	}

}
