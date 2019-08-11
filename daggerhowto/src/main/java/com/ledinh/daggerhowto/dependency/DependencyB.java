package com.ledinh.daggerhowto.dependency;

public class DependencyB {
    private String appName;


    public DependencyB(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public String toString() {
        return "DependencyB{" +
                "appName='" + appName + '\'' +
                '}';
    }
}
