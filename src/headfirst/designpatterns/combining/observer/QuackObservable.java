package headfirst.designpatterns.combining.observer;
/**
 * Observer-Pattern
 * Interface to observe our quacks
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
