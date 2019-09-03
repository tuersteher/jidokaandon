import java.util.ArrayList;
import java.util.List;

public class Processor {

    private List<Line> lines;

    private Processor() {
        this.lines = new ArrayList<>();
    }

    public static void main(String[] args) {
        Processor linepro = new Processor();
        linepro.lines.add(new Line("Line 1"));
    }

}
