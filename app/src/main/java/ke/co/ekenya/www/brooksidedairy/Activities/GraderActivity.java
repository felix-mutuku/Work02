package ke.co.ekenya.www.brooksidedairy.Activities;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import ke.co.ekenya.www.brooksidedairy.R;

public class GraderActivity extends AppCompatActivity {
    int seekBar_value;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grader);

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        initialize();
    }

    private void initialize() {
        final Dialog dialog = new Dialog(GraderActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.period_dialog);

        SeekBar period_SeekBar = dialog.findViewById(R.id.period_SeekBar);

        period_SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekBar_value = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //seekbar has been touched
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //seekbar has stopped being touched
                if (seekBar_value == 50) {
                    Toast.makeText(GraderActivity.this,
                            "Please select time of day", Toast.LENGTH_SHORT).show();
                } else if (seekBar_value < 50) {
                    Toast.makeText(GraderActivity.this,
                            "Morning Hours " + seekBar_value, Toast.LENGTH_SHORT).show();

                    dialog.dismiss();
                } else {
                    Toast.makeText(GraderActivity.this,
                            "Evening Hours " + seekBar_value, Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            }
        });
        dialog.show();
    }
}
