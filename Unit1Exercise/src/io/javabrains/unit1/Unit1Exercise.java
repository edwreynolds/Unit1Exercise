package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.javabrains.common.Person;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		
		// Step 1: Sort list by last name
		// Step 2: Create a method that prints all elements in the list
		Comparator<Person> byLastName = (Person o1, Person o2)->o1.getLastName().compareTo(o2.getLastName());		
		Collections.sort(people, byLastName);
		people.forEach((item) -> System.out.println(item.toString()));
		System.out.println("#############");
		
		// Step 3: Create a method that prints all people that have last name beginning with C 
		people.forEach((item) -> {
			if(item.getLastName().startsWith("C")) {
				System.out.println(item.toString());
			}
		});


	}

}
