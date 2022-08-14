package com.example.dinocoding_submission_badmintonstore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListRacketAdapter extends RecyclerView.Adapter<ListRacketAdapter.ViewHolder> {
    private final ArrayList<String> racketImages;
    private final ArrayList<String> racketNames;
    private final ArrayList<String> racketPrices;
    private final ArrayList<String> racketDetails;
    private final Context context;

    public ListRacketAdapter(ArrayList<String> racketImages, ArrayList<String> racketNames, ArrayList<String> racketPrices, ArrayList<String> racketDetails, Context context) {
        this.racketImages = racketImages;
        this.racketNames = racketNames;
        this.racketPrices = racketPrices;
        this.racketDetails = racketDetails;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_racket, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).asBitmap()
                .load(racketImages.get(position))
                .apply(new RequestOptions()
                .override(300, 300))
                .into(holder.imageViewFotoRaket);
        holder.textViewNamaRaket.setText(racketNames.get(position));
        holder.textViewPrice.setText(racketPrices.get(position));
        holder.textViewDetail.setText(racketDetails.get(position));
        holder.linearLayout.setOnClickListener(v -> {
            Toast.makeText(context, racketNames.get(position), Toast.LENGTH_LONG).show();

            Intent intent = new Intent(context, HalamanDetail.class);
            intent.putExtra("racketImages", racketImages.get(position));
            intent.putExtra("racketNames", racketNames.get(position));
            intent.putExtra("racketPrices", racketPrices.get(position));
            intent.putExtra("racketDetails", racketDetails.get(position));

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return racketNames.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final LinearLayout linearLayout;
        final CircleImageView imageViewFotoRaket;
        final TextView textViewNamaRaket;
        final TextView textViewPrice;
        final TextView textViewDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoRaket = itemView.findViewById(R.id.imageViewFotoRaket);
            textViewNamaRaket = itemView.findViewById(R.id.textViewNamaRaket);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            textViewDetail = itemView.findViewById(R.id.textViewDetail);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
