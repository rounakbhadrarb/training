package rounak.b84.MyIOCAnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import pack1.Address;
import pack1.Customer;



/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
context.scan("pack1");
context.refresh();

Customer cust = (Customer) context.getBean("customer1");
cust.setCustId("100");
cust.setCustName("Usama");
Address addrs = cust.getAddress();
addrs.setDoorNo("1122");
addrs.setStreet("valki");
addrs.setPin("581335");
addrs.setState("karnataka");

System.out.println(cust);
context.close();


}
}