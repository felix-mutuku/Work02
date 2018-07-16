package ke.co.ekenya.www.brooksidedairy.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import ke.co.ekenya.www.brooksidedairy.R;

public class ReportModuleActivity extends AppCompatActivity {
    CardView specify_criteria;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_module);

        specify_criteria = findViewById(R.id.specify_criteria);
        back = findViewById(R.id.back);

        specify_criteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSpecifyCriteria();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void goToSpecifyCriteria() {
        Intent intent = new Intent(ReportModuleActivity.this, ReportModuleCriteriaActivity.class);
        startActivity(intent);
    }
}
