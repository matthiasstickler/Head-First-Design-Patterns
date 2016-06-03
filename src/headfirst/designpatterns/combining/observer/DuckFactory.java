package headfirst.designpatterns.combining.observer;
/**
 * Factory-Pattern
 * Specific Duckfactory
 * Just creates Ducks
 */
public class DuckFactory extends AbstractDuckFactory {
	/**
	 * Create the Mallard Duck
	 */
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
	/**
	 * Create the Redhead Duck
	 */
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
	/**
	 * Create the Duck Call
	 */
	public Quackable createDuckCall() {
		return new DuckCall();
	}
	/**
	 * Create the RubberDuck
	 */
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
