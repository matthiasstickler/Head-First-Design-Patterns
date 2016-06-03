package headfirst.designpatterns.combining.observer;
/**
 * Strategy-Pattern
 * The goose is not a duck so it doesn't quack
 */
public class Goose {
	/**
	 * Instead of quacking the goose honks
	 */
	public void honk() {
		System.out.println("Honk");
	}
	/**
	 * @return the Goose
	 */
	public String toString() {
		return "Goose";
	}
}
