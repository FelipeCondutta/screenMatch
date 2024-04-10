package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int release;
    private boolean includedInPlan;
    private double sumOfScore;
    private int totalScore;
    private int minuteLenght;



    public String getName() {
        return name;
    }

    public int getRelease() {
        return release;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getMinuteLenght() {
        return minuteLenght;
    }

    public int getTotalScore(){
        return totalScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setMinuteLenght(int minuteLenght) {
        this.minuteLenght = minuteLenght;
    }


    public void technicalSheet(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + release);
    }

    public void evaluate (double grade){
        sumOfScore += grade;
        totalScore++;
    }

    public double returRating(){
        return sumOfScore / totalScore;
    }
}
