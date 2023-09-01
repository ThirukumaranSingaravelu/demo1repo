

class Student {
	int id ;
	String name;
	void insert(int i,String j) {
		id = i;
		name = j;
		}
		
	void display() {System.out.println(id +" "+ name);}
	}


	
	
	

public class TestStudent
{
  public static void main(String args[]) 
  {
      int n = 5 		 ;  // Number of rows.
 
      //Outer Loop for number of Rows
      for(int i=0;i<n;i++)
      {
          // printing '*' in each column.
          for(int j=n;j>i;j--)
          {
            // We print '*' for only first and last column and for first row.
            if(j==n || j==i+1 || i==0)
            System.out.print("* ");
            // Otherwise we print Blank Space
            else
            System.out.print("  ");
          }
 
          System.out.println();
      }
  }
}  
	 
	


