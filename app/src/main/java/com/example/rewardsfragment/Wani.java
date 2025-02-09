package com.example.rewardsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Wani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wani); // Ensure this XML file exists


        // Initialize UI Elements
        Button backBtn = findViewById(R.id.backbtn);

        // Set Click Listener for the top-left Back Button

        // Set Click Listener for the bottom Back Button
        backBtn.setOnClickListener(v -> navigateToHome());
    }

    // Function to navigate back to the main/home screen
    private void navigateToHome() {
        Intent intent = new Intent(Wani.this, MainActivity.class); // Change to the correct destination activity
        startActivity(intent);
        finish(); // Close the current activity
    }
}
