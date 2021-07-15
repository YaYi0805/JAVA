package io;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;


public class TestFile {

	public static void main(String[] args) {
		
		Set<File> fileSet = new TreeSet<>((o1, o2) -> {
			if(o1.length() < o2.length()) {
				return -1;
			}else {
				return 1;
			}
			}) ;
				
		
		File dir = new File("c:\\Java");
		File[] list = dir.listFiles();
		int counter = 0;//Lab
		long size = 0;//Lab
		for(File f : list) {
			
			System.out.println(f.getName()+" 目錄:"+f.isDirectory());
			long lastModified = f.lastModified();//修改時間
			Date date = new Date(lastModified);
            //SimpleDateFormat format	= new SimpleDateFormat("yyy/MM/dd a hh:mm");
            DateFormat format	= new SimpleDateFormat("yyy/MM/dd a hh:mm");
			System.out.println(format.format(date));
			if(!f.isDirectory()) {//Lab
				counter++;
				size += f.length();
				fileSet.add(f);
			}
		}
		
		System.out.println("檔案總數="+counter);//Lab
		System.out.println("檔案大小總和="+size+"bytes");//Lab
		//Lab
		for (File f : fileSet ) {
			System.out.println("名稱:"+f.getName()+",大小"+f.length());
		}

	}

}
