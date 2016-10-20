package JavaAdvancedTraining.olivepress.olives;

import java.util.ArrayList;
public class OliveJar {

	public ArrayList<Olive> olives;
	
	{
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive(OliveName.GOLDEN, 0xDA9100));
	}
	
	public OliveJar() {
		System.out.println("Constructor...");
	}
	
	public OliveJar(int nOlives, OliveName oliveName, long color) {
		for (int i = 1; i <= nOlives; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

	public void addOlive(OliveName oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}
	
	public void reportOlives() {
		/*
		// Usage of inner class and way of instantiate.
		class JarLid {
			public void open(){
				System.out.println("Twist, twist, twist...");
				System.out.println("Pop!");
			}
		}
		new JarLid().open();
		*/

		// Anonymous inner class declar and usage.
		new Object() {
			public void open(){
				System.out.println("Twist, twist, twist...");
				System.out.println("Pop!");
			}
		}.open();

		for (Olive o : olives) {
			System.out.println("It's a " + o.oliveName + " olive!!");
		}
	}
	
	
	class Olive {
		
		public static final long BLACK = 0x000000;
		
		public OliveName oliveName;
		public long color = BLACK;
		
		public Olive() {
		}

		public Olive(OliveName oliveName) {
			this.oliveName = oliveName;
		}
		
		public Olive(OliveName oliveName, long color) {
			this(oliveName);
			this.color = color;
		}
		
		public String toString() {
			return "name: " + this.oliveName + ": " + "color: " +  this.color;
		}

	}

	
}
