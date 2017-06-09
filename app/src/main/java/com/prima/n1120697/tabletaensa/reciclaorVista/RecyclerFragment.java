package com.prima.n1120697.tabletaensa.reciclaorVista;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prima.n1120697.tabletaensa.R;

/**
 * Created by n1120697 on 9/6/17.
 */

public class RecyclerFragment extends Fragment {

    private static final int DATASET_COUNT = 6;

    protected RecyclerView mRecyclerView;
    protected MiAdaptador miAdaptador;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected String[] mDataSet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataSet();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_frag, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getActivity());
        setmRecyclerViewLayoutManager();
        miAdaptador = new MiAdaptador(mDataSet);
        mRecyclerView.setAdapter(miAdaptador);

        return rootView;
    }

    public void setmRecyclerViewLayoutManager(){
        int scrollPosition = 0;

        //if layout manager already set, get scroll position
        if (mRecyclerView.getLayoutManager() != null) {
            scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }

        mRecyclerView.setLayoutManager(new LinearLayoutManager((getActivity())));
        mRecyclerView.scrollToPosition(scrollPosition);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    private void initDataSet() {

        mDataSet = new String[DATASET_COUNT];
        for (int i = 0; i<DATASET_COUNT;i++){
            mDataSet[i] = "ss9 :"+i;
        }

    }
}
