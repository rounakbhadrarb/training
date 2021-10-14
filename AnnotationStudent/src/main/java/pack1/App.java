package pack1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Studentpack.Address;
import Studentpack.Chair;
import Studentpack.Student;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
    	context1.scan("Studentpack");
    	context1.refresh();

    	Student st = (Student) context1.getBean("Student1");
        st.setStudentId("100");
        st.setStudentName("smriti");
  
    	Address addrs=st.getAddress();
    	addrs.setDoorNo("1234");
    	addrs.setPin("4567");
    	addrs.setState("Jharkhand");
    	addrs.setStreet("abcd");
    	
    	Chair ch=st.getChair();
    	ch.setColour("blue");

    	System.out.println(st);
    	context1.close();

    }
}
