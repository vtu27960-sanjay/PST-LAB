import java.util.*;

// 1. The Player class represents each entity
class Player {
    String name;
    int score;
    
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// 2. Your custom Comparator
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First compare by score in descending order
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score); 
        }
        
        // If scores are equal, compare by name in ascending alphabetical order
        return a.name.compareTo(b.name);
    }
}

// 3. The Main Solution class to handle Input/Output
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        Player[] players = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            players[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(players, checker);
        
        for(int i = 0; i < players.length; i++){
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }
}
