import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

public class Shortest_path {

	Matrix_creation object =new Matrix_creation();
	public ExpectedException thrown = ExpectedException.none();

	
	
	
	
	

	
	

	@Test
	public void test()  {
		
		object.sizeOfMatrix(5, 6);
		int[] x={3,4,1,2,8,6,
				 6,1,8,2,7,4,
				 5,9,3,9,9,5,
				 8,4,1,3,2,6,
				 3,7,2,8,6,4
				 };
		
		   try {
			   object.setEelementsInMatrix(x);
		       // fail("Should throw an exception if one or more of given numbers are negative");
		    } catch (Exception e) {
		       
		    
		    }
		
	


		
				
		object.display_matrix();
	}

	@Test 
	public void findShortPath()
	{
		test();
		object.path_weight();
		
	}
	
	
}
