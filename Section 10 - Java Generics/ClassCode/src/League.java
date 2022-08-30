import java.util.ArrayList;

public class League<T extends Team> {
    private String leagueName;
    ArrayList<T> teamList = new ArrayList<T>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T team) {
        if (teamList.contains(team)) {
            return false;
        } else {
            teamList.add(team);
            return true;
        }
    }

    public void printTeams() {
        this.sortTeams();
        for (T team: teamList) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }

    public void sortTeams() {
        for (int i=0; i<teamList.size(); i++) {
            T temp;
            for (int j=0; j<teamList.size(); j++) {
                if (teamList.get(j).ranking() < teamList.get(j+1).ranking()) {
                    temp = teamList.get(j);
                    teamList.set(j, teamList.get(j+1));
                    teamList.set(j+1, temp);
                }
            }
        }
    }
}
