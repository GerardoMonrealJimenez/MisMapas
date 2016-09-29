package mx.com.rteck.mismapas.Adaptador;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import mx.com.rteck.mismapas.MapsActivity;
import mx.com.rteck.mismapas.Pojo.Lugar;
import mx.com.rteck.mismapas.R;

/**
 * Created by Gerardo Monreal J on 29/09/2016.
 */

public class LugaresAdaptador extends RecyclerView.Adapter<LugaresAdaptador.LugaresViewHolder> {

    Activity activity;
    ArrayList<Lugar>lugares;

    public LugaresAdaptador(Activity activity, ArrayList<Lugar> lugares) {
        this.activity = activity;
        this.lugares = lugares;
    }

    @Override
    public LugaresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // da de alta el layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lugar_layout,parent,false);
        return new LugaresViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LugaresViewHolder holder, int position) {

        //asocia cada elemento de nuestra lista con cada view
        final Lugar lugar= lugares.get(position);
        holder.imgLugar.setImageResource(lugar.getFoto());

        holder.imgLugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(activity,MapsActivity.class);
                i.putExtra("longitud",lugar.getLongitud());
                i.putExtra("latitud",lugar.getLatitud());
                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }




    public static class LugaresViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgLugar;

        public LugaresViewHolder(View itemView) {
            super(itemView);
            // asosiar objeto con view

            imgLugar= (ImageView) itemView.findViewById(R.id.imgLugar);
        }
    }
}
