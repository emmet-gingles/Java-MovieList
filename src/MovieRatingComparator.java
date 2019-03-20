import java.util.Comparator;

// Class that implements the Comparable class to compare Movie objects
public class MovieRatingComparator implements Comparator<Movie>{
     
    // Override default compare function to compare each Movie by their rating
    @Override
    public int compare(Movie m1, Movie m2){
        if(m1.getRating() > m2.getRating()){
            return 1;
        }
        else if(m1.getRating() < m2.getRating()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
