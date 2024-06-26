import br.screenmatch.calculator.timeCalculator;
import br.screenmatch.models.Movie;
import br.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The GodFather");
        myMovie.setRelease(1970);
        myMovie.setMinuteLenght(180);
        System.out.println("Duração do Filme: " + myMovie.getMinuteLenght());

        myMovie.technicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(6);
        myMovie.evaluate(10);
        myMovie.evaluate(4);
        myMovie.evaluate(2);

        System.out.println("Total de avaliações: " + myMovie.getTotalScore());
        System.out.println(myMovie.returRating());
        //myMovie.sumOfScore = 10;
        //myMovie.totalScore = 1;
        //System.out.println(myMovie.returRating());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setRelease(2000);
        lost.technicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setEpisodeLenght(50);
        System.out.println("Duração em minutos: " + lost.getMinuteLenght());

        Movie movie2 = new Movie();
        movie2.setName("Avatar");
        movie2.setRelease(2000);
        movie2.setMinuteLenght(200);

        timeCalculator calculator = new timeCalculator();
        calculator.movieInclude(myMovie);
        calculator.movieInclude(movie2);
        System.out.println(calculator.getTotalTime());
    }
}
