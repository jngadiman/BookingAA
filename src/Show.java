package aa.sales;
import aa.facility.*;
import java.util.*;

public class Show {
	//added ID
	private String showName;
	private String showDate;
	private Theatre theatre;
	private int showID;
	private ArrayList<Seat> seats;
	private int freeSeats;
	
	public Show(Integer showID, String showName, String showDate, Theatre theatre)
	{
		this.showID = showID;
		this.showName = showName;
		this.showDate = showDate;
		this.theatre = theatre;
	}
	
	public void loadSeats()
	{
		for (Row row : theatre.getRows()) 
		{
			for (Seat seat : row.getSeats())
			{
				seats.add(seat);
			}
		}
	}
	
	public int getFreeSeatsCount()
	{
		for (Seat seat : seats) 
		{
			if (!seat.getReservationStatus())
			{
				freeSeats++;
			}
		}
		return freeSeats;
	}
	
	
	public void setShowName(String showName)
	{
		this.showName = showName;
	}
	
	public void setShowDate(String showDate)
	{
		this.showDate = showDate;
	}
	
	public void setTheatre(Theatre theatre)
	{
		this.theatre = theatre;
	}
	
	public String getShowName()
	{
		return showName;
	}
	
	
	public String getShowDate()
	{
		return showDate;
	}
	
	public Theatre getTheatre()
	{
		return theatre;
	}
	
	public ArrayList<Seat> getSeats()
	{
		return seats;
	}
	
	//getter and setter for ID
	public int getID()
	{
		return showID;
	}
	
	public void setID(int showID)
	{
		this.showID = showID;
	}
}
