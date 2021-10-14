package Studentpack;
import org.springframework.stereotype.Component;



@Component("chair")
public class Chair {
 private String colour;
 
 public Chair() {
	 super();
	 }

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

@Override
public String toString() {
	return "Chair [colour=" + colour + "]";
}
 
 
}
