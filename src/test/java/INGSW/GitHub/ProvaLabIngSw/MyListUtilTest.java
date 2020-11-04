package INGSW.GitHub.ProvaLabIngSw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.joda.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil l;
	
	@BeforeClass
	public static void preparaClasse() {
		l = new MyListUtil();
		System.out.println("Sto preparando la classe per il test -> " + LocalDateTime.now());
	}
	
	@AfterClass
	public static void endTest() {
		System.out.println("Test della classe terminato -> " + LocalDateTime.now());
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Sto preparando il test -> " + LocalDateTime.now());
	}
	
	@After
	public void afterTest() {
		System.out.println("Test terminato -> " + LocalDateTime.now());
	}
	
	@Test
	public void testOrdinaCrescente() {		
		assertEquals(Arrays.asList(1,2,3,4), l.ordinaCrescente());
		assertNotEquals(Arrays.asList(4,3,2,1), l.ordinaCrescente());
	}
	
	@Test
	public void testOrdinaDecrescente() {		
		assertEquals(Arrays.asList(4,3,2,1), l.ordinaDecrescente());
		assertNotEquals(Arrays.asList(1,2,3,4), l.ordinaDecrescente());
	}
}
