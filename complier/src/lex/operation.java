package lex;


public class operation {
	
	public  String a = "><";
	public  int index = -1;
	int state = 0;
	
	public  void handle() {
		    Lex.index = Lex.preindex;
		    while(true) {
			switch(state) {
			case 0:
				char c = Lex.nextchar();
				if(c=='<')state = 1;
				else if(c=='=')state = 5;
				else if(c=='>')state = 6;
				break;
			case 1:
				c = Lex.nextchar();
				if(c=='=')System.out.println("С�ڵ���");
				else if(c=='>')System.out.println("������");
				else {Lex.back();System.out.println("С��");}
				state = 0;
				return;
			case 5:
				System.out.println("����");
				state = 0;
				return;
			case 6:
				c = Lex.nextchar();
				if(c=='=')System.out.println("���ڵ���");
				else {Lex.back();System.out.println("����");}
				state = 0;
				return;
			}	
		    }	
		    
	}
	


}
