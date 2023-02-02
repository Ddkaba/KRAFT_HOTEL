package com.example.kraft_hotel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Partner_fragment extends Fragment implements OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.partner_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview2);
        ArrayList<Partner> partners = new ArrayList<>();
        partners.add(new Partner(R.drawable.booking, "https://www.booking.com/"));
        partners.add(new Partner(R.drawable.expedia, "https://www.expedia.com/"));
        partners.add(new Partner(R.drawable.prohotel, "https://prohotel.ru/"));
        partners.add(new Partner(R.drawable.roomguru, "https://www.roomguru.com/"));
        partners.add(new Partner(R.drawable.tripadvisor, "https://www.tripadvisor.ru/"));
        partners.add(new Partner(R.drawable.visitpeterburg,"https://www.visit-petersburg.ru/"));
        Partner_Adapter Adapter = new Partner_Adapter(partners, this);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;

    }

    @Override
    public void OnClicked(String full_description, ArrayList<Integer> Photo) {
    }

    @Override
    public void OnClicked(String url) {
        ZNumber_fragment Fragment = new ZNumber_fragment();
        Bundle bundle = new Bundle();
        bundle.putString("ZN",url);
        Fragment.setArguments(bundle);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fl_content, Fragment);
        transaction.commit();
    }
}
