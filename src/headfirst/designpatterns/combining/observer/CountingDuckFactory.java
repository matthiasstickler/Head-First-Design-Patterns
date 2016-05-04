package headfirst.designpatterns.combining.observer;
/**
 * Specific Duckfactory which counts every Quack
 * comming from either Mallard, Redhead or Rubberduck.
 * Additionally it counts the Duckcall too
 * 
 * 
 */
public class CountingDuckFactory extends AbstractDuckFactory {
	/**
	 * Create the Mallard Duck
	 */
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
	/**
	 * Create the Redhead Duck
	 */
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
	/**
	 * Create the Duck Call
	 */
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
	/**
	 * Create the Rubber Duck
	 */
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
