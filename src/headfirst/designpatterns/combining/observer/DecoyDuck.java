package headfirst.designpatterns.combining.observer;
/**
 * Decoy Duck
 * This type of duck doesn't quack so it produces silence.
 * 
 */
public class DecoyDuck implements Quackable {
	Observable observable;
	/**
	 * Initialise the observer object in the constructor
	 */
	public DecoyDuck() {
		observable = new Observable(this);
	}
	/**
	 * Produce silence upon quacking and notify the obervers
	 */
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
	/**
	 * Register to the observer
	 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
	/**
	 * Notify the observers
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
	/**
	 * 
	 */
	public String toString() {
		return "Decoy Duck";
	}
}
