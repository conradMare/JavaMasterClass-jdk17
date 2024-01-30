public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        // Checks for invalid value.
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        // Checks input value.
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                // Updating toner level.
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = Math.round((float) pagesToPrint / 2);
            pagesPrinted += pagesToPrint;
        } else {
            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}