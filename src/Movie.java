
import java.util.ArrayList;         // For creating arraylists
import java.util.Collections;       // For list functionality (sort, reverse)

// class of Movies
public class Movie {
    
    String title;                               // movie title
    int year;                                   // year of release
    String director;                            // director of movies
    double rating;                              // average IMDB rating
    ArrayList cast = new ArrayList();           // movie cast
    ArrayList genres = new ArrayList();         // movie genres
    
    // Constructor to create a new Movie object by passing in a title, year, director and rating as parameters.
    // Cast and genres are initially defined as empty arraylists.
    public Movie(String title, int year, String director, double rating){
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.cast = new ArrayList();
        this.genres = new ArrayList();
    }
    
    // Function to return the movie title
    public String getTitle(){
        return this.title;
    }
    
    // Function to return the movie year
    public int getYear(){
        return this.year;
    }
    
    // Function to return the movie director
    public String getDirector(){
        return this.director;
    }
    
    // Function to return the movie rating
    public double getRating(){
        return this.rating;
    }
    
    // Function to return the cast of the movie
    public ArrayList getCast(){
        return this.cast;
    }
    
    // Function to return the genres of the movies
    public ArrayList getGenres(){
        return this.genres;
    }
    
    // Function to set the title of the movie
    public void setTitle(String title){
        this.title = title;
    }
    
    // Function to set the year of the movie
    public void setYear(int year){
        this.year = year;
    }
    
    // Function to set the director of the movie
    public void setDirector(String director){
        this.director = director;
    }
    
    // Function to set the rating of the movie
    public void setRating(double rating){
        this.rating = rating;
    }
    
    // Function to add an actor to the movie's cast
    public void addActor(String actor){
        this.cast.add(actor);
    }
    
    // Function to add a genre to the movie's genres
    public void addGenre(String genre){
        this.genres.add(genre);
    }
    
    // Override the default toString function.
    // This method uses all accessor functions to return the details of the film.
    @Override
    public String toString(){
        return " Title: " + this.getTitle() + "\n Year: " + this.getYear() + "\n Director: " + this.getDirector()
                + "\n Rating: " + this.getRating() + "\n Genre: " + this.getGenres() + "\n Cast: " + this.getCast();
    }
    
