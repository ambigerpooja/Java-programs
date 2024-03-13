public class Student {

	String name;
	int age;
	String gender;
	
	void Study()
	{
		System.out.println("student is studing");
	}
    void introduce()
    {
    	System.out.println("student is introducing");
    }
    public static void main(String[] args)
    {
    	Student S1=new Student();
        S1.name="Rohit";
        S1.age=22;
        S1.gender="Male";
        S1.Study();
        S1.introduce();
        
        Student S2=new Student();
        S2.name="pooja";
        S2.age=22;
        S2.gender="Female";
        S2.Study();
        S2.introduce();
    }
}
public class Object12 {

}
