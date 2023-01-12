package odev3;

public class StudentManager extends User{
	public void logginStudent(Student student) {
		System.out.println("Ogrenci Grisi Basarali:\n"+student.getFirstName()+" "+student.getLastName()+"\n"+student.getNumber()+"\n"+student.getEmail()+"\n");
	}
	
}
