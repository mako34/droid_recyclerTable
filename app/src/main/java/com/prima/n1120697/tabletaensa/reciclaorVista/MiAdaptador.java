package com.prima.n1120697.tabletaensa.reciclaorVista;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prima.n1120697.tabletaensa.R;

/**
 * Created by n1120697 on 9/6/17.
 */

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder>{

    private String[] mDataSet;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View v){
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){

                }
            });

            textView = (TextView) v.findViewById(R.id.textView);

        }


        public TextView getTextView() {
            return textView;
        }
    }

    public MiAdaptador(String[] dataset) {
//        super(itemView);
        mDataSet = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTextView().setText("ss9 : "+position);

    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

}
