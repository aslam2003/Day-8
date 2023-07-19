import java.io.*;
public class FilereadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter fw=new FileWriter("C:\\Users\\Lenovo\\Desktop\\Ballon.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Aslam");
		bw.close();
   
	}
		catch(Exception e) {
			System.out.println("File is missing");
		}

}
}
