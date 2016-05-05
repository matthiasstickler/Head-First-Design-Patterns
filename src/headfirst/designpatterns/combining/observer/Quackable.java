package headfirst.designpatterns.combining.observer;
/**
 * Interface for the ducks which can quack
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
