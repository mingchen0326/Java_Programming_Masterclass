import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer (T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + "is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult (Team opponent, int outScore, int theirScore) {
        String message;

        if (outScore > theirScore) {
            won++;
            message = " beat ";
        } else if (outScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        // update opponent's score
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent);
            opponent.matchResult(null, theirScore, outScore);
        }
    }

    public int ranking() {
        return (this.won * 2) + this.tied;
    }

    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
