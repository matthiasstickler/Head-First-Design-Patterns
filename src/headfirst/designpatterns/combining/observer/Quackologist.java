package headfirst.designpatterns.combining.observer;
/**
 * Specific observer to display our quacks
 */
public class Quackologist implements Observer {
	/**
	 * Update all the quacks the observer recognized
	 */
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
	/**
	 * @return Quackologist
	 */
	public String toString() {
		return "Quackologist";
	}
}
