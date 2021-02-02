public class Printger {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printger(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public Printger(boolean duplex) {
        this.duplex = duplex;
    }
}
