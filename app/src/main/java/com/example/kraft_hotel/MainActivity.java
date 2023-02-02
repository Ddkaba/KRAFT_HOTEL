package com.example.kraft_hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Number, Number1, Address;
    Button znum;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number = findViewById(R.id.textViewNumber);
        Number1 = findViewById(R.id.textViewNumber1);
        Address = findViewById(R.id.textViewAddressHouse);
        imageView = findViewById(R.id.imageMenu);
        znum = findViewById(R.id.button);

        Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8(800)5007376"));
                startActivity(intent);
            }
        });

        Number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+7(812)3100201"));
                startActivity(intent);
            }
        });

        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.ru/maps/place/Kravt+Sadovaya+Hotel/@59.9298325,30.3222335,17z/data=!3m1!4b1!4m8!3m7!1s0x46963106c63d3e51:0x93d14826f9f5c1df!5m2!4m1!1i2!8m2!3d59.929566!4d30.3240065?hl=ru"));
                startActivity(intent);
            }
        });

        znum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZNumber_fragment Fragment = new ZNumber_fragment();
                Bundle bundle = new Bundle();
                bundle.putString("ZN","https://kravt-hotel.ru/book");
                Fragment.setArguments(bundle);
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fl_content, Fragment);
                transaction.commit();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { showPopupMenu(v); }
        });

        Hotel_Room_fragment Fragment = new  Hotel_Room_fragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fl_content, Fragment);
        transaction.commit();
    }

    private void showPopupMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.menu);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:
                        Hotel_Room_fragment Fragment = new  Hotel_Room_fragment();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fl_content, Fragment);
                        transaction.commit();
                        return true;
                    case R.id.item2:
                        Partner_fragment Fragment1 = new Partner_fragment();
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.fl_content, Fragment1);
                        transaction1.commit();
                        return true;
                    case R.id.item3:
                        History_fragment Fragment2 = new History_fragment();
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.fl_content, Fragment2);
                        transaction2.commit();
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
            @Override
            public void onDismiss(PopupMenu menu) {
            }
        });
        popupMenu.show();
    }
}
