import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author ubuntu
 *
 */
public class HelloTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("UP");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Down");
	}

	/**
	 * Test method for {@link Hello#Hello()}.
	 */
	@Test
	public void testHello() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Hello#calculate(int)}.
	 */
	@Test
	public void testCalculate() {
		fail("Not yet implemented");
	}

}
