package com.ss511.designPatterns.iterator;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("abc");
		list.add("xyz");
		list.add("pqr");
		list.add("mnp");
		
		ListIterator<String> it1 = list.listIterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		while(it1.hasPrevious()) {
			System.out.println(it1.previous());
		}
		
		Collections.sort(list, (p,q)->{
			return p.compareTo(q);
		});
		
		System.out.println("========After Sorting========");
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		Collections.sort(list, (p,q)->{
			return q.compareTo(p);
		});
		System.out.println("========After Sorting In Reverse Order========");
		it1 = list.listIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("========Map========");
		Map<String, String> map = new HashMap<>();
		map.putIfAbsent("a", "abc");
		map.putIfAbsent("a", "abcd");
		map.putIfAbsent("b", "bcd");
		map.putIfAbsent("c", "cde");
		map.putIfAbsent("x", "xyz");
		map.putIfAbsent("p", "pqr");
		
		for (Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		List<Entry<String, String>> unSorted = new LinkedList<Map.Entry<String,String>>(map.entrySet());
		
		unSorted.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
		System.out.println("========After Sorting========");
		LinkedHashMap<String, String> linkedMap = unSorted.stream().collect(
				Collectors.toMap(Entry::getKey, Entry::getValue, (a,b)-> b, LinkedHashMap::new));
		for (Map.Entry<String, String> entry: linkedMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
}
