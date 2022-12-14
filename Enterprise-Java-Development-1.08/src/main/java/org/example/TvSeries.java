package org.example;

public class TvSeries extends Video{
    private int numSeasons;

    public TvSeries(String title, String genre, int duration, int numSeasons) {
        super(title, genre, duration);
        this.numSeasons = numSeasons;
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(int numSeasons) {
        this.numSeasons = numSeasons;
    }
}
