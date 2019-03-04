package cardreader;


public class Testprogram {

	public static void main(String[] args) {
		UserTable ut = new UserTable();
		long u1 = 24073;
		long u2 = 24074;
		User Anv1 = ut.find(u1);
		User Anv2 = ut.find(u2);
		System.out.println(Anv1);
		System.out.println(Anv2);
		
		String namn = "Jens Holmgren";
		User Anv3 = ut.findByName(namn);
		System.out.println(Anv3);
		
		int k = ut.testFind();
		System.out.println(k);
		
		User qq = new User(1234, "Kulig Kula");
		ut.add(qq);
		System.out.println(ut.getNbrUsers());
	}

}
