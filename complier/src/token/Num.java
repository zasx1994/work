package token;

public class Num extends Token {
	public final int value;
	public Num(int t) {
		super(Tag.NUM);
		this.value = t;
	}
	
	public String toString(){
		return " "+this.value;
	};

}
