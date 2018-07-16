package ke.co.ekenya.www.brooksidedairy.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;
import ke.co.ekenya.www.brooksidedairy.Activities.IntroScreenActivity;
import ke.co.ekenya.www.brooksidedairy.Activities.ReportModuleActivity;
import ke.co.ekenya.www.brooksidedairy.R;

public class MainMenuFragment extends Fragment {
    ImageView back;
    CircleImageView spinning_image;
    ConstraintLayout constraint_layout;
    Button report_module;

    public MainMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);

        spinning_image = view.findViewById(R.id.spinning_image);
        constraint_layout = view.findViewById(R.id.constraint_layout);
        back = view.findViewById(R.id.back);
        report_module = view.findViewById(R.id.report_module);

        RotateAnimation rotateAnimation = new RotateAnimation(100, 360,
                Animation.RELATIVE_TO_SELF,
                0.5f,
                Animation.RELATIVE_TO_SELF,
                0.5f);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setRepeatCount(0);

        constraint_layout.startAnimation(rotateAnimation);
        spinning_image.startAnimation(rotateAnimation);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        report_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                goToReportModule();
            }
        });

        return view;
    }

    private void goToReportModule() {
        Intent intent = new Intent(getActivity(),ReportModuleActivity.class);
        startActivity(intent);
    }

}
