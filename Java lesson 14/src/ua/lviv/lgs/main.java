package ua.lviv.lgs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
public static void main(String[] args) {
	Set<Person> p = new HashSet<Person>();
	p.add(new Person("Eduardo", 25));
	p.add(new Person("Alexandro", 55));
	p.add(new Person("Lisa", 15));
	p.add(new Person("Torben", 76));
	p.add(new Person("Rasmus", 44));	
	for (Person person : p) {
		System.out.println(person);
	}
	System.out.println();
	Set<Person> p1 = new LinkedHashSet<Person>();
	p1.add(new Person("Eduardo", 25));
	p1.add(new Person("Alexandro", 55));
	p1.add(new Person("Lisa", 15));
	p1.add(new Person("Torben", 76));
	p1.add(new Person("Rasmus", 44));	
	for (Person person : p1) {
		System.out.println(person);
	}
	System.out.println();
	Set<Person> p2 = new TreeSet<Person>();
	p2.add(new Person("Eduardo", 25));
	p2.add(new Person("Alexandro", 55));
	p2.add(new Person("Lisa", 15));
	p2.add(new Person("Torben", 76));
	p2.add(new Person("Rasmus", 44));	
	for (Person person : p2) {
		System.out.println(person);
	}
	System.out.println();
	Set<Person> p3 = new TreeSet<Person>(new PersonAllFieldsComparator());
	p3.add(new Person("Eduardo", 25));
	p3.add(new Person("Alexandro", 55));
	p3.add(new Person("Lisa", 15));
	p3.add(new Person("Torben", 76));
	p3.add(new Person("Rasmus", 44));	
	for (Person person : p3) {
		System.out.println(person);
	}
	System.out.println();
	Set<Person> p4 = new TreeSet<Person>(new PersonAllFieldsComparator2());
	p4.add(new Person("Eduardo", 25));
	p4.add(new Person("Alexandro", 55));
	p4.add(new Person("Lisa", 15));
	p4.add(new Person("Torben", 76));
	p4.add(new Person("Rasmus", 44));	
	for (Person person : p4) {
		System.out.println(person);
	}
}
}
