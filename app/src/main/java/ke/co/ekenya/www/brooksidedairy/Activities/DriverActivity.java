package ke.co.ekenya.www.brooksidedairy.Activities;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import ke.co.ekenya.www.brooksidedairy.R;

public class DriverActivity extends AppCompatActivity {
    TextView measurement_of_lactometer_text;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        back = findViewById(R.id.back);
        measurement_of_lactometer_text = findViewById(R.id.measurement_of_lactometer_text);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        measurement_of_lactometer_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLacrometerDialog();
            }
        });

    }

    private void showLacrometerDialog() {
        final Dialog dialog = new Dialog(DriverActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.lactometer_dialog);

        /*TextView dialog_factory = dialog.findViewById(R.id.dialog_factory);
        TextView dialog_centre = dialog.findViewById(R.id.dialog_centre);

        dialog_factory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                dialog.dismiss();
            }
        });

        dialog_centre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                dialog.dismiss();
            }
        });*/

        dialog.show();
    }
}
