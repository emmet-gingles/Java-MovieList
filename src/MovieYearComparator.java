import java.util.Comparator;

// Class that implements the Comparable class to compare Movie objects
public class MovieYearComparator implements Comparator<Movie>{
    
    // Override default compare function to compare each Movie by their year
    @Override
    public int compare(Movie m1, Movie m2){
        return m1.getYear() - m2.getYear();
    }
    

}

