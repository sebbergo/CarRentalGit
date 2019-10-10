/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.carrentalwulf;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class WriteHTMLTest {
	WriteHTML myWriteHTML;
	Garage myGarage;
	Car myCar;
	
	public WriteHTMLTest() {
	}
	
	@Before
	public void setUp() {
		myWriteHTML = new WriteHTML();
		myGarage = new Garage();
		myCar = new Car("Audi","A4","1.8T",22,3252);
		myGarage.addCar(myCar);
	}

	@Test
	public void testWriter() throws IOException {
		myWriteHTML.deployData(myGarage);
	}
	
}
