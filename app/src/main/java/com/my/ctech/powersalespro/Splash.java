package com.my.ctech.powersalespro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Splash();
    }
    public void Splash()
    {
        Thread td=new Thread()
        {
            public void run()
            {
                try{
                    // Start animating the image
                    sleep(2000);
                    Intent it=new Intent(getApplicationContext(),MainActivity.class );
                    startActivity(it);
                    finish();
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        };
        td.start();

    }
}
