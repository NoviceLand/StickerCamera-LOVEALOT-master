package com.stickercamera.app.camera.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.github.skykai.stickercamera.R;
import com.nineoldandroids.animation.Animator;
import com.stickercamera.app.ui.MainActivity;

/**
 * Created by root1 on 8/9/15.
 */
public class Activity_first extends Activity {
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_first);
        btn = (ImageButton) findViewById(R.id.btnOpenGallery);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplication(), MainActivity.class);
                startActivity(i);
            }
        });

        YoYo.with(Techniques.FadeInUp)
                .duration(2100).withListener(new Animator.AnimatorListener() {

            @Override
            public void onAnimationStart(Animator arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animator arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animator arg0) {
                // TODO Auto-generated method stub
                YoYo.with(Techniques.Tada)
                        .duration(2100)
                        .playOn(findViewById(R.id.logo_image));
            }

            @Override
            public void onAnimationCancel(Animator arg0) {
                // TODO Auto-generated method stub

            }
        })
                .playOn(findViewById(R.id.give_image));

        findViewById(R.id.logo_image).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1400)
                        .playOn(findViewById(R.id.logo_image));

            }
        });
    }

}
