import ISaveable.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        List listToGet = player.write();
//        player.read(listToGet);
//        for (int i=0; i<listToGet.size(); i++) {
//            System.out.println(listToGet.get(i));
//        }

    }
}