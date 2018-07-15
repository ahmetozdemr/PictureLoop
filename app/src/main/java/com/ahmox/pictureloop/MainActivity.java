package com.ahmox.pictureloop;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    MediaPlayer mediaPlayer;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
        mediaPlayer = MediaPlayer.create(this,R.raw.sound);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (true){
                    if(x==0){
                        mediaPlayer.start();
                        imageView.setImageResource(R.drawable.pet2);
                        x = 1;
                        break;
                    }
                    if(x == 1){
                        mediaPlayer.start();
                        imageView.setImageResource(R.drawable.pet3);
                        x = 2;
                        break;
                    }
                    if(x == 2){
                        mediaPlayer.start();
                        imageView.setImageResource(R.drawable.pet1);
                        x = 0;
                        break;
                    }
                }
            }
        });

    }
}
