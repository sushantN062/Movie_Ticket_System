import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(1, 4, "Sci-Fi", "M3GAN", "Gerard Johnstone", "1 pm", 499);
        moviesList.add(m1);
        Movie m2 = new Movie(2,5, "Animated", "Puss In Boots: The Last Wish", "Joel Crawford", "2 pm", 699);
        moviesList.add(m2);
        Movie m3 = new Movie(3,6, "Drama", "Babylon", "Damien Chazelle", "3 pm", 700);
        moviesList.add(m3);



        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Sushant", 13,"idiotsanwich@gordon.com");
        users.add(u1);


        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat("Platinum", 69);
        seats.add(s1);


        Ticket t1 = new Ticket(seats,users,moviesList);


        m1.getInfo();

        t1.getTickets();

        m2.getMovies("Rati ko 2");

    }
}