    // Static function that creates and returns an arraylist of movies 
    public static ArrayList<Movie> setupMovies(){
        ArrayList<Movie> movieList = new ArrayList();
        Movie movie = new Movie("Titanic", 1997, "James Cameron", 7.8);
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Kate Winslet");
        movie.addActor("Billy Zane");
        movie.addGenre("Romance");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("Avatar", 2009, "James Cameron", 7.8);
        movie.addActor("Sam Worthington");
        movie.addActor("Zoe Saldana");
        movie.addActor("Sigourney Weaver");
        movie.addGenre("Sci-Fi");
        movie.addGenre("Fantasy");
        movieList.add(movie);
        
        movie = new Movie("The Terminator", 1984, "James Cameron", 8.0);
        movie.addActor("Arnold Schwarzenegger");
        movie.addActor("Linda Hamilton");
        movie.addActor("Michael Biehn");
        movie.addGenre("Sci-Fi");
        movie.addGenre("Fantasy");
        movieList.add(movie);
        
        movie = new Movie("Forrest Gump", 1994, "Robert Zemeckis", 8.8);
        movie.addActor("Tom Hanks");
        movie.addActor("Robin Wright");
        movie.addActor("Gary Sinise");
        movie.addGenre("Drama");
        movie.addGenre("Romance");
        movieList.add(movie);
        
        movie = new Movie("Saving Private Ryan", 1998, "Steven Spielberg", 8.6);
        movie.addActor("Tom Hanks");
        movie.addActor("Matt Damon");
        movie.addActor("Tom Sizemore");
        movie.addGenre("Action");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("Jurassic Park", 1993, "Steven Spielberg", 8.1);
        movie.addActor("Sam Neill");
        movie.addActor("Laura Dern");
        movie.addActor("Jeff Goldblum");
        movie.addGenre("Adventure");
        movie.addGenre("Fantasy");
        movieList.add(movie);
        
        movie = new Movie("Schindler's List", 1993, "Steven Spielberg", 8.9);
        movie.addActor("Liam Neeson");
        movie.addActor("Ben Kingsley");
        movie.addActor("Ralph Fiennes");
        movie.addGenre("Biography");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("Jaws", 1975, "Steven Spielberg", 8.0);
        movie.addActor("Roy Scheider");
        movie.addActor("Robert Shaw");
        movie.addActor("Richard Dreyfus");
        movie.addGenre("Adventure");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("Raiders of the Lost Ark", 1981, "Steven Spielberg", 8.5);
        movie.addActor("Harrison Ford");
        movie.addActor("Karen Allen");
        movie.addActor("Paul Freeman");
        movie.addGenre("Action");
        movie.addGenre("Adventure");
        movieList.add(movie);
        
        movie = new Movie("The Shawshank Redemption", 1994, "Frank Darabont", 9.3);
        movie.addActor("Tim Robbins");
        movie.addActor("Morgan Freeman");
        movie.addActor("Bob Gunton");
        movie.addGenre("Drama");
        movie.addGenre("Mystery");
        movieList.add(movie);
        
        movie = new Movie("The Green Mile", 1999, "Frank Darabont", 8.6);
        movie.addActor("Tom Hanks");
        movie.addActor("Michael Clarke Duncan");
        movie.addActor("David Morse");
        movie.addGenre("Drama");
        movie.addGenre("Fantasy");
        movieList.add(movie);
        
        movie = new Movie("The Silence of the Lambs", 1991, "Jonathan Demme", 8.6);
        movie.addActor("Jodie Foster");
        movie.addActor("Anthony Hopkins");
        movie.addActor("Scott Glenn");
        movie.addGenre("Drama");
        movie.addGenre("Mystery");
        movieList.add(movie);
        
        movie = new Movie("Goodfellas", 1990, "Martin Scorsese", 8.7);
        movie.addActor("Ray Liotta");
        movie.addActor("Robert De Niro");
        movie.addActor("Joe Pesci");
        movie.addGenre("Crime");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("The Aviator", 2004, "Martin Scorsese", 7.5);
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Cate Blanchett");
        movie.addActor("Kate Beckinsale");
        movie.addGenre("Biography");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("The Departed", 2006, "Martin Scorsese", 8.5);
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Matt Damon");
        movie.addActor("Jack Nicholson");
        movie.addGenre("Crime");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("The Wolf of Wall Street", 2013, "Martin Scorsese", 8.2);
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Jonah Hill");
        movie.addActor("Margot Robbie");
        movie.addGenre("Biography");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("Fight Club", 1999, "David Fincher", 8.8);
        movie.addActor("Brad Pitt");
        movie.addActor("Edward Norton");
        movie.addActor("Helena Bonham Carter");
        movie.addGenre("Drama");
        movie.addGenre("Action");
        movieList.add(movie);
        
        movie = new Movie("The Dark Knight", 2008, "Christopher Nolan", 9.0);
        movie.addActor("Christian Bale");
        movie.addActor("Heath Ledger");
        movie.addActor("Gary Oldman");
        movie.addGenre("Crime");
        movie.addGenre("Action");
        movieList.add(movie);
        
        movie = new Movie("Inception", 2010, "Christopher Nolan", 8.8);
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");
        movie.addActor("Ellen Page");
        movie.addGenre("Sci-Fi");
        movie.addGenre("Adventure");
        movieList.add(movie);
        
        movie = new Movie("Gladiator", 2000, "Ridley Scott", 8.5);
        movie.addActor("Russell Crowe");
        movie.addActor("Joaquin Phoenix");
        movie.addActor("Connie Nielsen");
        movie.addGenre("Action");
        movie.addGenre("Adventure");
        movieList.add(movie);
        
        movie = new Movie("Blade Runner", 1982, "Ridley Scott", 8.2);
        movie.addActor("Harrison Ford");
        movie.addActor("Sean Young");
        movie.addActor("Rutger Hauer");
        movie.addGenre("Sci-Fi");
        movie.addGenre("Fantasy");
        movieList.add(movie);
        
        movie = new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, "Peter Jackson", 8.8);
        movie.addActor("Elijah Wood");
        movie.addActor("Ian McKellan");
        movie.addActor("Orlando Bloom");
        movie.addGenre("Fantasy");
        movie.addGenre("Adventure");
        movieList.add(movie);
        
