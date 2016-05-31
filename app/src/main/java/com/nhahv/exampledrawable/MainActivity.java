package com.nhahv.exampledrawable;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView mImageView;
    private ImageView mImageView2;
    private LayerDrawable mLayerDrawable;
    private int[] ids = new int[]{R.id.one, R.id.two, R.id.three, R.id.four, R.id.five};
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

//        mImageView = (Button) findViewById(R.id.imageView2);
//        mImageView2 = (ImageView) findViewById(R.id.imageView3);
//        mLayerDrawable = (LayerDrawable) mImageView.getBackground();
//        mImageView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                int i = index % 4;
//                mLayerDrawable.setDrawableByLayerId(ids[i], getResources().getDrawable(R.drawable.ic_launcher));
//                for (int id = 0; id < ids.length; id++) {
//                    if (id != i) {
//                        mLayerDrawable.setDrawableByLayerId(ids[id], getResources().getDrawable(R.drawable.bg));
//                    }
//                }
//                index++;
//
//                mImageView.postInvalidate();
//                Log.d("Tag", index + "");
//
//            }
//        });
//
//        AnimationDrawable animationDrawable = (AnimationDrawable) mImageView2.getBackground();
////        animationDrawable.start();

        mImageView = (ImageView) findViewById(R.id.image_clip);
        ClipDrawable drawable = (ClipDrawable) mImageView.getDrawable();
        drawable.setLevel(drawable.getLevel());

        Button btnRotate = (Button) findViewById(R.id.btn_rotate);
        RotateDrawable drawable1 = (RotateDrawable) btnRotate.getBackground();
        drawable1.setLevel(500);

    }


}
