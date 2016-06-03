package headfirst.designpatterns.combining.observer;
/**
 * Strategy-Pattern
 * Readheaduck 
 */
public class RedheadDuck implements Quackable {
	Observable observable;
	/**
	 * Initialise an observable object, so we can
	 * notice the ducks quacks
	 */
	public RedheadDuck() {
		observable = new Observable(this);
	}
	/**
	 * Let the RedheadDuck quack and notify the observers
	 */
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
	/**
	 * Register to an observer
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
	 * @return Redhead Duck
	 */
	public String toString() {
		return "Redhead Duck";
	}
}
