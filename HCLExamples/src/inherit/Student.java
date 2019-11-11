package inherit;

public class Student extends Human{
public int rollNum;
public StringBuilder studentName;


    void student()
{
System.out.println("Student object constructed");
}
public Student(int rollNum, StringBuilder studentName) {
super();
this.rollNum = rollNum;
this.studentName = studentName;
}
public void brethe() {
	// TODO Auto-generated method stub
	
}
}