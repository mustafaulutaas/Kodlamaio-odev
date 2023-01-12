package odev3;

public class CourseManager extends User{
	public void openCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+" Adlı Eğitmen "+
	instructor.getCoursesName()+" Kursunu açtı"+"\nToplam Kurs Süresi : "+instructor.getCoursesTotalTime()+"\n");
	}
	public void courseStudent(Student students,Instructor instructor) {
		System.out.println("Kursa Devam Eden Ogrenciler\n"+students.getFirstName()+" "+students.getLastName()+"\nKurs Adi : "+instructor.getCoursesName()+"Egitmen : " +
	instructor.getFirstName()+" "+instructor.getLastName()+"\nTamamlanma Orani : %"+students.getCourseComplate()+"\n");
	}

}
