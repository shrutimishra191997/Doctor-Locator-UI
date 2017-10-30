package aakash.example.com.doctorlocator;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

public class DevsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devs);

        CardView aakash = (CardView) findViewById(R.id.aakash);
        final CardView aditya = (CardView) findViewById(R.id.aditya);
        final CardView mansi = (CardView) findViewById(R.id.mansi);
        final CardView mayank = (CardView) findViewById(R.id.mayank);

        aakash.animate().alpha(1f).setDuration(1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                aditya.animate().alpha(1f).setDuration(1000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mansi.animate().alpha(1f).setDuration(1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mayank.animate().alpha(1f).setDuration(1000);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                    }
                                },300);
                            }
                        },300);
                    }
                },300);
            }
        },300);




    }
}
