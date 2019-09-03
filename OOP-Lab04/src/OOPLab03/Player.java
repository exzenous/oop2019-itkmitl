package OOPLab03;

public class Player {
    private String name;
    private String team;

    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return this.name;
    }

    public void setTeam(String t) {
        this.team = t;
    }
    public String getTeam(){
        return this.team;
    }

    public Boolean isSameTeam(Player p){
        return p.getTeam().equals(this.getTeam());
    }
}
