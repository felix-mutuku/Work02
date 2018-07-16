package ke.co.ekenya.www.brooksidedairy.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;

import ke.co.ekenya.www.brooksidedairy.R;

public class SearchFragment extends Fragment {
    ImageView back;
    SearchView search_bar;

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        back = view.findViewById(R.id.back);
        search_bar = view.findViewById(R.id.search_bar);

        search_bar.onActionViewExpanded();
        search_bar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //do something
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //do something
                return true;
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        return view;
    }

}
