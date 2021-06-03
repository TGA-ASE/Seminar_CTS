package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.IStudent;

public class TestCaseGetPromovabilitate {
	
	private IStudent ss=new StudentStub();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPromovailitate() {
		Grupa grupa=new Grupa(1010);
		grupa.adaugaStudent(ss);
		assertEquals(1, grupa.getPromovabilitate(),0.001f);
		
	}

}
