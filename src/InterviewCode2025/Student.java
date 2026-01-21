package InterviewCode2025;

public class Student{
	
	private int roll;
	private String name;
	private long marks;
	private String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Student() {
	} 

	public Student(int roll, String name, long marks, String subject) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", subject=" + subject + "]";
	}

	/*
	 * @Override public int compareTo(Object o) { Student s1 = (Student) o;
	 * if(this.getRoll()==s1.getRoll()) { return 1; }if(this.getRoll()<s1.getRoll())
	 * { return-1; }else return 0;
	 * 
	 * }
	 */	

}
