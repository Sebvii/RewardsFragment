package com.example.rewardsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    private int userPoints = 350;
    private ProgressBar progressBar;
    private ProgressBar progressBar2;
    private ProgressBar progressBar3;
    private ProgressBar progressBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBar2 = findViewById(R.id.progressBar2);
        progressBar3 = findViewById(R.id.progressBar3);
        progressBar4 = findViewById(R.id.progressBar4);

        Button redeemButton1 = findViewById(R.id.redeemButton1);
        Button redeemButton2 = findViewById(R.id.redeemButton2);
        Button redeemButton3 = findViewById(R.id.redeemButton3);
        Button redeemButton4 = findViewById(R.id.redeemButton4);

        updatePointsDisplay();

        redeemButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRedeemDialog();
                Intent intent = new Intent(MainActivity.this, Congratss.class);
                startActivity(intent);
            }
        });

        redeemButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRedeemDialog();
                Intent intent = new Intent(MainActivity.this, Congratss.class);
                startActivity(intent);
            }
        });

        redeemButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRedeemDialog();
                Intent intent = new Intent(MainActivity.this, Wani.class);
                startActivity(intent);
            }
        });

        redeemButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRedeemDialog();
                Intent intent = new Intent(MainActivity.this, Playmaker.class);
                startActivity(intent);
            }
        });
    }

    private void updatePointsDisplay() {
        progressBar.setProgress(userPoints * 100 / 1000);
        progressBar2.setProgress(userPoints * 100 / 1000);
        progressBar3.setProgress(userPoints * 100 / 1000);
        progressBar4.setProgress(userPoints * 100 / 1000);
    }

    private void showRedeemDialog() {
        FragmentManager fm = getSupportFragmentManager();
        RedeemDialog redeemDialog = new RedeemDialog();
        redeemDialog.show(fm, "redeem_dialog");
    }
}
