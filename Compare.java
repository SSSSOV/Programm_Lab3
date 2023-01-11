import java.util.Comparator;

public class Compare implements Comparator<t_part> {
    public int compare(t_part part1, t_part part2){
        return Integer.compare(part2.power, part1.power);
    }
}
