package odev3;

public class Main extends User{

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("demirog@gmail.com");
		instructor.setCoursesName("Java/React");
		instructor.setCoursesTotalTime("360dk");
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Mustafa");
		student.setLastName("Ulutas");
		student.setEmail("abcd@gmail.com");
		student.setNumber("112334");
		student.setCourseComplate(56);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Rafık");
		student2.setLastName("Karaman");
		student2.setEmail("sadsda@gmail.com");
		student2.setNumber("4646464");
		student2.setCourseComplate(12);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.logginStudent(student);
		studentManager.logginStudent(student2);

		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logginSite(instructor);
		
		CourseManager courseManager = new CourseManager();
		courseManager.openCourse(instructor);
		courseManager.courseStudent(student, instructor);
		courseManager.courseStudent(student2, instructor);
				
	}

}
