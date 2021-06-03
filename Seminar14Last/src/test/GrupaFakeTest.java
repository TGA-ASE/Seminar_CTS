package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.IStudent;

public class GrupaFakeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void PromovobalitateFaraRestanteTest() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestante(false);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		assertEquals(1, grupa.getPromovabilitate(), 0.01f);
	}
	
	@Test
	public void PromovobalitateCuRestanteTest() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestante(true);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		assertEquals(0, grupa.getPromovabilitate(), 0.01f);
	}

}
