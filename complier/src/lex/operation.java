package lex;
import main.main;

public class operation {
	
	public  String a = "><";
	public  int index = -1;
	int state = 0;
	
	public  void handle() {
		    boolean end = false;
		    while(!end) {
			switch(state) {
			case 0:
				char c = main.nextchar();
				if(c=='<')state = 1;
				else if(c=='=')state = 5;
				else if(c=='>')state = 6;
				else if(c==16){System.out.println("end");
				return;}
				else {System.out.println("failed");};
				break;
			case 1:
				c = main.nextchar();
				if(c=='=')System.out.println("小于等于");
				else if(c=='>')System.out.println("不等于");
				else {main.back();System.out.println("小于");}
				state = 0;
				break;
			case 5:
				System.out.println("等于");
				state = 0;
				break;
			case 6:
				c = main.nextchar();
				if(c=='=')System.out.println("大于等于");
				else {main.back();System.out.println("大于");}
				state = 0;
				break;
			}	
		    }	
		    
	}
	


}
