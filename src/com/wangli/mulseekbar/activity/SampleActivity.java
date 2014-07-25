
package com.wangli.mulseekbar.activity;

import com.wangli.mulseekbar.R;
import com.wangli.mulseekbar.view.VerticalReverseSeekBar;
import com.wangli.mulseekbar.view.VerticalSeekBar;
import com.wangli.mulseekbar.view.VerticalSeekBar.OnSeekBarChangeListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SampleActivity extends Activity {

    VerticalSeekBar verticalSeekBar = null;
    VerticalReverseSeekBar verticalSeekBarReverse = null;
    TextView tvVsProgress, tvVsReverseProgress = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        verticalSeekBar = (VerticalSeekBar) findViewById(R.id.vertical_Seekbar);
        verticalSeekBarReverse = (VerticalReverseSeekBar) findViewById(R.id.seekbar_reverse);
        tvVsProgress = (TextView) findViewById(R.id.vertical_sb_progresstext);
        tvVsReverseProgress = (TextView) findViewById(R.id.reverse_sb_progresstext);

        verticalSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(VerticalSeekBar vBar, int progress, boolean fromUser) {
                tvVsProgress.setText(progress + "");
            }

            @Override
            public void onStartTrackingTouch(VerticalSeekBar vBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStopTrackingTouch(VerticalSeekBar vBar) {
                // TODO Auto-generated method stub

            }
        });

        verticalSeekBarReverse
                .setOnSeekBarChangeListener(new VerticalReverseSeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(VerticalReverseSeekBar vBar, int progress,
                            boolean fromUser) {
                        tvVsReverseProgress.setText(progress + "");
                    }

                    @Override
                    public void onStartTrackingTouch(VerticalReverseSeekBar verticalReverseSeekBar) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onStopTrackingTouch(VerticalReverseSeekBar vBar) {
                        // TODO Auto-generated method stub

                    }
                });

    }
}
