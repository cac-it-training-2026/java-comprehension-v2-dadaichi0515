package q02_advanced.question02;

import java.util.List;

class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}

	}

	public static void updatePasswaord(List<Member> members, int targetId, String newpassword) {
		boolean found = false;

		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newpassword);
				System.out.println("パスワードを変更しました。");
				found = true;
				break;

			}
		}
		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}

}
