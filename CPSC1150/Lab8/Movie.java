import java.util.Calendar;

public class Movie {

	private String title;
	private int release_year;
	private int duration;
	public static int rentFee;
	private Calendar date_borrowed;
	private int days_borrowed;
	
	
	public Movie() {
		
	}
	
	public Movie (String title, int release_year, int duration) {
		this.title = title;
		this.release_year = release_year;
		this.duration= duration;
		date_borrowed = null;
		days_borrowed = 0;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Calendar getDate_borrowed() {
		return date_borrowed;
	}

	public void setDate_borrowed(Calendar date_borrowed) {
		this.date_borrowed = date_borrowed;
	}

	public int getDays_borrowed() {
		return days_borrowed;
	}

	public void setDays_borrowed(int days_borrowed) {
		this.days_borrowed = days_borrowed;
	}

	
	
	

}
