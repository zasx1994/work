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
				if(c=='=')System.out.println("С�ڵ���");
				else if(c=='>')System.out.println("������");
				else {main.back();System.out.println("С��");}
				state = 0;
				break;
			case 5:
				System.out.println("����");
				state = 0;
				break;
			case 6:
				c = main.nextchar();
				if(c=='=')System.out.println("���ڵ���");
				else {main.back();System.out.println("����");}
				state = 0;
				break;
			}	
		    }	
		    
	}
	


}
