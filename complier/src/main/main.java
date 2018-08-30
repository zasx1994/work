package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import lex.digital;
import lex.operation;

public class main {
	
	public static  int index = -1;
	public static String a;
	
	public static void main(String args[]) {
	 a = read();
	 digital o = new digital();
	 o.handle();
	}
	
	public static String read() {
		File file = new File("code.txt");
		Long filelength = file.length();  
	    byte[] filecontent = new byte[filelength.intValue()];  
	    FileInputStream in;
		try {
			in = new FileInputStream(file);
		    in.read(filecontent);  
		    in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		try {
		  return new String(filecontent,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";	
	};
	
	public static char nextchar() {
		try {
			index++;
			char b = a.charAt(index);
			return b;
			}
			catch(Exception e){
				return 16;
			}	
	}
	public static void back() {
		index--;
	}

}
