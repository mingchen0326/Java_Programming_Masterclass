package ISaveable;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        List listToGet = player.write();
        player.read(listToGet);
        Monster monster = new Monster("Mon", 10, 15);
        List montserList = monster.write();
        monster.read(montserList);
    }
}
