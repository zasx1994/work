package lex;



public class digital {
	int state = 0;

	public void handle() {
		Lex.index = Lex.preindex;
		while (true) {
			switch (state) {
			case 0:
				char c = Lex.nextchar();
				if(c>=47&&c<=57)
					state=1;
				else if(c==16) {
				System.out.println("end");
				return;
				}
				else {
				System.out.println("faild");
				return;
				}
				break;
			case 1:
				c = Lex.nextchar();
				if(c>=47&&c<=57) {
					state = 1;
				}
				else if(c=='.') {state=2;}
				else {
					System.out.println("Êý×Ö");
					Lex.back();
					state = 0;
					return;
				}
				break;
			case 2:
				c = Lex.nextchar();
				if(c>=47&&c<=57) {
					state = 3;
				}
				else{
					System.out.println("faild");
					Lex.back();
					state = 0;
					return;
				};break;
			case 3:
				c = Lex.nextchar();
				if(c>=47&&c<=57) {
					state = 3;
				}
				else {
					System.out.println("Êý×Ö");
					Lex.back();
					state = 0;
					return;
				}
				break;			
			}
		}

	}

}
