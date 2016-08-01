package com.duquehenry.petagrammenufragments.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.duquehenry.petagrammenufragments.pojo.Mascota;
import com.duquehenry.petagrammenufragments.R;
import java.util.ArrayList;

/**
 * Created by hduque on 30/07/2016.
 */
public class AdaptadorMascota extends RecyclerView.Adapter<AdaptadorMascota.MascotaViewHolder>{
    ArrayList<Mascota> mascotas;
    Activity activity;

    //Constructor
    public AdaptadorMascota(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Infla el Layout y pasara por el ViewHolder para que obtenga los datos que vienen
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(view);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);

        mascotaViewHolder.imageViewFotoMascotaCardView.setImageResource(mascota.getFotoMascota());
        mascotaViewHolder.textViewNombreMascotaCardView.setText(mascota.getNombreMascota());
        mascotaViewHolder.textViewRatingCardView.setText(mascota.getRatingMascota());

        mascotaViewHolder.imagenButtonRatingCardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Te gusta " + mascota.getNombreMascota(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Cantidad de elementos que contiene mi lista
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    //Clase estatica MascotaViewHolder
    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewFotoMascotaCardView;
        private ImageButton imagenButtonRatingCardView;
        private TextView textViewNombreMascotaCardView;
        private TextView textViewRatingCardView;

        public MascotaViewHolder(View itemView){
            super(itemView);
            imageViewFotoMascotaCardView        = (ImageView)       itemView.findViewById(R.id.idCardViewMascota_imageViewFoto);
            imagenButtonRatingCardView         = (ImageButton)     itemView.findViewById(R.id.idCardViewMascota_imagenButtonRating);
            textViewNombreMascotaCardView       = (TextView)        itemView.findViewById(R.id.idCardViewMascota_textViewNombreMascota);
            textViewRatingCardView             = (TextView)        itemView.findViewById(R.id.idCardViewMascota_textViewRating);
        }
    }
}
