package tuenti.tuenti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Scoring {

	public Player obtainTeamWinner(List<Basketball> basketballGame, List<Handball> handballGame) {

		String teamBasketball = getWinnerTeamBasketball(basketballGame);
		String teamHandBall = getWinnerTeamHandBall(handballGame);				
		Player winnerPlayer = winnerPlayer(basketballGame, handballGame, teamBasketball, teamHandBall);		
		return winnerPlayer;
	}

	private Player winnerPlayer(List<Basketball> basketballGame, List<Handball> handballGame, String teamBasketball, String teamHandBall) {
		Map<String, Integer> player = new HashMap<String, Integer>();
		Player winner = new Player();
		setPlayerScoreBasketBall(basketballGame, teamBasketball, player);
	
		setPlayerScroreHandBall(handballGame, teamHandBall, player);
		
		
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : player.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}		
		
		winner.setNickname(maxEntry.getKey());
		winner.setPoints(maxEntry.getValue());
		return winner;
	}

	private void setPlayerScroreHandBall(List<Handball> handballGame, String teamHandBall, Map<String, Integer> player) {
		for(Handball item : handballGame){
			Integer integer = player.get(item.getNickname());
			if ("G".equals(item.getPosition()))
			{
				if (teamHandBall.equals(item.getTeamName()))
				{
					player.put(item.getNickname(), integer + 50 + item.getGoalsMade() * 5 + item.getGoalsReceived() * 2 + 10);
				}
				else
				{					
					player.put(item.getNickname(), integer + 50 + item.getGoalsMade() * 5 + item.getGoalsReceived() * 2);
				}
			}
			else
			{
				if (teamHandBall.equals(item.getTeamName()))
				{
					player.put(item.getNickname(), integer + 20 + item.getGoalsMade() * 5 + item.getGoalsReceived() * 2 + 10);
				}
				else
				{
					player.put(item.getNickname(), integer + 20 + item.getGoalsMade() * 5 + item.getGoalsReceived() * 2);					
				}
			}
		}
	}

	private void setPlayerScoreBasketBall(List<Basketball> basketballGame, String teamBasketball, Map<String, Integer> player) {
		for(Basketball item : basketballGame){
			if (teamBasketball.equals(item.getTeamName()))
			{
				player.put(item.getNickname(), item.getScored() * 2 + item.getRebounds() * 1 + item.getAssists() * 3 + 10);	
			}
			else
			{
				player.put(item.getNickname(), item.getScored() * 2 + item.getRebounds() * 1 + item.getAssists() * 3);
			}
		}
	}

	private String getWinnerTeamBasketball(List<Basketball> basketballGame) {
		Map<String, Integer> team = new HashMap<String, Integer>();
		for(Basketball item : basketballGame){
			String teamName = item.getTeamName();
			int scored = item.getScored();
			if (team.get(item.getTeamName()) != null)
			{
				team.put(teamName, team.get(item.getTeamName())+scored);	
			}
			else
			{
				team.put(teamName, scored);				
			}
		}
		
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : team.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		return maxEntry.getKey();
	}
	
	private String getWinnerTeamHandBall(List<Handball> handballGame) {
		Map<String, Integer> team = new HashMap<String, Integer>();
		for(Handball item : handballGame){
			String teamName = item.getTeamName();
			int scored = item.getGoalsMade();
			if (team.get(item.getTeamName()) != null)
			{
				team.put(teamName, team.get(item.getTeamName())+scored);	
			}
			else
			{
				team.put(teamName, scored);				
			}
		}
		
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : team.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		return maxEntry.getKey();
	}		
}
