package org;

import java.util.Comparator;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student(101,"Hello",90);
		Student s2 = new Student(102,"Akh",100);
		Student s3 = new Student(103,"Hjjadjllo",80);

		/*	
		Comparator<Double> com=new Comparator<Double>() {
				

				@Override
				public int compare(Double o1, Double o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
			};
		*/
		
		//Comparator<Double> com=(Double d1,Double d2)->{return d1.compareTo(d2); };
		//Comparator<Double> com=(d1,d2)->{ return -d1.compareTo(d2);};
		
		Comparator<Double> com=(d1,d2)->-d1.compareTo(d2);
		Comparator<String> com2=(name1,name2)-> -name1.length()-name2.length();
		
		TreeSet<Double> ts=new TreeSet<Double>(com);
		ts.add(s1.getMarks());
		ts.add(s2.getMarks());
		ts.add(s3.getMarks());
		
		for(Double o:ts) {
			System.out.println(o);
		}
		
		System.out.println("------");
		
		TreeSet<String> ts1=new TreeSet<String>(com2);
		ts1.add(s1.getStudentName());
		ts1.add(s2.getStudentName());
		ts1.add(s3.getStudentName());
		
		for(String name:ts1) {
			System.out.println(name);
		}

	}
}
