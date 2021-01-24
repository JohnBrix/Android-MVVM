package com.console.viewmodelyt.repository;

import com.console.viewmodelyt.model.MainActivityModel;

public class Repository {
    private static Repository instance;

    public static Repository getInstance(){
        if(instance == null){
            instance = new Repository();
        }
        return instance;
    }


    public MainActivityModel getUser(){
        //retrofit to

        System.out.println("dito lahat lalagy ang retrofit!");
        return new MainActivityModel();
    }


}