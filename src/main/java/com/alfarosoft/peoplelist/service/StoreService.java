package com.alfarosoft.peoplelist.service;

import com.alfarosoft.peoplelist.builders.StoreMockDataBuilder;
import com.alfarosoft.peoplelist.exception.PeopleListException;
import com.alfarosoft.peoplelist.model.Employee;
import com.alfarosoft.peoplelist.model.Store;

import java.util.List;
import java.util.Optional;

public class StoreService {
    private StoreMockDataBuilder storeMockDataBuilder;
    private List<Store> storeList;

    public StoreService() {
        this.storeMockDataBuilder = new StoreMockDataBuilder();
        storeList = storeMockDataBuilder.buildMockedData();
    }

    public Store getStore(String id){
        if(storeList.stream().anyMatch(store1 -> store1.getId().equals(id))){
            Optional<Store> storeOptional = storeList.stream().filter(store -> store.getId().equals(id)).findFirst();
            if (storeOptional.isPresent()){
                return storeOptional.get();
            }
        }
        throw new PeopleListException("Store with id " + id + " not found");
    }

    public List<Store> getStores() {
        return storeList;
    }

    public Store addStore (Store store){
        if(storeList.stream().noneMatch(store1 -> store1.getStoreName().equals(store.getStoreName()))){
            storeList.add(store);
        }
        return store;
    }

    public Store updateStore (String id, Store store){
        return store;
    }

    public void removeStore (String id){
        if(storeList.stream().anyMatch(store1 -> store1.getId().equals(id))){
            Optional<Store> storeOptional = storeList.stream().filter(store -> store.getId().equals(id)).findFirst();
            storeOptional.ifPresent(employee -> storeList.remove(employee));
        }
        else{
            throw new PeopleListException("Store with id " + id + " not found");
        }
    }
}
