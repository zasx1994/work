package token;

public class Word extends Token{
	public String lexme = "";
	public Word(String value,int tag) {
		super(tag);
		lexme = value;
	}
	public String toString() {
		return " " + lexme;
	};
	
	public static final Word
	and = new Word("&&" , Tag.AND),
	eq = new Word("==",Tag.EQ);
}
