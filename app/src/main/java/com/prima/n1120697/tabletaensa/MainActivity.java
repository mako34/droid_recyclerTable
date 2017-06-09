package com.prima.n1120697.tabletaensa;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.prima.n1120697.tabletaensa.reciclaorVista.RecyclerFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            RecyclerFragment fragment = new RecyclerFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();

        }

    }
}
