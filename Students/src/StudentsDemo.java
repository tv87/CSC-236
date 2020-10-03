import java.util.*;
import java.util.LinkedList;

public class StudentsDemo
{
	public static void main(String args[])
	{
		int num = 1;
		Students s = new Students();

		Scanner sc = new Scanner(System.in);

		s.addStudent(1111);
		s.addStudent(1234);
		s.addStudent(2357);

	do{
		System.out.println("What action would you like to implement?");
		System.out.println("1: Show all students\n\n"
				+ "2: Add a course\n\n3: Drop a course\n\n"
				+ " 9: Quit");
		 num = sc.nextInt();



		if(num == 1)
		{
			System.out.println(s);
		}
		else if(num == 2)
		{
			System.out.println("ID");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("CourseName");
			String courseName = sc.nextLine();
			System.out.println("sectionNumber");
			int sectionNumber = sc.nextInt();
			System.out.println("credits");
			int credits = sc.nextInt();

			Course c = new Course(courseName, sectionNumber, credits, null);


			s.addCourse(id, c);
		}
		else if(num == 3)
		{
			System.out.println("ID");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Eneter course name: ");
			String courseName = sc.nextLine();
			int sectionNumber = 0;
			int credits = 0;
			Course c = new Course(courseName, sectionNumber, credits, null);
			s.dropCourse(id, c);
		}
		}while(num != 9);
		if(num == 9)
		{
			System.exit(0);
		}
	}
	

}
