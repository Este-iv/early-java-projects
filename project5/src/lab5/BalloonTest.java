package lab5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import balloon4.Balloon;
public class BalloonTest 
{
	public void testInitial()
{
    Balloon b = new Balloon(10);
    assertEquals(0, b.getRadius());
  }

  @Test
  public void testInitialBlow()
  {
    Balloon b = new Balloon(10);
    b.blow(5);
    assertEquals(5, b.getRadius());
    b.blow(6);
    assertEquals(0, b.getRadius());
  }

  @Test
  public void testPop()
  {
	Balloon b = new Balloon(10);
    b.deflate();
    assertEquals(0, b.getRadius());
    b.blow(7);
    assertEquals(7, b.getRadius());
  }

  @Test
  public void testRadiurAfterPoP()
  {
    Balloon b = new Balloon(10);
    b.blow(11); 
    assertEquals(0, b.getRadius() );
    b.blow(1);
   assertEquals(0,b.getRadius());
   
  }
  


}
