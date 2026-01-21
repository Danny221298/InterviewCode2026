package InterviewCode2025;

import java.util.*;
import java.util.stream.Collectors;

public class ComparableAndCompartorDemo {
	
	public static void main(String[] args) {
	
		Comparator<Student> com = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				if(o1.getMarks()>o2.getMarks()) {
				return 1;
			}else
			{
				return -1;
			}
		}
		};
		List<Student> student = Arrays.asList(new Student(2, "Ram", 45,"Chem"),
											new Student(3, "Hari", 41,"Math"),
											new Student(1, "Danny", 23,"Chem"),
											new Student(5, "Dev", 65,"Math"),
											new Student(4, "Sham", 42,"Science"));
		Collections.sort(student,com);
		
		System.out.println(student);
	
	Map<String, Long> map1=student.stream().collect(Collectors.groupingBy(Student::getSubject , Collectors.counting()));
	
	Map<String, List<Student>> topStudentsBySubject = student.stream()
		    .collect(
		        Collectors.groupingBy(
		            Student::getSubject,
		            Collectors.collectingAndThen(
		                Collectors.toList(), // The downstream collector to get the List<Student>
		                list -> list.stream() // The finisher function to process the list
		                    .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
		                    .limit(2)
		                    .collect(Collectors.toList())
		            )
		        )
		    );
	
	System.out.println(topStudentsBySubject);
	
	
	long s1 = student.stream().collect(Collectors.summarizingLong(s->s.getMarks())).getSum();
	
	System.out.println(s1);
	
	//System.out.println(map1);
		
		
	}
}
