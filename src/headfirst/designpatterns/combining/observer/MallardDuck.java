package headfirst.designpatterns.combining.observer;
/**
 * The MallardDuck does quack
 */
public class MallardDuck implements Quackable {
	Observable observable;
	/**
	 * Implement the observer
	 */
	public MallardDuck() {
		observable = new Observable(this);
	}
	/**
	 * We let the Mallardduck quack and notify the observers
	 */
	public void quack() {
		System.out.println("Quack");
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
	/**
	 * @return Mallard Duck
	 */
	public String toString() {
		return "Mallard Duck";
	}
}
