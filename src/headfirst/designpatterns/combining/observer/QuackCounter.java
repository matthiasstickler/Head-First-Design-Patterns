package headfirst.designpatterns.combining.observer;
/**
 * Counting the quacks
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
	/**
	 * Initialise the duck(s)
	 * @param duck(s)
	 */
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	/**
	 * Let the duck(s) quack and add one to the counter
	 */
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	/**
	 * Get tehe number of quacks
	 */
	public static int getQuacks() {
		return numberOfQuacks;
	}
	/**
	 * Register to the observer
	 * @param observer
	 */
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
	/**
	 * notify the observers
	 */
	public void notifyObservers() {
		duck.notifyObservers();
	}
	/**
	 * @return Duckname(s)
	 */
	public String toString() {
		return duck.toString();
	}
}
