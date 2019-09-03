package OOPLab03;

public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;

    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }
    public int getPlayerNumber() {
        return this.playerNumber;
    }

    public void setPosition(String p) {
        this.position = p;
    }
    public String getPosition() {
        return this.position;
    }

    public Boolean isSamePosition(FootballPlayer p) {
        if ((p.getPosition().equals(this.position)) & (p.getTeam().equals(this.getTeam())) ){
            return true;
        }
        else {
            return false;
        }
    }
}
