package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args) {
		//呼叫方法
		try {
			checkFile("c:\\JavaWorkspace\\JavaLab\\122.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("done");
		
	}
	
	public static void checkFile(String filePath) throws FileNotFoundException{
		File file = new File(filePath);
		if ( !file.exists() ) {
			//產生exception物件
			//FileNotFoundException fne = new FileNotFoundException(filePath);
			//throw fne;
			throw new FileNotFoundException(filePath);//寫成一行
			//System.out.println("123");不會被執行到的程式,因為已經throw fne;
		}
		
		
		
	}

}
