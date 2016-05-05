package headfirst.designpatterns.combining.observer;
/**
 * An interface provided for our specific observers
 */
public interface Observer {
	public void update(QuackObservable duck);
}
