package com.seekbaromdocated;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

import com.mylibrary.SeekBarIndicated;

public class MainActivity extends AppCompatActivity {
    private SeekBarIndicated mSeekBarIndicated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekBarIndicated = (SeekBarIndicated) findViewById(R.id.mSeekBarIndicated);
        mSeekBarIndicated.setOnSeekBarChangeListener(mSeekChange);

    }
    int progresse;
    private SeekBar.OnSeekBarChangeListener mSeekChange = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            progresse = progress;
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
            Log.i("MAIN","Progress"+seekBar.getProgress());
        }
    };
}
