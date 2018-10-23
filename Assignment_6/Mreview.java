
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Mreview implements Comparable<Mreview>
{
	// instance variables
	private String title;   // title of the movie
	private static ArrayList<Integer> ratings; // list of ratings stored in a Store object

	// constructors
	public Mreview() {
		title = "";
		ratings = new ArrayList<>();
	}
	public Mreview(String ttl) {
		title = ttl;
		ratings = new ArrayList<>();
	}
	public Mreview(String ttl, int firstRating) {
		title = ttl;
		ratings = new ArrayList<>(firstRating);
	}
	
	// Simple Unit Test
	public static void main(String[] args) {
		Mreview mreview = new Mreview("Kill Bill");
		addRating(3);
		addRating(4);
		addRating(5);
		System.out.println(mreview.toString());
		System.out.println(mreview.aveRating());	//should be 4.0
		
	}
	
	// methods
	public static void addRating(int r) {
		ratings.add(r);
	}
	public double aveRating() {
		double ave = 0.0;
		for(Integer integer : ratings) ave += integer;
		return ave / ratings.size();
	}
	@Override
  	public int compareTo(Mreview obj) {
  		return this.title.compareTo(obj.title);
  	}
	public boolean equals(Object obj) {
		if(this.title.equals(obj)) obj = new Mreview();
		return this.title.equals(obj);
	}
	public String getTitle() {
		return title;
	}
	public int numRatings() {
		return ratings.size();
	}
	public String toString() {
		return getTitle() + ", average " + aveRating() + " out of " + numRatings() + " ratings";
	}

  
  
}
