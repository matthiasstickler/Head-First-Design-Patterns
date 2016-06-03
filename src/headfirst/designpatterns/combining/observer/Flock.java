package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;
/**
 * Strategy-Pattern
 * The Flock iterates through every duck and lists them
 */
public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
	/**
	 * We add our ducks
	 * @param duck(s)
	 */
	public void add(Quackable duck) {
		ducks.add(duck);
	}
	/**
	 * We iterate through our ducks and let them quak
	 */
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
	/**
	 * We iterate through every duck and register them to the observer
	 * @param the observer
	 */
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
	
	public void notifyObservers() { }
	/**
	 * @return the Flock of ducks
	 */
	public String toString() {
		return "Flock of Ducks";
	}
}
