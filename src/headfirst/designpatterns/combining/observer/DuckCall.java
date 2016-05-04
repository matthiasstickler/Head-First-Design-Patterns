package headfirst.designpatterns.combining.observer;
/**
 * Duck Call
 * This is not a Duck but still produces the quack
 */
public class DuckCall implements Quackable {
	Observable observable;
	/**
	 * Initialise the observer object in the constructor
	 */
	public DuckCall() {
		observable = new Observable(this);
	}
	/**
	 * Produce the quack and notify the observers
	 */
	public void quack() {
		System.out.println("Kwak");
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
	 * Notify the observers
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
