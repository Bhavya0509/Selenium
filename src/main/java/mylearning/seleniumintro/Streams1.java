package mylearning.seleniumintro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;


public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//give count of all the names starting with a
		
		/*ArrayList<String> names= new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count =0;
		for(int i=0;i<names.size();i++) {
			if(names.get(i).startsWith("A")) {
				count ++;
			}
		}
		System.out.println(count);
		
		*/
		
		//streamFilter();
		//streamMap();
		streamCollect();
	}
		// doing the same program using streams 
		
		public static void streamFilter() {
			ArrayList<String> names= new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Ram");
			
			Long c= names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			//we can also directly create stream instead of converting our collection to stream
			//we can write lambda expressions in curly braces if there is more than one  filter(s->{
			//})
			
			Long d= Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
				
			     s.startsWith("A")).count();
			
			System.out.println(d);
			
			
			//if length of name is greater than 4 then return it
			
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			
			//now if we want to print only one result
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		}
		
		
		
        public static void streamMap() {
        	ArrayList<String> names= new ArrayList<String>();
    		names.add("man");
    		names.add("Don");
    		names.add("women");
        	
        	// names which have last letter as a and convert them in uppercase
        	
        	Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
        	.forEach(s->System.out.println(s));
        	
        	// names which has first letter a with uppercase and sorted
        	Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted()
        	.forEach(s->System.out.println(s));
        	
        	//merging two lists
            List<String> names1=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
           Stream<String> newstream= Stream.concat(names.stream(), names1.stream());
          // newstream.sorted().forEach(s->System.out.println(s));
           
           // to see if adam is present in newStream or not
          Boolean flag= newstream.anyMatch(s->s.equalsIgnoreCase("adam"));
          System.out.println(flag);
          Assert.assertTrue(flag);
        	
        }
        
        public static void streamCollect() {
        	
        	//convert back to list and get first element
        	List<String> nl=Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
        			.collect(Collectors.toList());
        	System.out.println(nl.get(0));
        	
        	
        	// given an array print the unique number from this array and sort the array
        	List<Integer> numbers=Arrays.asList(3,2,2,7,5,1,9,7);
        	numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
        }

}
