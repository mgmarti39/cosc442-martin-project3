package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	VendingMachine venMach;
	VendingMachineItem A, B, C, D;
	
	@Before
	public void setUp() throws Exception {
		
		 venMach = new VendingMachine();
		
		 A = new VendingMachineItem( "cookies", 1.25);
		 B = new VendingMachineItem("chips",1.00);
		 C = new VendingMachineItem("candy",1.50);
		 D = new VendingMachineItem("pretzels",2.00);
		
		
		
	}
	
	@Test
	public void testGetSlotIndex(){
	venMach.getSlotIndex("A");
	
	venMach.getSlotIndex("Z");	
	assertEquals(A,venMach.getSlotIndex("A"));
	}

	@Test
	public void testAddItem() {
	venMach.addItem(A,"A");
	venMach.removeItem("A");
	
	venMach.addItem(B, "B");
	venMach.addItem(C, "C");
	venMach.removeItem("B");
	
	venMach.addItem(C, "C");
	
	assertEquals(B,B.getName());
	
	}

	@Test
	public void testRemoveItem() {
		venMach.addItem(C, "C");
		venMach.removeItem("C");
		venMach.removeItem("A");
		
		assertEquals(C,C.getName());
	}

	@Test
	
	public void testInsertMoney() {
		venMach.addItem(A,"A");
		venMach.insertMoney(1.25);
		venMach.insertMoney(-1.00);
		assertEquals(A,A.getPrice());
	}

	@Test
	public void testGetBalance() {
		venMach.addItem(C, "C");
		venMach.insertMoney(1.50);
		
		venMach.addItem(D, "D");
		venMach.insertMoney(2.00);
		
		venMach.getBalance();
		
		assertEquals(1.50,venMach.getBalance(),.001);
	}

	@Test
	public void testMakePurchase() {
		venMach.addItem(D, "D");
		venMach.insertMoney(2.00);
		
		venMach.makePurchase("D");
		
		assertEquals(2.00,C.getPrice(),.001);
	}

	@Test
	public void testReturnChange() {
		venMach.addItem(C, "C");
		venMach.insertMoney(1.50);
		
	
		
		venMach.returnChange();
		assertEquals(1.50,venMach.getBalance(),.001);
	}
	@After
	public void tearDown() throws Exception {
		A=null;
		B=null;
		C=null;
		D=null;
		venMach=null;
		
	}
}
