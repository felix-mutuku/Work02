package ke.co.ekenya.www.brooksidedairy.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import ke.co.ekenya.www.brooksidedairy.R;

public class SignUpWaitingActivity extends AppCompatActivity {
    TextView timer, terms;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_waiting);

        timer = findViewById(R.id.timer);
        terms = findViewById(R.id.terms);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
            }
        });

        startTimer();
    }

    private void startTimer() {
        new CountDownTimer(32000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer.setText(String.format("0:%s", String.valueOf(counter + 30)));
                counter--;
            }

            public void onFinish() {
                goToMain();
            }
        }.start();
    }

    private void goToMain() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }


}
