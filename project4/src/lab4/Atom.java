package lab4;
import java.util.*;

/**
 * Class that models an atom containing protons, neutrons, and electrons.
 */
@SuppressWarnings("unused")
public class Atom
{
  /**
   * The number of protons.
   */
  private int protons;
  
  /**
   * The number of electrons.
   */
  private int electrons;
  
  /**
   * The number of neutrons.
   */
  private int neutrons;
  
  /**
   * Constructs an atom with the given number of protons, neutrons, and electrons.
   * @param givenProtons
   *   number of protons this atom should have
   * @param givenNeutrons
   *   number of neutrons this atom should have
   * @param givenElectrons
   *   number of electrons this atom should have
   */
  public Atom(int givenProtons, int givenNeutrons, int givenElectrons)
  {
    protons = givenProtons;
    electrons = givenElectrons;
    neutrons = givenNeutrons;
  }
  
  /**
   * Returns the atomic mass for this atom (number of protons plus
   * number of neutrons).
   * @return
   *   number of protons plus neutrons
   */
  public int getAtomicMass()
  {
    return protons + neutrons;
  }
  
  /**
   * Returns the atomic charge for this atom (number of protons
   * less number of electrons).
   * @return
   *   number of protons minus electrons
   */
  public int getAtomicCharge()
  {
    return protons - electrons;
  }
  
  /**
   * Reduces the number of protons by 2 and the number of neutrons by 2.
   */
  public void decay()
  {
    protons -= 2;
    neutrons -= 2;
  }

}
