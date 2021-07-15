package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckException {

	public static void main(String[] args) throws IOException{
		//可用 兩個反斜線\\ 或者 單斜線/ 作為目錄區隔符號
		//游標到FileReader按ctrl+1:fix
		FileReader fr = new FileReader("c:\\JavaWorkspace\\JavaLab\\122.txt");
		//FileReader fr = new FileReader("c:/java/aaa.txt");
		System.out.println("done");
		
	}

}
