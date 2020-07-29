package lab2;

public class AtomicTest {

	public static void main(String[] args) 
	{
		Atom Uranium;
		Uranium = new Atom(92,146,92);
		
		System.out.println(Uranium.getAtomicMass());
		Uranium.decay();
		System.out.println(Uranium.getAtomicMass());
		Uranium.decay();
		System.out.println(Uranium.getAtomicMass());
		
	}

}
