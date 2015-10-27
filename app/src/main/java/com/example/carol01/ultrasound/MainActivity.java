package com.example.carol01.ultrasound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button)findViewById(R.id.button);
       // mImageButton1 =(ImageButton) findViewById(R.id.imageButton);

        login.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                //setContentView(R.layout.message);

//                mImageButton1.setImageResource(R.drawable.iconfull);
                Intent intentab = new Intent();
                intentab.setClass(MainActivity.this, Message.class);
                startActivity(intentab);
                //將Layout1.activity關閉
                MainActivity.this.finish();

            }
        });
    }
}
