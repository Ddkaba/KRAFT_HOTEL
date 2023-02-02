package com.example.kraft_hotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Hotel_Room_Adapter extends RecyclerView.Adapter<Hotel_Room_Adapter.ViewHolder> {
    OnClickListener listener;
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView pr_item, d_item;
        public ImageView hr_item;
        public ViewHolder(View itemView) {
            super(itemView);
            pr_item = itemView.findViewById(R.id.price_item);
            d_item = itemView.findViewById(R.id.description_item);
            hr_item = itemView.findViewById(R.id.Hotel_Room_ImageView);
        }
    }

    private List<Hotel_Room> mHotel_Room;

    public Hotel_Room_Adapter(List<Hotel_Room> mHotel_Room, OnClickListener listener) { this.mHotel_Room = mHotel_Room; this.listener = listener; }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View HotelRoomView = inflater.inflate(R.layout.hotel_room_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(HotelRoomView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel_Room hotel_room = mHotel_Room.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnClicked(hotel_room.getFull_description(),hotel_room.getPhoto());
            }
        });
        TextView P = holder.pr_item;
        P.setText(hotel_room.getPrice());
        TextView D = holder.d_item;
        D.setText(hotel_room.getDescription());
        ImageView I = holder.hr_item;
        I.setImageResource(hotel_room.getPicture());
    }

    @Override
    public int getItemCount() { return mHotel_Room.size(); }
}
