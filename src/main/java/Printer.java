public class Printer {
    private int availableSheets;
    private int volumeToner;

    public Printer(int availableSheets, int volumeToner) {
        this.availableSheets = availableSheets;
        this.volumeToner = volumeToner;

    }

    public int print(int pages, int copies){
        int sheetsToPrint = copies * pages;
        if (this.availableSheets > sheetsToPrint){
            return this.availableSheets - sheetsToPrint;
        } else {
            return this.availableSheets;
        }
    }
}
