package com.example.kraft_hotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Partner_Adapter extends RecyclerView.Adapter<Partner_Adapter.ViewHolder>{
    OnClickListener listener;
    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView image_item;
        public ViewHolder(View itemView) {
            super(itemView);
            image_item = itemView.findViewById(R.id.Partner_ImageView);
        }
    }
    private List<Partner> mPartner;

    public Partner_Adapter(List<Partner> mPartner, OnClickListener listener) { this.mPartner = mPartner; this.listener = listener;  }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View HotelRoomView = inflater.inflate(R.layout.partner_item, parent, false);
        Partner_Adapter.ViewHolder viewHolder = new Partner_Adapter.ViewHolder(HotelRoomView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Partner partner = mPartner.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnClicked(partner.getURL());
            }
        });
        ImageView I = holder.image_item;
        I.setImageResource(partner.getImage());
    }

    @Override
    public int getItemCount() {
        return mPartner.size();
    }
}
