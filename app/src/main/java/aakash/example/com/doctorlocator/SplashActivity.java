package aakash.example.com.doctorlocator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo = (ImageView) findViewById(R.id.img1);
        logo.animate().alpha(1f).scaleX(0.9f).scaleY(0.9f).setDuration(2500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), EntryActivity.class);
                startActivity(i);
                finish();
            }
        }, 3600);
    }
}
