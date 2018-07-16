package ke.co.ekenya.www.brooksidedairy.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ke.co.ekenya.www.brooksidedairy.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    Button sign_in, send;
    EditText mobile_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        sign_in = findViewById(R.id.sign_in);
        send = findViewById(R.id.send);
        mobile_number = findViewById(R.id.mobile_number);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
            }
        });
    }
}
