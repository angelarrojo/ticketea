package tuenti.tuenti;

public class Handball {
	
	private String playerName;
	private String nickname;
	private int number;
	private String teamName;
	private String position;
	private int goalsMade;
	private int goalsReceived;
	
	public Handball(String playerName, String nickname, int number, String teamName, String position, int goalsMade,
			int goalsReceived) {
		super();
		this.playerName = playerName;
		this.nickname = nickname;
		this.number = number;
		this.teamName = teamName;
		this.position = position;
		this.goalsMade = goalsMade;
		this.goalsReceived = goalsReceived;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getGoalsMade() {
		return goalsMade;
	}
	public void setGoalsMade(int goalsMade) {
		this.goalsMade = goalsMade;
	}
	public int getGoalsReceived() {
		return goalsReceived;
	}
	public void setGoalsReceived(int goalsReceived) {
		this.goalsReceived = goalsReceived;
	}
}
