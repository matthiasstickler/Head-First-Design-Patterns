package headfirst.designpatterns.combining.observer;
/**
 * Abstract Class for all Duckfactories
 */
public abstract class AbstractDuckFactory {
	// Specific Ducks
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
