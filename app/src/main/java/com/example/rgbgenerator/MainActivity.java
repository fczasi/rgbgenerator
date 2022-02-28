package com.example.rgbgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private SeekBar red, green, blue;
    private LinearLayout colours;
    private int r = 0, g = 0, b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.r);
        green = findViewById(R.id.g);
        blue = findViewById(R.id.b);
        colours = findViewById(R.id.paleta);

        red.setMax(255);
        green.setMax(255);
        blue.setMax(255);

        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                r = progress;
                zmianakoloru(r, g, b);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                g = progress;
                zmianakoloru(r, g, b);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                b = progress;
                zmianakoloru(r, g, b);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void zmianakoloru(int r, int g, int b){
        colours.setBackgroundColor(Color.rgb(r, g, b));
    }

    public void losuj(View view) {
        Random r = new Random();
        Random g = new Random();
        Random b = new Random();

        zmianakoloru(r.nextInt(256), g.nextInt(256), b.nextInt(256));
    }
}