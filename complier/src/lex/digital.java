package lex;

import main.main;

public class digital {
	int state = 0;

	public void handle() {
		boolean end = false;
		while (!end) {
			switch (state) {
			case 0:
				char c = main.nextchar();
				if(c>=47&&c<=57)
					state=1;
				else if(c==16) {
				System.out.println("end");
				return;
				}
				else {
				System.out.println("faild");
				}
				break;
			case 1:
				c = main.nextchar();
				if(c>=47&&c<=57) {
					state = 1;
				}
				else if(c=='.') {state=2;}
				else {
					System.out.println("Êý×Ö");
					main.back();
					state = 0;
				}
				break;
			case 2:
				c = main.nextchar();
				if(c>=47&&c<=57) {
					state = 3;
				}
				else{
					System.out.println("faild");
					main.back();
					state = 0;
				};break;
			case 3:
				c = main.nextchar();
				if(c>=47&&c<=57) {
					state = 1;
				}
				else {
					System.out.println("Êý×Ö");
					main.back();
					state = 0;
				}
				break;			
			}
		}

	}

}
