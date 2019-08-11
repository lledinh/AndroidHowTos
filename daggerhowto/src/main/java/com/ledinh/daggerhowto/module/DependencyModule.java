package com.ledinh.daggerhowto.module;

import android.content.Context;

import com.ledinh.daggerhowto.R;
import com.ledinh.daggerhowto.dependency.DependencyA;
import com.ledinh.daggerhowto.dependency.DependencyB;
import com.ledinh.daggerhowto.dependency.DependencyC;

import dagger.Module;
import dagger.Provides;

@Module(includes = ContextModule.class)
public class DependencyModule {

    @Provides
    public DependencyA getDependencyA(){
        DependencyA dependencyA = new DependencyA();

        return dependencyA;
    }

    @Provides
    public DependencyB getDependencyB(Context context){
        DependencyB dependencyB = new DependencyB(context.getString(R.string.app_name));

        return dependencyB;
    }

    @Provides
    public DependencyC getDependencyC(DependencyA dependencyA, DependencyB dependencyB){
        DependencyC dependencyC = new DependencyC(dependencyA, dependencyB);

        return dependencyC;
    }
}
