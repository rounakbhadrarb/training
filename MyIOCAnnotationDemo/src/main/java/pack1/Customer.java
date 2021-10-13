package pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("customer1") // Customer customer = new Customer();
public class Customer {
private String custId;
private String custName;
private Address address; //property name of Address class:address


public Customer() {
super();
}



public Customer(Address address) {

this.address = address;
}



public String getCustId() {
return custId;
}



public void setCustId(String custId) {
this.custId = custId;
}



public String getCustName() {
return custName;
}



public void setCustName(String custName) {
this.custName = custName;
}



public Address getAddress() {
return address;
}

@Autowired
public void setAddress(Address address) {
this.address = address;
}



@Override
public String toString() {
return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
}

}