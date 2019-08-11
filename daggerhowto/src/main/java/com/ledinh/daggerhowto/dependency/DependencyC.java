package com.ledinh.daggerhowto.dependency;

public class DependencyC {
    private DependencyA dependencyA;
    private DependencyB dependencyB;

    public DependencyC(DependencyA dependencyA, DependencyB dependencyB) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
    }

    @Override
    public String toString() {
        return "DependencyC{" +
                "dependencyA=" + dependencyA +
                ", dependencyB=" + dependencyB +
                '}';
    }
}
