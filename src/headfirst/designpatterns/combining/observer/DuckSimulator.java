package headfirst.designpatterns.combining.observer;
/**
 * "Main" Class for our output in the console
 */
public class DuckSimulator {
	/**
	 * Main method Implements a Ducksimulator object
	 * and an object for the AbstractDuckFactory CountingDuckFactory
	 */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
	/**
	 * At First we create the ducks and a goose.
	 * Second we add the ducks and the goose to a Flock.
	 * After that we create a Flock of Mallardducks and
	 * add this Flock to our first Flock.
	 * Next we register our flockofducks to the Quakologist
	 * observer, simulate the quacks.
	 * At last we count the quacks and print them out.
	 * @param AbstractDuckFactory
	 */
	void simulate(AbstractDuckFactory duckFactory) {
  
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		Flock flockOfDucks = new Flock();
 
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
 
		Flock flockOfMallards = new Flock();
 
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: With Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
	/**
	 * Simulate the quacks of our ducks.
	 * @param duck(s)
	 */
	void simulate(Quackable duck) {
		duck.quack();
	}
}
