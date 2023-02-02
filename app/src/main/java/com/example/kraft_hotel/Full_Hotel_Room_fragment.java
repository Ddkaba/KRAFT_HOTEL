package com.example.kraft_hotel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;

public class Full_Hotel_Room_fragment extends Fragment {
    ArrayList<Integer> Photo = new ArrayList<>();
    String description;
    int PhotoView;
    TextView desc;
    ImageView back_to_recycler,next,back, IV;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.full_description_hotel_room_fragment, container, false);
        PhotoView = 0;
        Photo = getArguments().getIntegerArrayList("photo");
        description = getArguments().getString("Full");
        desc = view.findViewById(R.id.full_description);
        back_to_recycler = view.findViewById(R.id.back_to_recycler);
        back = view.findViewById(R.id.back_imageview);
        next = view.findViewById(R.id.next_imageview);
        IV = view.findViewById(R.id.imageView4);
        desc.setText(description);
        IV.setImageResource(Photo.get(PhotoView));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhotoView = PhotoView - 1;
                if(PhotoView<=-1) PhotoView = (Photo.size()-1);
                IV.setImageResource(Photo.get(PhotoView));

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhotoView = PhotoView + 1;
                if(PhotoView>=Photo.size()) PhotoView = 0;
                IV.setImageResource(Photo.get(PhotoView));
            }
        });
        back_to_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hotel_Room_fragment Fragment = new Hotel_Room_fragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fl_content, Fragment);
                transaction.commit();
            }
        });
        return view;
    }
}
