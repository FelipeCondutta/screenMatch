package br.screenmatch.calculator;

import br.screenmatch.models.Movie;

public class timeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void movieInclude(Movie f){
        totalTime += f.getMinuteLenght();

    }
}
