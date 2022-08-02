package test;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.*;

public class Hello {
	public static void main(String args[])
	{
		//   LIST
		// 1.ArrayList 
/*		List<Integer> arraylist = new ArrayList<Integer>();
		System.out.println(arraylist.size());
		
		for(int i=0;i<5;i++)
			arraylist.add(i);
		
		arraylist.remove(3);
		for(int i:arraylist)
			System.out.print(i+" ");
	    System.out.println(arraylist.get(3));
		System.out.println(arraylist);
		
		output :
			0
			0 1 2 4 4
			[0, 1, 2, 4]
*/
		// 2.Linked List
		
	/*	LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.addFirst("F");
		list.addLast("G");
		list.add(7,"H");
		list.remove("A");
		list.remove(2);
		list.removeFirst();
		System.out.println(list.get(1));
		list.removeLast();
		System.out.print(list);
		
		
		output:
		D
		[B, D, E, G]  */
		
		// 3.vector
/*		Vector<String> vec = new Vector<String>();
		vec.add("a");
		vec.add("b");
		vec.add("c");
		System.out.println(vec);
		
		vec.remove(1);
		System.out.println(vec);
		vec.remove("c");
		System.out.println(vec);
		vec.removeAll(vec);
		System.out.println(vec);
		
		output :
			[a, b, c]
			[a, c]
			[a]
			[]	
			
			*/
		
		  
		// 	QUEUE	(FIFO : first in first out)
				/*    1.
				Queue<String> queue = new PriorityQueue<String>();
				System.out.println(queue.size());
				
				queue.add("India");
				
				queue.add("America");
				queue.add("Germany");
				
				System.out.println(queue); // By default print method will call queue.toString() method that will lead to the change in order.
				
				System.out.println(queue.peek());
				
				System.out.println(queue.remove());
				
				System.out.println(queue.poll());
				
				System.out.println(queue);
				
				output :
					0
					[America, India, Germany]
					America
					America
					Germany
					[India]   */
		
		 // 2. PRIORITY QUEUE (automatically sorts the elements.
/*		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		System.out.println(pq.size());
		for(int i=10;i>0;i--)
		pq.add(i);
		
		System.out.println(pq);
		pq.remove(1);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		output :
		0
        [1, 2, 5, 4, 3, 9, 6, 10, 7, 8]
        2
        2
        [3, 4, 5, 7, 8, 9, 6, 10]
        
		*/
		
		//  SET
		// Hashset (output is unordered due to hashing
		
	/*	HashSet<String> hashset = new HashSet<String>();
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("B");
		hashset.add("B");
		System.out.println(hashset.add("C"));
		System.out.println(hashset.add("C"));
		System.out.println(hashset.contains("X"));
		System.out.print(hashset);
		
		for(String item:hashset) {
			System.out.print(item+" ");
		}
		
		output :
		true
        false
        false
        [A, B, C]A B C    */
		
		
		// Tree set (used to mantain natural ordering of elements)
	/*	TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("B");
		treeset.add("C");
		treeset.add("A");
		System.out.println(treeset);
		treeset.remove("A");

		System.out.print(treeset);   
		
		 output
		 [A, B, C]
         [B, C]
		 */
		
		
		// Map
		
/*		HashMap<String,Integer> map = new  HashMap<>();
		
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		System.out.println("Size of map is "+map.size());
		System.out.println(map);
		
		
		if(map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("The value for key"+" a "+"is :"+a);
		}
		System.out.println();
		for(String key:map.keySet())
		{
			System.out.println("key: "+key+", value: "+map.get(key));
		}
		System.out.println();
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("key :"+entry.getKey()+", value:"+entry.getValue());
		}
		
		output :
			Size of map is 3
			{a=10, b=20, c=30}
			The value for key a is :10

			key: a, value: 10
			key: b, value: 20
			key: c, value: 30

			key :a, value:10
			key :b, value:20
			key :c, value:30
*/
		
		// TreeMap (Automatically sorts the elements)
		
/*		TreeMap<Integer,String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "A");
		treeMap.put(2, "B");
		treeMap.put(1, "C");
		
		System.out.println(treeMap);
		
		for(Integer key:treeMap.keySet())
			System.out.println("Key: "+key+", value:"+treeMap.get(key));
		
		output :
		{1=C, 2=B, 3=A}
		Key: 1, value:C
		Key: 2, value:B
		Key: 3, value:A
*/
		// Stacks (LIFO : Last in first out)
/*
		Stack<String> stack = new Stack<String>();
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		System.out.println(stack.pop());
	    System.out.println(stack.peek());
		System.out.println("stack: "+stack);
		
	    output :
		India
		Germany
		stack: [America, Germany]  */
		
		
	}

}
