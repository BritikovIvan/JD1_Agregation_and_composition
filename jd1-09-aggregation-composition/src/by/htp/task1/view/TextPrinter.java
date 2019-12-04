package by.htp.task1.view;

import by.htp.task1.entity.Sentence;
import by.htp.task1.entity.Text;
import by.htp.task1.entity.Word;

public class TextPrinter {
	
	public void print(Text text) {
		System.out.println(" " + text.getTitle() + "\n");
		
		for (Sentence s : text.getText()) {
			for (Word w : s.getSentence()) {
				System.out.print(" " + w.getWord());
			}
			System.out.print(".");
		}
	}
	
}
