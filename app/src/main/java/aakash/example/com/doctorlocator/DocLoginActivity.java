package aakash.example.com.doctorlocator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DocLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_login);

        Button login = (Button) findViewById(R.id.loginbutton);
        TextView registerText = (TextView) findViewById(R.id.regText);
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DocLoginActivity.this, DocRegActivity.class);
                startActivity(i);
            }
        });
    }
}
