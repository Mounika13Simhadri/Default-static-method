package Default_Method;

interface A{
	default String print() {
		return "from interface A";
	}
}
interface B{
	default String print() {
		return "from interface B";
	}
}
public class Multiple_interface_inheritance implements A,B{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return A.super.print();
		//return B.super.print();
		//return A.super.print()+" "+B.super.print();
	}

}
