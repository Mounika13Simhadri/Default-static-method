package Default_Method;



interface Project{
	String getName();
	String startProject();
	String endProject();
	default String projectDate() {
		return "Project started on date:08/05/2023";
	}
}

interface StaticSample{
	static int add(int a,int b) {
		return a+b;
	}
}

class Client implements Project{
	public String name;
	

	public Client(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return "Project Name:"+name;
	}
	public String startProject() {
		return "Project Started";
	}
	public String endProject() {
		return "Project Ended";
	}
}
public class Default_Demo {

	public static void main(String[] args) {

		Project p1=new Client("Master Mind");
		System.out.println(p1.getName());
		System.out.println(p1.startProject());
		System.out.println(p1.endProject());
		System.out.println(p1.projectDate());
		A a1=new Multiple_interface_inheritance();
		System.out.println(a1.print());
		System.out.println(StaticSample.add(5, 6));	
	}

}
