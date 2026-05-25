package interviewcode;

import java.util.*;
import java.util.stream.*;


public class Java8StreamPrograms {

	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122,
						Arrays.asList("+912632632782", "+1673434729929")),
				new Student(2, "Pulkit", 74, "Male", "Computer Engineering", "Delhi", 67,
						Arrays.asList("+912632632762", "+1673434723929")),
				new Student(3, "Ankit", 23, "Female", "Mechanical Engineering", "Kerala", 164,
						Arrays.asList("+912632633882", "+1673434709929")),
				new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26,
						Arrays.asList("+9126325832782", "+1671434729929")),
				new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12,
						Arrays.asList("+012632632782")),
				new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90,
						Arrays.asList("+9126254632782", "+16736784729929")),
				new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324,
						Arrays.asList("+912632632782", "+1671234729929")),
				new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433,
						Arrays.asList("+9126326355782", "+1673434729929")),
				new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7,
						Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
				new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98,
						Arrays.asList("+912632646482", "+16734323229929")));
		
		Set<Integer> n1= new HashSet<Integer>();
		
	List<Student> l1=studentList.stream().sorted(Comparator.comparing(Student::getAge).reversed().thenComparing(a->a.getRank())).collect(Collectors.toList());
		
	List<Student> l2= studentList.stream().filter(a->!n1.add(a.getAge())).collect(Collectors.toList());
	
	Map<Integer, String> l3 = studentList.stream().collect(Collectors.toMap(Student::getId, Student::getFirstName));
	
	List<Student> map=studentList.stream().filter(s->s.getCity().equals("Mumbai")).collect(Collectors.toList());
	
	List<Student> map1 = studentList.stream().filter(s->s.getDept().equals("Mechanical Engineering") && s.getAge()>=25).collect(Collectors.toList());
	
	List<Student> l4 = studentList.stream().sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getAge)).collect(Collectors.toList());
			
	//System.out.println(l4);
	
	Student l5 = studentList.stream().sorted(Comparator.comparing(Student::getAge).reversed()).skip(1).findFirst().get();
	
	List<Student> l6 = studentList.stream().filter(a-> a.getDept().equals("Mechanical Engineering") && a.getAge() >20).collect(Collectors.toList());
	
	System.out.println(l6);
	
	}
	
	
	
	
	
	
	
	
	
	
}