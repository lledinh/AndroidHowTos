package com.ledinh.daggerhowto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.ledinh.daggerhowto.component.DaggerDependencyComponent;
import com.ledinh.daggerhowto.component.DependencyComponent;
import com.ledinh.daggerhowto.dependency.DependencyC;
import com.ledinh.daggerhowto.module.ContextModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DependencyComponent daggerRandomUserComponent = DaggerDependencyComponent.builder()
                .contextModule(new ContextModule(this))
                .build();


        DependencyC c = daggerRandomUserComponent.getC();

        Log.d(MainActivity.class.getSimpleName(), c.toString());

        TextView textView = findViewById(R.id.textView);
        textView.setText(c.toString());
    }
}
