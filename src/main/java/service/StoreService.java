package service;

import model.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreService {
    public StoreService() {
    }

    public Store getStore(String id){
        return new Store();
    }

    public List<Store> getStores() {
        return new ArrayList<Store>();
    }

    public Store addStore (Store store){
        return new Store();
    }

    public Store updateStore (String id, Store store){
        return new Store();
    }

    public void removeStore (String id){

    }
}
