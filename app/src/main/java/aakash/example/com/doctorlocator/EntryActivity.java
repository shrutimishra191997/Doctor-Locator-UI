package aakash.example.com.doctorlocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        CardView docLogin = (CardView) findViewById(R.id.docLogin);
        CardView docReg = (CardView) findViewById(R.id.docReg);
        CardView userEntry = (CardView) findViewById(R.id.user);
        TextView dev = (TextView) findViewById(R.id.team1);
        ImageView dev1 = (ImageView) findViewById(R.id.team);

        docLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EntryActivity.this, DocLoginActivity.class);
                startActivity(i);
            }
        });

        docReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EntryActivity.this, DocRegActivity.class);
                startActivity(i);
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EntryActivity.this, DevsActivity.class);
                startActivity(i);
            }
        });

        dev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EntryActivity.this, DevsActivity.class);
                startActivity(i);
            }
        });

//        userEntry.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(EntryActivity.this, .class);
//                startActivity(i);
//            }
//        });
    }
}
