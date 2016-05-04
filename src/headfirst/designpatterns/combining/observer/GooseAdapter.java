package headfirst.designpatterns.combining.observer;
/**
 * The GooseAdapter lets the goose pretend to be a duck
 */
public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;
	/**
	 * Implements a gooseobject and an observerobject
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
	/**
	 * We let the goose honk and notify the observers
	 */
	public void quack() {
		goose.honk();
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
	 * notify the observers
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
	/**
	 * @return Goose pretending to be a Duck
	 */
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
