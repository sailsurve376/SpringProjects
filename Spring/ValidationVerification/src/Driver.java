
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidationVerification vv=new ValidationVerification();
		System.out.println(vv.toString());
		vv.changeUsername("Sail376", "sail@376", "SSS376");
		System.out.println(vv.toString());
		vv.changePass("SSS376", "sail@376", "sail@123");
		System.out.println(vv.toString());
		

	}

}
