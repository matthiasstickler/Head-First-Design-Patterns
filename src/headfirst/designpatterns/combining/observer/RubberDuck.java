package headfirst.designpatterns.combining.observer;
/**
 * Strategy-Pattern
 * The Rubberduck squeaks instead of quack
 */
public class RubberDuck implements Quackable {
	Observable observable;
	/**
	 * Initialise an observable object, so we can
	 * notice the ducks quacks
	 */
	public RubberDuck() {
		observable = new Observable(this);
	}
	/**
	 * Let the Rubberduck quack and notify the observers
	 */
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}
	/**
	 * Register to the observer
	 * @param observer
	 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
	/**
	 * Notify our observers
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
	/**
	 * @return Rubber Duck
	 */
	public String toString() {
		return "Rubber Duck";
	}
}
