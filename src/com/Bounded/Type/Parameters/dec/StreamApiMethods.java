package com.Bounded.Type.Parameters.dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMethods {
	public static void main(String[] args) {

		// even number
		List<Integer> numbers = Arrays.asList(1, 2, 3, 0, 4, 5, 6, 6);

		List<Integer> list = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(list);

		// find max value in the list
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println(max.get());

		// sum of element
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

		// list of name to uppercase

		List<String> asList = Arrays.asList("abc", "xuz", "ydh");

		List<String> map = asList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(map);

		// sort list

		List<Integer> listOfsort = numbers.stream().sorted().collect(Collectors.toList());

		System.out.println(listOfsort);

		// count element that greter than 5
		long co = numbers.stream().filter(n -> n < 5).count();
		System.out.println(co);

		// get distinct --> only give unique element
		List<Integer> d = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println(d);

		// reduce sum
		List<Integer> ll = Arrays.asList(1, 2);
		Integer reduce = ll.stream().reduce(2, Integer::sum);
		System.out.println(reduce);

		// find any
		Optional<Integer> any = ll.stream().findAny();
		System.out.println(any.get());

		// list first name get
		List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");

		List<String> los = fullNames.stream().map(name -> name.split(" ")[0]).collect(Collectors.toList());

		System.out.println(los);

		// all match
		boolean allMatch = numbers.stream().allMatch(n -> n < 0);
		System.out.println(allMatch);

		// none match
		boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);
		System.out.println(noneMatch);

		// find first
		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println(first.get());

		// flat map for nested lists
		List<List<Integer>> grp = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(7, 8));

		List<Integer> data = grp.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(data);

		// group user by age
		List<User> users = new ArrayList<>();

		User u1 = new User("raj", 78);
		User u2 = new User("karan", 20);
		User u3 = new User("monya", 90);
		User u4 = new User("tokna", 78);
		User u5 = new User("wwa", 43);
		User u6 = new User("bana", 20);
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u6);

		Map<Integer, List<User>> agesWiseUser = users.stream().collect(Collectors.groupingBy(User::getAge));

		for (Map.Entry<Integer, List<User>> da : agesWiseUser.entrySet()) {
			System.out.println(da.getKey() + " : " + da.getValue());
		}

	}
}

class User {
	private String name;
	private int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}