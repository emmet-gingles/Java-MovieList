import java.util.Comparator;            // 

// Class that implements the Comparable class to compare Movie objects
public class MovieTitleComparator implements Comparator<Movie>{
    
    // Override default compare function to compare each Movie by their title
    @Override
    public int compare(Movie m1, Movie m2){
        if(m1.getTitle().compareTo(m2.getTitle()) > 0){
            return 1;
        }
        else if(m1.getTitle().compareTo(m2.getTitle()) < 0){
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
