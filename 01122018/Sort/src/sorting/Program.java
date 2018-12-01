package sorting;

import java.util.*;

public class Program {
	
	public static void main(String arg[]) {
		
	ArrayList<Student> students=new ArrayList<>();
	
	students.add(new Student("Moshe",34,87));
	students.add(new Student("Ron",27,97));
	students.add(new Student("Dana",41,85));
	students.add(new Student("Zeev",24,75));
	students.add(new Student("Hilla",36,95));
	
	for(Student s:students) {
	System.out.println(s);
	}
	System.out.println("\n--------------Sort by Age---------------------");
	Collections.sort(students,new SortAge());
	for(Student s:students) {
		System.out.println(s);
		}
	System.out.println("\n--------------Sort by Grade---------------------");
	Collections.sort(students,new SortGrade());
	for(Student s:students) {
		System.out.println(s);
		}
	System.out.println("\n--------------Sort by Name---------------------");
	Collections.sort(students,new SortName());
	for(Student s:students) {
		System.out.println(s);
		}
	
}
}