package model;

import java.util.List;
import java.util.Objects;

public class Store {

    private String id;
    private String storeName;
    private Address address;
    private List<Employee> employees;


    public Store(String id, String storeName, Address address, List<Employee> employees) {
        this.id = id;
        this.storeName = storeName;
        this.address = address;
        this.employees = employees;
    }

    public Store() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id) &&
                Objects.equals(storeName, store.storeName) &&
                Objects.equals(address, store.address) &&
                Objects.equals(employees, store.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storeName, address, employees);
    }

    @Override
    public String toString() {
        return "Store{" +
                "id='" + id + '\'' +
                ", storeName='" + storeName + '\'' +
                ", address=" + address +
                ", employees=" + employees +
                '}';
    }
}
