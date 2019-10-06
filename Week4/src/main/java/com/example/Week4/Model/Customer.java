package com.example.Week4.Model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "Customer", schema = "RECORDS")
public class Customer extends Person {
    @Autowired
    Person person;
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long CustomerNumber;


    @Embeddable
    public class CustomerAdress{
        public String Zipcode;
        public String Street;
        public String City;
        public int HouseNumber;

        public String getZipcode() {
            return Zipcode;
        }

        public void setZipcode(String zipcode) {
            Zipcode = zipcode;
        }

        public String getStreet() {
            return Street;
        }

        public void setStreet(String street) {
            Street = street;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public int getHouseNumber() {
            return HouseNumber;
        }

        public void setHouseNumber(int houseNumber) {
            HouseNumber = houseNumber;
        }
    }

    public Long getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        CustomerNumber = customerNumber;
    }

}
