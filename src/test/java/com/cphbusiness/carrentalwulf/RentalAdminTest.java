/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.carrentalwulf;

import java.io.FileNotFoundException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class RentalAdminTest {
	RentalAdmin rentalAdmin;
	CarFactory myCarFactory;
	String filename;

	
	public RentalAdminTest() {
	}
	
	@Before
	public void setUp() {
		rentalAdmin = new RentalAdmin("kurt");
		myCarFactory = new CarFactory();
		filename = "ncars4.csv";
		filename = "/Users/thor/NetBeansProjects/CarRentalWulf/src/main/java/com/cphbusiness/carrentalwulf/ncars4.csv";

	}

	@Test
	public void testSomeMethod() throws FileNotFoundException {
		boolean found = rentalAdmin.createCarsFromFile(filename);
		boolean expected = true;
		assertTrue(found==expected);
	}
	
}
