package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		
		//1.取得對方網站的InputStream
		URL url = new URL("https://c.ecimg.tw/items/DYAO0HA9008ND16/000001_1559013628.jpg");
		try( InputStream openStream = url.openStream();
				FileOutputStream fos = new FileOutputStream("C:\\Java\\圖片.jpg");//看你下載的副檔名是什麼
				//Buffered
				BufferedInputStream bis = new BufferedInputStream(openStream);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
		        ){
	            byte[] buffer = new byte[1024];
				int length;
				while ( (length=bis.read(buffer)) != -1 ) {
				    bos.write(buffer,0,length);
				}
				System.out.println("finish");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}