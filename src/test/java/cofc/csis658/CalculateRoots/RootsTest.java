package cofc.csis658.CalculateRoots;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import static org.junit.Assert.*;
import org.junit.*;

public class RootsTest{
	
	private double a, b, c;
	
	@Test
	public void checkQEqualsZero() {
		a = 0;
		b = 0;
		c = 0;
		Roots r = new Roots(a,b,c);
		assertEquals(r.num_roots(), 1);	
		assert(Double.isNaN(r.first_root()));
		//checking to see that first_root is not a number because of division by 0
	}
	
	@Test
	public void HasNoRoots() {
		a = 2;
		b = 3;
		c = 5;
		
		Roots r = new Roots(a,b,c);
		assertEquals(r.num_roots(), 0);
		assert(r.first_root() == -1);
		assert(r.second_root() == -1);
	}
	
	@Test
	public void hasTwoRoots(){
		a = 1;
		b = 3;
		c = -4;
		
		Roots r = new Roots(a,b,c);
		assert(r.first_root() == 1);
		assert(r.second_root() == -4);
		assertEquals(r.num_roots(), 2);
		
	}
	
	@Test
	public void checkQGreaterThanZeroAndaNotZero() {
		a = 1;
		b = 3;
		c = 0;
		//roots should be -3 and 0
		//q > 0 -- would be 9 
		Roots r = new Roots(a,b,c);
		assert(r.first_root() == 0);	
		assert(r.second_root() == -3);	
		assert(r.num_roots() == 2);
	}
	
	@Test
	public void checkQGreaterThanZeroAndaZero() {
		a = 0;
		b = 5;
		c = -1;

		Roots r = new Roots(a,b,c);
		assertEquals(r.num_roots(), 0);
		assert(r.first_root() == -1);
		assert(r.second_root() == -1);	
	}
	

}