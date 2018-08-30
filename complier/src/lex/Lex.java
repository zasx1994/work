package lex;

public class Lex {
	public static  int index;
	public static String a;
	public static int preindex;
	private digital digital;
	private operation operation;
	private int state;
	
	public void init(String a) {
		this.a = a;
		this.index = -1;
		this.preindex = 0;
		this.digital = new digital();
		this.operation = new operation();
		this.state = 0;
		
	}
	
	public void run() {
		while(true) {
			switch(state){
			case 0:
				char c = a.charAt(preindex);
				if(isdigital(c))state = 1;
				else if(isoperation(c))state = 2;
				else if(iswhitespace(c))state =3;
				else if(c==16)return;
				break;
			};
		}	
	}
	
	private boolean isdigital(char c) {
        if(47<c&&c<58)
		return true;
        else
        return false;
	}
	
	private boolean isletter(char c) {
        if(64<c&&c<91) {
        	if(96<c&&c<123)
		        return true;
        	else
                return false;}
        else
        return false;
	}
	
	private boolean isoperation(char c) {
		char[] accept = {'<','>','='};
		for(int i=0;i<accept.length;i++) {
			if(c==accept[i])
				return true;
		};
		return false;
	}
	
	private boolean iswhitespace(char c) {
		char[] accept = {'\n','\t',0};
		for(int i=0;i<accept.length;i++) {
			if(c==accept[i])
				return true;
		};
		return false;
	}
	
	
	
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
	
	public static char currentchar() {
		try {
			char b = a.charAt(preindex);
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
