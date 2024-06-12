package com.example.planetas1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detail_image);
        ImageView detailImage2 = findViewById(R.id.detail_image_2);
        ImageView detailImage3 = findViewById(R.id.detail_image_3);
        TextView detailName = findViewById(R.id.detail_name);
        TextView detailLongDesc = findViewById(R.id.detail_long_desc);
        Button backButton = findViewById(R.id.back_button);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int imageResId = intent.getIntExtra("imageResId", -1);
        int imageResId2 = intent.getIntExtra("imageResId2", -1);
        int imageResId3 = intent.getIntExtra("imageResId3", -1);
        String longDescription = intent.getStringExtra("longDescription");

        if (name != null) {
            detailName.setText(name);
        }
        if (imageResId != -1) {
            detailImage.setImageResource(imageResId);
        }
        if (imageResId2 != -1) {
            detailImage2.setImageResource(imageResId2);
        }
        if (imageResId3 != -1) {
            detailImage3.setImageResource(imageResId3);
        }
        if (longDescription != null) {
            detailLongDesc.setText(longDescription);
        }

        backButton.setOnClickListener(v -> finish());
    }
}