        movie = new Movie("Pulp Fiction", 1994, "Quentin Tarantino", 8.9);
        movie.addActor("Samuel L. Jackson");
        movie.addActor("John Travolta");
        movie.addActor("Uma Thurman");
        movie.addGenre("Crime");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        movie = new Movie("Good Will Hunting", 1997, "Gus Van Sant", 8.3);
        movie.addActor("Robin Williams");
        movie.addActor("Matt Damon");
        movie.addActor("Ben Affleck");
        movie.addGenre("Drama");
        movie.addGenre("Romanace");
        movieList.add(movie);
        
        movie = new Movie("Braveheart", 1995, "Mel Gibson", 8.4);
        movie.addActor("Mel Gibson");
        movie.addActor("Sophie Marceau");
        movie.addActor("Patrick McGoohan");
        movie.addGenre("Biography");
        movie.addGenre("Drama");
        movieList.add(movie);
        
        return movieList;
    }
    
    public static void main(String args[]){
         
        // Call static function to create arraylist of movies
        ArrayList<Movie> movieList = setupMovies();
        
        // Variable that will determine how the arraylist is sorted
        String compare = "rating";
        
        // If it is rating then sort movies by their ratings
        // Reverse the arraylist so the highest rated films are first
        if("rating".equals(compare)){
            Collections.sort(movieList, new MovieRatingComparator());
            Collections.reverse(movieList);
        }
        // If it is year then sort movies by their year
        else if("year".equals(compare)){
            Collections.sort(movieList, new MovieYearComparator());
        }
        // Else sort the movies by their title
        else{
           Collections.sort(movieList, new MovieTitleComparator()); 
        }
       
        System.out.println(movieList.size() + " films");
        
        // Loop through the list of movies and for each one call the toString function to print their details
        for(int i=0;i< movieList.size();i++){
            System.out.println("");
            System.out.println(movieList.get(i).toString());
        }
        
        // Print the names of any movies directed by Steven Spielberg
        String director = "Steven Spielberg";
        System.out.println("\n Movies directed by " + director);
        for(int i=0;i< movieList.size();i++){
            if(movieList.get(i).getDirector().equals(director)){
                System.out.println(movieList.get(i).getTitle());
            }
        }
        
        // Print the names of any movies that starred Leonardo DiCaprio
        String actor = "Leonardo DiCaprio";
        System.out.println("\n Movies starring " + actor);
        for(int i=0;i< movieList.size();i++){
            if(movieList.get(i).getCast().contains((actor))){
                System.out.println(movieList.get(i).getTitle());
            }
        }
        
        // Print the names of any Sci-Fi movies
        String genre = "Sci-Fi";
        System.out.println("\n "+ genre + " movies");
        for(int i=0;i< movieList.size();i++){
            if(movieList.get(i).getGenres().contains((genre))){
                System.out.println(movieList.get(i).getTitle());
            }
        }
        
        // Print the names of any movies rated 8.5 or higher
        System.out.println("\n Movies rated 8.5 or higher");
        for(int i=0;i< movieList.size();i++){
            if(movieList.get(i).getRating() >= 8.5){
                System.out.println(movieList.get(i).getTitle());
            }
        }
        
        // Print the names of any movies released in the 1990's
        System.out.println("\n Movies released in the 1990's ");
        for(int i=0;i< movieList.size();i++){
            if(movieList.get(i).getYear() >= 1990 & movieList.get(i).getYear() < 2000){
                System.out.println(movieList.get(i).getTitle());
            }
        }
    }
}
