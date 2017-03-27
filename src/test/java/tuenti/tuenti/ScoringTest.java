package tuenti.tuenti;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ScoringTest 
{
	private Scoring scoring = new Scoring();
	
	@Test
	public void obtainPointsBasketball() {

		List<Basketball> basketballGame = setUpBasketBallTeam();		
		List<Handball> handballGame = setUpHandBallTeam();				
		Player playerMVP = scoring.obtainTeamWinner(basketballGame, handballGame);
				
		assertEquals("nick5", playerMVP.getNickname());
		assertEquals(176, playerMVP.getPoints());
			
	}

	private List<Handball> setUpHandBallTeam() {
		Handball ph1 = new Handball("player 1","nick1",4,"Team A","G",0,20); 
		Handball ph2 = new Handball("player 2","nick2",8,"Team A","F",15,20);
		Handball ph3 = new Handball("player 3","nick3",15,"Team A","F",10,20);
		Handball ph4 = new Handball("player 4","nick4",16,"Team B","G",1,25);
		Handball ph5 = new Handball("player 5","nick5",23,"Team B","F",12,25);
		Handball ph6 = new Handball("player 6","nick6",42,"Team B","F",8,25);		
		
		List<Handball> handballGame = new ArrayList<Handball>();
		handballGame.add(ph1);
		handballGame.add(ph2);
		handballGame.add(ph3);
		handballGame.add(ph4);
		handballGame.add(ph5);
		handballGame.add(ph6);
		return handballGame;
	}

	private List<Basketball> setUpBasketBallTeam() {
		Basketball pb1 = new Basketball("player 1","nick1",4,"Team A","G",10,2,7);
		Basketball pb2 = new Basketball("player 2","nick2",8,"Team A","F",0,10,0);
		Basketball pb3 = new Basketball("player 3","nick3",15,"Team A","C",15,10,4);
		Basketball pb4 = new Basketball("player 4","nick4",16,"Team B","G",20,0,0);
		Basketball pb5 = new Basketball("player 5","nick5",23,"Team B","F",4,7,7);
		Basketball pb6 = new Basketball("player 6","nick6",42,"Team B","C",8,10,0);

		List<Basketball> basketballGame = new ArrayList<Basketball>();
		basketballGame.add(pb1);
		basketballGame.add(pb2);
		basketballGame.add(pb3);
		basketballGame.add(pb4);
		basketballGame.add(pb5);
		basketballGame.add(pb6);
		return basketballGame;
	}
}
