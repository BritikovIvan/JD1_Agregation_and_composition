package by.htp.task1.main;

import by.htp.task1.entity.Sentence;
import by.htp.task1.entity.Text;
import by.htp.task1.entity.Word;
import by.htp.task1.view.TextPrinter;

public class Main {

	public static void main(String[] atgs) {
		String title = "Aggregation and composition";
		Sentence s1 = new Sentence();
		s1.setSentence(new Word("Create"));
		s1.setSentence(new Word("an"));
		s1.setSentence(new Word("object"));
		s1.setSentence(new Word("of"));
		s1.setSentence(new Word("class"));
		s1.setSentence(new Word("Text"));
		
		Sentence s2 = new Sentence();
		s2.setSentence(new Word("Complete"));
		s2.setSentence(new Word("the"));
		s2.setSentence(new Word("text,"));
		s2.setSentence(new Word("display"));
		s2.setSentence(new Word("the"));
		s2.setSentence(new Word("text"));
		s2.setSentence(new Word("and"));
		s2.setSentence(new Word("title"));
		s2.setSentence(new Word("on"));
		s2.setSentence(new Word("the"));
		s2.setSentence(new Word("console"));

		Text text = new Text();
		text.setTitle(title);
		text.setText(s1);
		text.setText(s2);

		TextPrinter printer = new TextPrinter();
		printer.print(text);
	}

}
