package tns.day3;

class per
{
	String name;
	String city;
	
	void getData()
	{
		name="Amit";
		city="Pune";
	}
	void accept(String nm, String c)
	{
	name=nm;
	city=c;
	}
	void show()
	{
		System.out.println("person Details are : name - "+name+"   city - "+city+"");
	}
}


public class Person {

	public static void main(String[] args) {
		per p1=new per();
		p1.getData();
		p1.show();
		
		per p2=new per();
		p2.accept("parth", "Mumbai");
		p2.show();	

	}

}
