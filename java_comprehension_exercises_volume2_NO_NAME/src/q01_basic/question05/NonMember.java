package q01_basic.question05;

public class NonMember extends AbstMember {
	public NonMember(String name) {

	}

	@Override
	public void buyItem() {
		System.out.println(
				"Sato Kensuke purchased the item at a fixed price\n Miura Manabu purchased the item at 50% off");

	}

	@Override
	public void showMember() {
		System.out.println("---SHOW MEMBERS---");
		System.out.println("***MEMBER DATA***");
		System.out.println("Sato kensuke is a non-member");

		System.out.println("*****************");

	}

}
