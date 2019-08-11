package com.ledinh.daggerhowto.component;

import com.ledinh.daggerhowto.dependency.DependencyC;
import com.ledinh.daggerhowto.module.ContextModule;
import com.ledinh.daggerhowto.module.DependencyModule;

import dagger.Component;

@Component(modules = {DependencyModule.class, ContextModule.class})
public interface DependencyComponent {
    DependencyC getC();
}
