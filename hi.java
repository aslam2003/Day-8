import java.lang.Exception;
import java.util.Scanner;
class DetailsException extends Exception{
	DetailsException(String msg){
		super(msg);
	}
}
public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Scanner sc=new Scanner(System.in);
		     String name="Aslam";
		     String student_name;
		     System.out.println("Enter student name:");
		     student_name=sc.next();
		     try {
		     if(student_name!=name) {
		    	 throw new DetailsException("Wrong name");
		     }
		     }
		     catch(DetailsException e) {
		    	 e.printStackTrace();
		     }
		    
			}

		
	}


