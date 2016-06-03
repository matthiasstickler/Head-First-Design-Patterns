package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;
/**
 * Observer-Pattern
 * The Observable Class provides all the methods our observers need
 */
public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
	/**
	 * Initialise ducks
	 * @param duck(s)
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	/**
	 * Register to the Observer
	 * @param observer
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	/**
	 * Iterate through our observers and notify them
	 */
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
	/**
	 * An Iterator to iterate through our observers
	 */
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
