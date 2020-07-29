package lab2;

public class Atom {
			
	private int protons;
	private int nuetrons;
	private int electrons;
	
	public Atom( int givenProtons, int givenNuetrons, int givenElectrons)
	{
		 protons = givenProtons;
		 nuetrons = givenNuetrons;
		 electrons = givenElectrons;
	}
	
	public int getAtomicMass()
	{
		int atomicMass = protons + nuetrons;
		return atomicMass;
	}
	
	public int getAtomicCharge()
	{
		int atomicCharge = protons - nuetrons;
		return atomicCharge;
	}
	
	public void decay()
	{
		protons = protons - 2 ; 
		nuetrons = nuetrons - 2;
		
		
	}

	private Object protons(String string, int nuetrons2) {
		// TODO Auto-generated method stub
		return null;
	}
}
