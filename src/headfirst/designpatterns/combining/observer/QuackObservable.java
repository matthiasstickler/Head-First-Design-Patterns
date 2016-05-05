package headfirst.designpatterns.combining.observer;
/**
 * Interface to observe our quacks
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
