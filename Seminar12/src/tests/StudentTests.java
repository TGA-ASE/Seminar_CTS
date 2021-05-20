package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase.Student;

class StudentTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCostructorRightName() {
		String nume="Andrei";
		Student  student=new Student(nume);
		assertEquals(nume,student.getNume());
	}
	
	@Test
	void addNotaToList() {
		
		Student  student=new Student();
		int nota=8;
		student.adaugaNota(nota);

		
		assertEquals(nota,student.getNota(0));

	}
	
	@Test
	void testListSize() {
		
		Student  student=new Student();
		int nota=8;
		student.adaugaNota(nota);

		
		assertEquals(1,student.getNote().size());

	}
	

}
