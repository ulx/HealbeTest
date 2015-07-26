package com.rusin.heable.model;


public class ManagerModel {
    private ModelCurrency currentyModel;
    private static ManagerModel instance;

    public static ManagerModel getInstance() {
        if (instance == null) {
            instance = new ManagerModel();
        }
        return instance;
    }

    public ModelCurrency getCurrentyModel() {
        if (currentyModel == null) {
            currentyModel = new ModelCurrency();
        }

        return currentyModel;
    }
}
