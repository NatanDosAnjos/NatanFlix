package com.example.natanflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton com;
    RadioButton sem;
    RadioGroup grupoPlayPause;
    private ImageView imageViewPlayPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com                  = findViewById(R.id.radioButtonCom);
        sem                  = findViewById(R.id.radioButtonSem);
        grupoPlayPause       = findViewById(R.id.radioGroupComSem);
        imageViewPlayPause   = findViewById(R.id.imageViewPlayPause);
        radioGroupPlayPause();
    }
    

    public void radioGroupPlayPause() {
        grupoPlayPause.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(R.id.radioButtonCom == id) {
                    imageViewPlayPause.setImageResource(R.drawable.ic_play_arrow_48dp);
                }
                else if (id == R.id.radioButtonSem) {
                    imageViewPlayPause.setImageResource(R.drawable.ic_pause_48dp);
                }
            }
        });
    }

    /*public void playPause(View view) {
        if(com.isChecked()) {
            imageViewPlayPause.setImageResource(R.drawable.ic_play_arrow_48dp);
        } else {
            imageViewPlayPause.setImageResource(R.drawable.ic_pause_48dp);
        }
    }*/
}
