package com.example.dinocoding_submission_badmintonstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HalamanUtama extends AppCompatActivity {
    private final ArrayList<String> racketImages = new ArrayList<>();
    private final ArrayList<String> racketNames = new ArrayList<>();
    private final ArrayList<String> racketPrices = new ArrayList<>();
    private final ArrayList<String> racketDetails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        RecyclerView rvRacket = findViewById(R.id.rv_racket);
        rvRacket.setHasFixedSize(true);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        String title = "Dinominton Store";
        setActionBarTitle(title);

        getDataInternet();
    }


    private void ProRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.rv_racket);
        ListRacketAdapter adapter = new ListRacketAdapter(racketImages, racketNames, racketPrices, racketDetails, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataInternet() {

        racketImages.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/1/11/5097565/5097565_19e415ed-aada-406c-80be-471d2af9077a_700_700.jpg");
        racketImages.add("https://cf.shopee.co.id/file/ae075dfaf1968abae774334f126fa8a3");
        racketImages.add("https://i.pinimg.com/originals/f0/5c/34/f05c345efd46d87f9b72a9c77d20de78.jpg");
        racketImages.add("https://i.pinimg.com/originals/f0/5c/34/f05c345efd46d87f9b72a9c77d20de78.jpg");
        racketImages.add("https://cdn-sunriseclick.s3.amazonaws.com/images/gallery/original/202002/7254_GO_1582520656888.jpg");
        racketImages.add("https://shopbadmintononline.com/images_zoom/badminton-racket-AYPM452-1-B.jpg");
        racketImages.add("https://shopbadmintononline.com/images_zoom/badminton-racket-AYPP008-1-B.jpg");
        racketImages.add("https://cdn3.volusion.com/s2mhx.7dfsu/v/vspfiles/photos/RACKET-LINING-FLAME-N36-2.jpg");
        racketImages.add("https://ae01.alicdn.com/kf/HTB14n.ZdYArBKNjSZFLq6A_dVXar/2019-original-Victor-TK-770-High-Tension-pound-Badminton-Racket-The-Highest-35-Pounds-Badminton-Racquets.jpg");
        racketImages.add("https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//100/MTA-22282579/victor_raket_badminton_victor_jetspeed_s11_made_in_taiwan_30lbs_free_tas_grip_full01_hid6jj6x.jpg");
        racketImages.add("https://ae01.alicdn.com/kf/HTB1tjZiX.LrK1Rjy1zbq6AenFXaM/Victor-Badminton-Racquet-Badminton-Racket-100-carbon-With-Free-Grip-BRS-1900-BRAVE-SWORD-1900.jpg");
        racketImages.add("https://ae01.alicdn.com/kf/HTB1hiEzth1YBuNjy1zcq6zNcXXaq/Asli-Victor-Tegangan-Tinggi-HX-20H-Raket-Bulutangkis-Tertinggi-35LBS-Pound-Badminton-Raket-dengan-Tas.jpg");
        racketImages.add("https://shop.r10s.jp/luckpiece/cabinet/item_img/4662/vtr-tk-f-1.jpg");
        racketImages.add("https://cdn.webshopapp.com/shops/112848/files/343745753/victor-victor-auraspeed-90s-3u.jpg");
        racketImages.add("https://www.victorsport.com/files/en_us/product/list_70183_20200121104024.jpg");

        racketNames.add("YONEX - Astrox 77");
        racketNames.add("YONEX - Voltric 80");
        racketNames.add("YONEX - Astrox 88D");
        racketNames.add("YONEX - Astrox 88S");
        racketNames.add("YONEX - Astrox 100ZX");
        racketNames.add("LINING - Aeronut 7000");
        racketNames.add("LINING - 3D Calibar 001");
        racketNames.add("LINING - N36");
        racketNames.add("VICTOR - TK 770 HT");
        racketNames.add("VICTOR - Jetspeed S11");
        racketNames.add("VICTOR - Brave Sword 1900");
        racketNames.add("VICTOR - HX 20H");
        racketNames.add("VICTOR - Thruster K");
        racketNames.add("VICTOR - Auraspeed 90");
        racketNames.add("VICTOR - Dragon Ball Z Edition");

        racketPrices.add("Rp 2.499.000");
        racketPrices.add("Rp 1.899.000");
        racketPrices.add("Rp 2.299.000");
        racketPrices.add("Rp 2.199.000");
        racketPrices.add("Rp 2.450.000");
        racketPrices.add("Rp 2.990.000");
        racketPrices.add("Rp 3.299.000");
        racketPrices.add("Rp 2.650.000");
        racketPrices.add("Rp 1.850.000");
        racketPrices.add("Rp 1.150.000");
        racketPrices.add("Rp 1.300.000");
        racketPrices.add("Rp 1.450.000");
        racketPrices.add("Rp 1.750.000");
        racketPrices.add("Rp 1.350.000");
        racketPrices.add("Rp 1.000.000");

        racketDetails.add("Type: Head Heavy, Flex: Medium, Head: Isometric, Weight: 80-84gr, Grip Size: 5U, Tension: 20-28 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Stiff, Head: Isometric, Weight: 80-86gr, Grip Size: 4U, Tension: 21-29 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Stiff, Head: Isometric, Weight: 82-86gr, Grip Size: 4U, Tension: 20-29 lbs.");
        racketDetails.add("Type: Even Balance, Flex: Medium Stiff, Head: Isometric, Weight: 80-83gr, Grip Size: 5U, Tension: 21-29 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Medium Stiff, Head: Isometric, Weight: 80-83gr, Grip Size: 4U, Tension: 22-27 lbs.");
        racketDetails.add("Type: Even Balance, Flex: Medium, Head: Isometric, Weight: 80-84gr, Grip Size: 5U, Tension: 20-28 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Stiff, Head: Isometric, Weight: 82-86gr, Grip Size: 4U, Tension: 20-29 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Stiff, Head: Isometric, Weight: 79-83gr, Grip Size: 4U, Tension: 20-29 lbs.");
        racketDetails.add("Type: Even Balance, Flex: Medium Stiff, Head: Isometric, Weight: 78-80gr, Grip Size: 4U, Tension: 22-27 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Stiff, Head: Isometric, Weight: 76-79gr, Grip Size: 4U, Tension: 21-29 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Medium, Head: Isometric, Weight: 80-88gr, Grip Size: 4U, Tension: 20-28 lbs.");
        racketDetails.add("Type: Even Balance, Flex: Flexible, Head: Isometric, Weight: 78-82gr, Grip Size: 4U, Tension: 22-27 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Stiff, Head: Isometric, Weight: 79-83gr, Grip Size: 4U, Tension: 20-29 lbs.");
        racketDetails.add("Type: Head Heavy, Flex: Medium, Head: Isometric, Weight: 80-88gr, Grip Size: 4U, Tension: 20-28 lbs.");
        racketDetails.add("Type: Even Balance, Flex: Flexible, Head: Isometric, Weight: 78-82gr, Grip Size: 4U, Tension: 22-27 lbs.");

        ProRecyclerViewAdapter();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        if (selectedMode == R.id.about_move) {
            Intent intent = new Intent(this, HalamanAbout.class);
            startActivity(intent);
        }
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}