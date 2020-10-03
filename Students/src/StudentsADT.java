
public interface StudentsADT
{
	public void setMaxNumberOfStudents(int num);
	public void addStudent(int id);
	public void addCourse(int id, Course c);
	public void dropCourse(int id, Course c);
	public String toString();	

}
