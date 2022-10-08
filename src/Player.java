import javax.swing.JLabel;

public class Player {
	public JLabel name;
	public JLabel scoreLabel;
	public JLabel wordsLabel[];
	public int numberOfWords;
	int score;
	Player(){
		scoreLabel = new JLabel();
		wordsLabel = new JLabel[10];
		for (int i = 0; i < wordsLabel.length; i++) {
			wordsLabel[i] = new JLabel();
		}
		name = new JLabel();
		score = 0;
		numberOfWords = 0;
	}
	
}
