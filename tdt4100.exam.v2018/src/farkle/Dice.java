package farkle;

import java.util.Collection;
import java.util.function.Supplier;

/**
 * Represents a set of die values. A die has six possible values 1-6,
 * but the number of dice may vary from Dice instance to Dice instance.
 * In addition, a Dice-instance can have a score.
 */
public class Dice implements Iterable<Integer> {

	/**
	 * @param dieCount
	 * @return a collection of random integer values in the range 1-6
	 */
	public static Collection<Integer> randomDieValues(final int dieCount) {
		// ???
	}

	// fields (part 1) ???

	/** (part 1)
	 * Initializes this Dice with the values in dieValues, and a score.
	 * @param dieValues
	 * @param score the score to set, may be -1 for yet unknown
	 * @throws a suitable exception if the die values are outside the valid range
	 */
	public Dice(final Collection<Integer> dieValues, final int score) {
		// ???
	}

	/** (part 1)
	 * Initializes this Dice with dieCount random values (using Math.random())
	 * @param dieCount
	 */
	public Dice(final int dieCount) {
		// ???
	}

	/** (part 1)
	 * Initializes this Dice with the values in dice, and a score
	 * @param dieValues // Denne skulle vært bare "dice", ikke "dieValues"
	 * @param score the score to set, may be -1 for yet unknown
	 */
	public Dice(final Dice dice, final int score) {
		// ???
	}

	/** (part 18)
	 * Initializes this Dice with n die values provided by the supplier argument.
	 * @param dieCount the number of dice to "throw"
	 * @param supplier provides the die values
	 */
	public Dice(final int dieCount, final Supplier<Integer> supplier) { ... }

	/** (part 2)
	 * Format: [die1, die2, ...] = score (score is omitted when < 0)
	 */
	/// method for generating a String representation of a Dice instance ???

	/** (part 2)
	 * Parses a string using the toString format (see above) and
	 * returns a corresponding Dice.
	 * @param s
	 * @return a new Dice instance initialized with die values and score from the String argument
	 */
	public static Dice valueOf(final String s) {
		// ???
	}

	/** (part 3)
	 * @return the number of die values
	 */
	public int getDieCount() {
		// ???
	}

	/** (part 3)
	 * @param dieNum
	 * @return the value of die number dieNum
	 */
	public int getDieValue(final int dieNum) {
		// ???
	}

	/** (part 3)
	 * @param value
	 * @return the number of dice with the provided value
	 */
	public int getValueCount(final int value) {
		// ???
	}

	/** (part 4)
	 * @return the current score
	 */
	public int getScore() {
		// ???
	}

	/** (part 4)
	 * Sets the score, but only if it isn't already set to a non-negative value
	 * @param score
	 * @throws a suitable exception if score already is set to a non-negative value
	 */
	public void setScore(final int score) {
		// ???
	}

	// ... Iterable methods (part 5) ???

	/** (part 6) // Denne ble det ikke spurt om, og det var ikke meningen at den skulle implementeres, men den kunne brukes
	 * @param dice
	 * @return true if all die values in the argument appear in this Dice
	 */
	public boolean contains(final Dice dice) {
		// ???
	}

	/** (part 6)
	 * @param dices a Collection of Dice // Denne linja var feil, det skulle være bare "dice a Dice"
	 * @return a new Dice instance with the all the die values this Dice and
	 * all Dice in the argument, without any specific order
	 */
	public Dice add(final Dice dice) {
		// ???
	}

	/** (part 6)
	 * @param dice
	 * @return a new Dice instance with the die values from this Dice, but
	 * without those from the argument, without any specific order
	 */
	public Dice remove(final Dice dice) {
		// ???
	}
}

