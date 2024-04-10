package br.com.alura.screenmatch.modelos;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int episodeLenght;

    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getEpisodeLenght() {
        return episodeLenght;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setEpisodeLenght(int episodeLenght) {
        this.episodeLenght = episodeLenght;
    }

    @Override
    public int getMinuteLenght() {
        return seasons * episodesPerSeason * episodeLenght;
    }
}
