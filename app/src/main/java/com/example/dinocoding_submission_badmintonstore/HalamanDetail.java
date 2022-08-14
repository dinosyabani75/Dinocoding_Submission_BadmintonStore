package com.example.dinocoding_submission_badmintonstore;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class HalamanDetail extends AppCompatActivity {
    ImageView imageViewFotoRaket;
    TextView textViewNamaRaket, textViewPrice, textViewDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_detail);

        //inisialisasi id view dari xml class ini.
        imageViewFotoRaket = findViewById(R.id.imageViewFotoRaket);
        textViewNamaRaket = findViewById(R.id.textViewNamaRaket);
        textViewPrice = findViewById(R.id.textViewPrice);
        textViewDetail = findViewById(R.id.textViewDetail);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        String title = "Racket Details";
        setActionBarTitle(title);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("racketImages") && getIntent().hasExtra("racketNames") && getIntent().hasExtra("racketPrices") && getIntent().hasExtra("racketDetails")) {
            String racketImages = getIntent().getStringExtra("racketImages");
            String racketNames = getIntent().getStringExtra("racketNames");
            String racketPrices = getIntent().getStringExtra("racketPrices");
            String racketDetails = getIntent().getStringExtra("racketDetails");

            setDataActivity(racketImages, racketNames, racketPrices, racketDetails);
        }
    }

    private void setDataActivity(String racketImages, String racketNames, String racketPrices, String racketDetails) {
        Glide.with(this).asBitmap().load(racketImages).into(imageViewFotoRaket);
        textViewNamaRaket.setText(racketNames);
        textViewPrice.setText(racketPrices);
        textViewDetail.setText(racketDetails);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}