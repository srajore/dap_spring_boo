import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface SaySometing { //FI,Single abstract Method(SAM)  -> lambda
	public String say(String name) ;   // Type inferance 
	
	//public String Bye(String name) ;
	
	default public void display() {
		
	}
	
	
}

/*class MyClass implements SaySometing{

	@Override
	public String say(String name) {
		
		return "Hey,How are you "+name ;
	}
	// protected void display(){} 
}*/


class MyTest{
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Ram","Seeta","Laxman","Ramesh");   // imutable list 
		
		/*List<String> namesStartWithR=new ArrayList();
		
		for(String name : names) {
			if(name.startsWith("R")) {
				namesStartWithR.add(name);
			}
		}
		
		System.out.println(" NAMES START WITH R ARE BELOW");
		
		System.out.println(namesStartWithR);*/  
		
		
		// terminal,intermidiate operation 
		
		Stream<String> stream = names.stream();
		
		Stream<String> stream2 = stream.filter(name -> name.startsWith("R"));
		
		List<String> list = stream2.collect(Collectors.toList());
		
		
		Stream<String> stream3 = stream.filter(name -> name.startsWith("R"));
		
		List<String> list2 = stream3.collect(Collectors.toList());
		
		
		
		//System.out.println(list);
		
		
		//List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
		
		
		//numbers.stream().filter((n)-> n%2==0).map( (n)-> n*2).forEach((n)-> System.out.println(n));
		
		
		//Sp .Stream :-  Lazy in nature   20 m 25 30 35 
		
		// ones the stream is used you cannot reuse the stream again. streams are not reusable 
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		SaySometing saySometing=(name) ->  "Hey,How are you "+name;
		
		// FI  Predicate,Function,Consumer,Supplier
		
		Predicate p;  // any type of input and returns you only boolean value , test
		
		Function f;  // test ,   any input and any type of value
		
		Consumer c;  // accept   only consume the value of any time but does not return anything
		
		Supplier s; // get ,   won't accept any arg but return any type of value 
					
	
		
		//System.out.println(saySometing.say("Laxman"));
		
		
		
		//MyClass mClass=new MyClass();
		
		//System.out.println(mClass.say("Ram"));
		
	}
}
