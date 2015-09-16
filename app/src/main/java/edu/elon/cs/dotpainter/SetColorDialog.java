package edu.elon.cs.dotpainter;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;

import edu.elon.cs.dotpainter.R;

public class SetColorDialog extends Activity {



    private int seekR, seekG, seekB;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_color_dialog);

        SeekBar seekBarRed = (SeekBar) findViewById(R.id.seekbar2);
        SeekBar seekBarGreen = (SeekBar) findViewById(R.id.seekbar3);
        SeekBar seekBarBlue = (SeekBar) findViewById(R.id.seekbar4);

        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekR = progress;

                doSomethingWithColor();
            }
        });

        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekG = progress;

                doSomethingWithColor();
            }
        });

        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekB = progress;

                doSomethingWithColor();
            }
        });

    }

    public int doSomethingWithColor() {
        int color = Color.rgb(seekR, seekG, seekB);
        // Do something with color
        return color;
    }
}