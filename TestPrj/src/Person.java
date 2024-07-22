import java.util.Objects;

public class Person extends Object implements Comparable{
	
	private int id;
	
	private String name;
	
	private int age;
	
	

	public Person() {
		super();
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
	  @Override public int hashCode() { System.out.println("HI"); return 30; }
	 

	@Override
	public boolean equals(Object obj) {
		System.out.println("Hello");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	
	public int compareTo(Object o) {
		
		
		
		Person o1=(Person)o; 
		
		if(o1.getId() > this.getId() )
		 return -1;
		
		else if (o1.getId() < this.getId())
			return 1;
		
		else if(o1.getId()== this.id)
			return 0;
		else
			return 5000;
	}
	
	
	
	
	

}
