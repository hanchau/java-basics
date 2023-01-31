package src;

public class CashPool {
    private int notesOf10;
    private int notesOf20;
    private int notesOf50;
    private int notesOf100;
    private int notesOf200;
    private int notesOf500;
    private int notesOf2000;

    public CashPool(int notesOf10, int notesOf20, int notesOf50, int notesOf100, int notesOf200, int notesOf500, int notesOf2000){
        this.notesOf10 = notesOf10;
        this.notesOf20 = notesOf20;
        this.notesOf50 = notesOf50;
        this.notesOf100 = notesOf100;
        this.notesOf200 = notesOf200;
        this.notesOf500 = notesOf500;
        this.notesOf2000 = notesOf2000;
    }

    public CashPool() {

    }

    public Cash getCash(Cash cash){
        return null;
    }

    public boolean putCash(Cash cash){
        return false;
    }
}



