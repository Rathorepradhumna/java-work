package collectionTwo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie_Details movie1 = new Movie_Details("Dark","Jonas","Hannah","Fiction");
		Movie_Details movie2 = new Movie_Details("BreakingBad","Walter","Skyler","Crime");
		Movie_Details movie3  = new Movie_Details("Suits","Harvey","Donna","Drama");
		
		Movie_DetailsList list = new Movie_DetailsList();
		list.add_movie(movie2);
		list.add_movie(movie1);
		list.add_movie(movie3);
		list.displayMovieList();
		list.sortMovieBasedOnString("name");
		list.displayMovieList();
		
	}

}
