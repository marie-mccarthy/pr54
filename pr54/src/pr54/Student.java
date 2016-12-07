package pr54;

public class Student {
	private String teacher;
	private String name;

	public Student(String t, String n)
		{
		teacher = t;
		name = n;
		}

	public String getTeacher()
		{
		return teacher;
		}

	public void setTeacher(String teacher)
		{
		this.teacher = teacher;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

}
