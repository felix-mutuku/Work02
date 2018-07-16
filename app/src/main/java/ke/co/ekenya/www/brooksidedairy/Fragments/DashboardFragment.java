package ke.co.ekenya.www.brooksidedairy.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import ke.co.ekenya.www.brooksidedairy.Activities.MainActivity;
import ke.co.ekenya.www.brooksidedairy.R;

public class DashboardFragment extends Fragment {

    ImageView drawer_icon, notification_icon, search_icon;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        drawer_icon = view.findViewById(R.id.drawer_icon);
        notification_icon = view.findViewById(R.id.notification_icon);
        search_icon = view.findViewById(R.id.search_icon);

        drawer_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).openDrawer();
            }
        });

        notification_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                goToNotifications();
            }
        });

        search_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                goToSearch();
            }
        });

        return view;
    }

    private void goToSearch() {
        SearchFragment fragmentSearch = new SearchFragment();
        android.support.v4.app.FragmentTransaction fragmentTransactionSearch = getActivity()
                .getSupportFragmentManager().beginTransaction();
        fragmentTransactionSearch.replace(R.id.app_content, fragmentSearch);
        fragmentTransactionSearch.addToBackStack(null);
        fragmentTransactionSearch.commit();
    }

    private void goToNotifications() {
        NotificationsFragment fragmentShop = new NotificationsFragment();
        android.support.v4.app.FragmentTransaction fragmentTransactionShop = getActivity()
                .getSupportFragmentManager().beginTransaction();
        fragmentTransactionShop.replace(R.id.app_content, fragmentShop);
        fragmentTransactionShop.addToBackStack(null);
        fragmentTransactionShop.commit();
    }

}
