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
		object.path_weight();
	}
	
	@Test
	   public void test2()  {
			
				object.sizeOfMatrix(5,6);
				int[] x={3, 4, 1, 2, 8, 6,
						6, 1, 8, 2, 7, 4,
						5, 9, 3, 9, 9, 5,
						8, 4, 1, 3, 2, 6,
						3, 7, 2, 1, 2, 3, };
				
				   try {
					   object.setEelementsInMatrix(x);
				       // fail("Should throw an exception if one or more of given numbers are negative");
				    } catch (Exception e) {
				       
				    
				    }

					object.display_matrix();
					object.path_weight();
	   }
	
	@Test
	   public void test3()  {
			
				object.sizeOfMatrix(3,5);
				int[] x={19, 10, 19, 10, 19,
						21, 23, 20, 19, 12,
						20, 12, 20, 11, 10};
				
				   try {
					   object.setEelementsInMatrix(x);
				       // fail("Should throw an exception if one or more of given numbers are negative");
				    } catch (Exception e) {
				       
				    
				    }

					object.display_matrix();
					object.path_weight();
	   }

	
	@Test
	   public void test4()  {
			
				object.sizeOfMatrix(5,1);
				int[] x={5,
						8,
						5,
						3,
						5};
				
				   try {
					   object.setEelementsInMatrix(x);
				       // fail("Should throw an exception if one or more of given numbers are negative");
				    } catch (Exception e) {
				       
				    
				    }

					object.display_matrix();
					object.path_weight();
	   }
	
	@Test
	   public void test13()  {
			
				object.sizeOfMatrix(2,20);
				int[] x={1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
						 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
						 };
				
				   try {
					   object.setEelementsInMatrix(x);
				       // fail("Should throw an exception if one or more of given numbers are negative");
				    } catch (Exception e) {
				       
				    
				    }

					object.display_matrix();
					object.path_weight();
	   }
	
	
	
	
	
}
