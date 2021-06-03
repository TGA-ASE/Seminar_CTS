package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;

public class GrupaFakeTest {


	@Test
	@Category({UrgentTests.class, SpecialTests.class})
	public void testpromoNoRestante() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestanta(false);
		
		Grupa grupa = new Grupa(1012);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01f);
	}
	
	@Test
	@Category({NormalTests.class, SpecialTests.class})
	public void testpromoWithRestante() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestanta(true);
		
		Grupa grupa = new Grupa(1012);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(0, grupa.getPromovabilitate(), 0.01f);
	}

}