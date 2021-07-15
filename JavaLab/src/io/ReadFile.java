package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		//try with resourse,IO,JDBC(close db connection)
		try( FileInputStream fis = new FileInputStream("C:\\Java\\io_1.txt");	
				BufferedInputStream bis = new BufferedInputStream (fis);
				) {//binary二進位
			
			System.out.println("available="+bis.available());//file.length()
			
			int data = bis.read();//讀一個byte,回傳-1表示讀完了
			char c = (char)data;//中文不行這樣用,英數可以(Ascii Table)
			System.out.println(c);
			System.out.println(data);
			System.out.println("available="+bis.available());//file.length()
			while((data=bis.read()) != -1) {
				System.out.println( (char)data );
			}
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
