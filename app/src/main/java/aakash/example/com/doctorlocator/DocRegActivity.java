package aakash.example.com.doctorlocator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DocRegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_reg);

        Button register = (Button) findViewById(R.id.regButton);
        TextView loginText = (TextView) findViewById(R.id.loginTxt);
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DocRegActivity.this, DocLoginActivity.class);
                startActivity(i);

            }
        });
    }
}
