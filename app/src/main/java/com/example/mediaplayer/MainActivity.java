package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.barbariki);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
    }
    public void play(View view){

        mp.start();
        button.setEnabled(true);
        button2.setEnabled(false);
    }
    public void stop(View view){

        mp.pause();
        button.setEnabled(false);
        button2.setEnabled(true);
    }
}