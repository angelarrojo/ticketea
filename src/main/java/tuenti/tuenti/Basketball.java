package tuenti.tuenti;

public class Basketball {

	private String playerName;
	private String nickname;
	private int number;
	private String teamName;
	private String position;
	private int scored;
	private int rebounds;
	private int assists;
	
	
	public Basketball(String playerName, String nickname, int number, String teamName, String position, int scored,
			int rebounds, int assists) {
		super();
		this.playerName = playerName;
		this.nickname = nickname;
		this.number = number;
		this.teamName = teamName;
		this.position = position;
		this.scored = scored;
		this.rebounds = rebounds;
		this.assists = assists;
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
	public int getScored() {
		return scored;
	}
	public void setScored(int scored) {
		this.scored = scored;
	}
	public int getRebounds() {
		return rebounds;
	}
	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}	
}
