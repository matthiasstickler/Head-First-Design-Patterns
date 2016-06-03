package headfirst.designpatterns.combining.observer;
/**
 * Strategy-Pattern
 * Interface for the ducks which can quack
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
