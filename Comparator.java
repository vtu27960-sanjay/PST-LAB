import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // If scores are different, sort in decreasing order of score
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }
        // If scores are the same, sort alphabetically by name
        return a.name.compareTo(b.name);
    }
}
