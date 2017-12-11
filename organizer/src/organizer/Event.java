package organizer;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
}
*/

public class Event {

	private Date date = new Date();
	private String name;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Event(Date date, String name) {
		this.date = date;
		this.name = name;
	}
}
