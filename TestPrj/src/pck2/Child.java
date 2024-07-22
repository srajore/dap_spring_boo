package pck2;

import com.pck1.Base;

public class Child extends Base {
	
	public void test() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		
		Base b=new Base();
		
		//System.out.println(b.a);// ERROR 
	}

}
