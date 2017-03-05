package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	VendingMachineItem venMach;
	VendingMachineItem A, B, C, D;
	@Before
	public void setUp() throws Exception {
		
		
			
		 A = new VendingMachineItem( "cookies", 1.25);
		 B = new VendingMachineItem("chips",1.00);
		 C = new VendingMachineItem("candy",1.50);
		 D = new VendingMachineItem("pretzels",2.00);
	}


	@Test
	public void testVendingMachineItem() {
	
		
		assertEquals(A.getName(),"cookies");
		assertEquals(A.getPrice(),1.25,.001);
		
		
		A = new VendingMachineItem( "cookies", -1.25);
	}

	@Test
	public void testGetName() {
		A.getName();
		
		assertEquals(A,A.getName());
	}

	@Test
	public void testGetPrice() {
		B.getPrice();
		assertEquals(B,B.getPrice());
	}
	@After
	public void tearDown() throws Exception {
		
		A=null;
		B=null;
		C=null;
		D=null;
	}

	
}
