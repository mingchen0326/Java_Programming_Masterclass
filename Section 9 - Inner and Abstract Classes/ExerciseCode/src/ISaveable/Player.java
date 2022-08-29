package ISaveable;

import java.util.LinkedList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        String stringToRead = toString();
        System.out.println(stringToRead);
        LinkedList<String> listToWrite = new LinkedList<String>();
        String strToAdd = "";
        String equalSign = "=";
        String commaSign = ",";
        String closeBracket = "}";
        boolean startAdding = false;
        for (int i=0; i<stringToRead.length(); i++) {
            String ch = String.valueOf(stringToRead.charAt(i));
            if (ch.equals(commaSign) || ch.equals(closeBracket)) {
                listToWrite.add(strToAdd);
                startAdding = false;
                strToAdd = "";
            }
            if (startAdding) {
                strToAdd = strToAdd + ch;
            }
            if (ch.equals(equalSign)) {
                startAdding = true;
            }
        }
        return listToWrite;
    }

    @Override
    public void read(List<String> listToRead) {
        if (listToRead.size() > 0) {
            for (int i=0; i<listToRead.size(); i++) {
                System.out.println(listToRead.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength +
                ", weapon='" + this.weapon +"'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
