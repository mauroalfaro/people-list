package model;

import java.util.Date;
import java.util.Objects;

public class Employee {

    private String id;
    private String name;
    private String surname;
    private String loyaltyId;
    private Address address;
    private String phone;
    private String email;
    private Date dateHired;
    private boolean isActiveEmployee;

    public Employee(String id, String name, String surname, String loyaltyId, Address address, String phone, String email, Date dateHired, boolean isActiveEmployee) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.loyaltyId = loyaltyId;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dateHired = dateHired;
        this.isActiveEmployee = isActiveEmployee;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLoyaltyId() {
        return loyaltyId;
    }

    public void setLoyaltyId(String loyaltyId) {
        this.loyaltyId = loyaltyId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public boolean isActiveEmployee() {
        return isActiveEmployee;
    }

    public void setActiveEmployee(boolean activeEmployee) {
        isActiveEmployee = activeEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return isActiveEmployee == employee.isActiveEmployee &&
                Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(loyaltyId, employee.loyaltyId) &&
                Objects.equals(address, employee.address) &&
                Objects.equals(phone, employee.phone) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(dateHired, employee.dateHired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, loyaltyId, address, phone, email, dateHired, isActiveEmployee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", loyaltyId='" + loyaltyId + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dateHired=" + dateHired +
                ", isActiveEmployee=" + isActiveEmployee +
                '}';
    }
}
