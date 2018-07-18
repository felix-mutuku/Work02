package ke.co.ekenya.www.brooksidedairy.Activities;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import ke.co.ekenya.www.brooksidedairy.R;

public class ReportModuleCriteriaActivity extends AppCompatActivity {
    TextView cmb_param;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_module_criteria);

        cmb_param = findViewById(R.id.cmb_param);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        cmb_param.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show custom dialog
                final Dialog dialog = new Dialog(ReportModuleCriteriaActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.parameter_dialog);

                TextView dialog_factory = dialog.findViewById(R.id.dialog_factory);
                TextView dialog_centre = dialog.findViewById(R.id.dialog_centre);
                TextView dialog_station = dialog.findViewById(R.id.dialog_station);
                TextView dialog_farmer = dialog.findViewById(R.id.dialog_farmer);

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
                });

                dialog_station.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //do something
                        dialog.dismiss();
                    }
                });

                dialog_farmer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //do something
                        dialog.dismiss();
                    }
                });


                dialog.show();
            }
        });
    }
}
