package headfirst.designpatterns.combining.observer;
/**
 * Observer-Pattern
 * An interface provided for our specific observers
 */
public interface Observer {
	public void update(QuackObservable duck);
}
