package farkle.fx;

import java.util.Collection;

import farkle.Dice;
import farkle.FarkleScoring;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DiceController {

	@FXML
	private TextField dieCountInput;

	@FXML
	private Label diceOutput;

	private final FarkleScoring scoring = new StandardFarkleScoring();

	@FXML
	public void handleThrowDice() {
		final Dice dice = new Dice(Integer.valueOf(dieCountInput.getText()));
		computeFarkleScore(dice);
		diceOutput.setText(dice.toString());
	}

	private void computeFarkleScore(final Dice dice) {
		final Collection<Dice> scores = scoring.computeDiceScores(dice);
		dice.setScore(scores.stream().mapToInt(Dice::getScore).sum());
	}
}
