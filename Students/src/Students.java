
public class Students implements StudentsADT
{
	Student [] arr;
	int maxNumberOfStudents;
	
	public Students()
	{
		maxNumberOfStudents = 3;
		arr = new Student[maxNumberOfStudents];
	}
	public Students(int maxNumber, Student [] array)
	{
		this.maxNumberOfStudents = maxNumber;
		this.arr = array;
	}
	public Students(Students s)
	{
		this.maxNumberOfStudents = s.maxNumberOfStudents;
		this.arr = s.arr;
	}
	public void setMaxNumberOfStudents(int num)
	{
		this.maxNumberOfStudents = num;
	}
	public void addStudent(int id)
	{
		int index = 0;
		while(arr[index] != null)
		{
			index++;
		}
		arr[index] = new Student(id,null);	
	}
	public void addCourse(int id, Course c)
	{
		for(int i = 0; i < arr.length;i++)
		{
			if(arr[i].getId() == id){
				arr[i].addCourse(c); break;}
		}
	}
	public void dropCourse(int id, Course c)
	{
		for(int i = 0; i < arr.length;i++)
			if(arr[i].getId() == id)
			{
				arr[i].dropCourse(c);
				break;
			}
	}
	@Override public String toString()
	{
		String s = "";
		for(int i = 0; i < arr.length; i++)
		{
			s = s + arr[i].getId();
		}
		return s;
	}

public class Student
{
	int id;
	Course course;
	
	public Student()
	{
		id = 0;
		course = null;
	}
	public Student(int id, Course course)
	{
		this.id = id;
		this.course = course;
	}
	public Student(Student s)
	{
		this.id = s.id;
		this.course = s.course;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setCourses(Course course)
	{
		this.course = course;
	}
	public int getId()
	{
		return id;
	}
	public Course getCourses()
	{
		return course;
	}
	public void addCourse(Course c)
	{
		if(course == null)
			course = c;
		else
		{
			c.setLink(course);
			course = c;
		}
	}
	public void dropCourse(Course c)
	{
		if(course ==null)
		{
		}
		else
		{
			Course s = course;
			if(s.getCourseName().equals(c.getCourseName()))
			{
				s= s.getLink();
				course = s;
			}
			else
			{
				while(!( s.getLink().getCourseName().equals(c.getCourseName())))
				{
					s = s.getLink();
				}
				s.setLink(s.getLink().getLink());
			}
		}
	}
	public String toString()
	{
		String str = "";
		Course s = course;
		str = id + " ";
		if(s== null)
		str = str + "\n";
		else
		{

		while(s != null)
		{
			str = str + " "+ s+  "\n";
			s = s.getLink();
		}
		}
		return str;
	}
	
	
	
	
	
	
	
	
	
	
}	
	
	
}
