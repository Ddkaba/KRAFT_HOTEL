package com.example.kraft_hotel;

import android.content.res.Resources;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Hotel_Room_fragment extends Fragment implements OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotel_room_fragment,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        ArrayList<Hotel_Room> HR = new ArrayList<>();
        ArrayList<Integer> Photo_0 = new ArrayList<>();
        Collections.addAll(Photo_0, R.drawable.single, R.drawable.single_one, R.drawable.single_two, R.drawable.single_three);
        ArrayList<Integer> Photo_1 = new ArrayList<>();
        Collections.addAll(Photo_1, R.drawable.double_, R.drawable.double_one, R.drawable.double_two, R.drawable.double_three,
                R.drawable.double_four,R.drawable.double_five,R.drawable.double_six);
        ArrayList<Integer> Photo_2 = new ArrayList<>();
        Collections.addAll(Photo_2, R.drawable.improved, R.drawable.improved_one, R.drawable.improved_two, R.drawable.improved_three, R.drawable.improved_five, R.drawable.improved_six,
                R.drawable.improved_seven, R.drawable.improved_eight);
        ArrayList<Integer> Photo_3 = new ArrayList<>();
        Collections.addAll(Photo_3, R.drawable.junior_suite, R.drawable.junior_suite_one, R.drawable.junior_suite_two, R.drawable.junior_suite_three, R.drawable.junior_suite_four,
                R.drawable.junior_suite_five, R.drawable.junior_suite_six, R.drawable.junior_suite_seven, R.drawable.junior_suite_eight, R.drawable.junior_suite_nine);
        ArrayList<Integer> Photo_4 = new ArrayList<>();
        Collections.addAll(Photo_4, R.drawable.lux, R.drawable.lux_one, R.drawable.lux_two, R.drawable.lux_three,  R.drawable.lux_four, R.drawable.lux_five,
                R.drawable.lux_six, R.drawable.lux_seven, R.drawable.lux_eight, R.drawable.lux_nine);
        HR.add(new Hotel_Room(0,R.drawable.single,"ОДНОМЕСТНЫЙ CТАНДАРТ ПЕРВОЙ КАТЕГОРИИ \n Односпальная кровать \n Максимум 1 человек","от 3300 руб/сутки", "О НОМЕРЕ:\n" +
                "-Односпальная кровать\n-Максимум 1 человек\n-Размер комнаты:14 м2\n-Ежедневное обслуживание\nУДОБСТВА В НОМЕРЕ:\n" +
                "-Свободный доступ Wi-fi\n-Ванная комната с душем\n-Кондиционер и отопление\n-Спутниковое ТВ\n-Фен для сушки волос\n-Телефон с городской связью\n-Сейф\n-Тапочки\n-Косметические принадлежности", Photo_0));
        HR.add(new Hotel_Room(1,R.drawable.double_,"ДВУХМЕСТНЫЙ СТАНДАРТ ПЕРВОЙ КАТЕГОРИИ \n 1 двуспальная/ 2 односпальные \n Максимум 2 человека","от 4300 руб/сутки","О НОМЕРЕ\n" +
                "-1 двуспальная/ 2 односпальные\n-Максимум 2 человека\n-Размер комнаты:18 м2\n-Ежедневное обслуживание\nУДОБСТВА В НОМЕРЕ:\n" +
                "-Свободный доступ Wi-fi\n-Ванная комната с душем или ванной\n-Кондиционер и отопление\n-Спутниковое ТВ\n-Фен для сушки волос\n-Телефон с городской связью\n" +
                "-Сейф\n-Тапочки\n-Косметические принадлежности",Photo_1));
        HR.add(new Hotel_Room(2,R.drawable.improved,"УЛУЧШЕННЫЙ СТАНДАРТ ПЕРВОЙ КАТЕГОРИИ \n Одна двуспальная кровать и кресло \n Максимум 3 человека","от 5500 руб/сутки", "О НОМЕРЕ:\n" +
                "-Одна двуспальная кровать и кресло\n-Максимум 3 человека\n-Размер комнаты:24 м2\n-Ежедневное обслуживание\nУДОБСТВА В НОМЕРЕ:\n" +
                "-Свободный доступ Wi-fi\n-Ванная комната с душем\n-Кондиционер и отопление\n-Спутниковое ТВ\n-Фен для сушки волос\n-Телефон с городской связью\n-Сейф\n-Халат и тапочки" +
                "\n-Косметические принадлежности\n-Холодильник",Photo_2));
        HR.add(new Hotel_Room(3,R.drawable.junior_suite,"«ДЖУНИОР СЮИТ» ВЫСШЕЙ КАТЕГОРИИ \n Одна двуспальная кровать и диван \n Максимум 4 человека","от 6700 руб/сутки", "О НОМЕРЕ:\n" +
                "-Одна двуспальная кровать и диван\n-Максимум 4 человека\n-Размер комнаты:36 м2\n-Ежедневное обслуживание\nУДОБСТВА В НОМЕРЕ:\n" +
                "-Двуспальная кровать размера\"queen-size\"\n-Гостевая зона с двуспальным раскладным диваном\n-Капсульная кофемашина\n-Свободный доступ Wi-fi\n-Ванная комната с душем и ванной\n-Кондиционер и отопление" +
                "-Спутниковое ТВ\n-Фен для сушки волос\n-Телефон с городской связью\n-Сейф  -Халат и тапочки  -Холодильник\n-Косметические принадлежности",Photo_3));
        HR.add(new Hotel_Room(4,R.drawable.lux,"«ЛЮКС» ВЫСШЕЙ КАТЕГОРИИ \n 2 комнаты и джакузи \n Максимум 2 человека","от 8800 руб/сутки","О НОМЕРЕ:\n" +
                "-2 комнаты и джакузи\n-Максимум 2 человека\n-Размер комнаты:50 м2\n-Ежедневное обслуживание\nУДОБСТВА В НОМЕРЕ:\n" +
                "-Двуспальная кровать размера\"king-size\"\n-Балкон с видом на Садовую улицу\n-Капсульная кофемашина\n-Свободный доступ Wi-fi\n-Ванная комната с джакузи\n-Кондиционер и отопление\n" +
                "-Спутниковое ТВ\n-Фен для сушки волос\n-Телефон с городской связью\n-Сейф  -Халат и тапочки  -Холодильник\n-Косметические принадлежности\n",Photo_4));
        Hotel_Room_Adapter Adapter = new Hotel_Room_Adapter(HR, this);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    @Override
    public void OnClicked(String full_description, ArrayList<Integer>Photo) {
        Full_Hotel_Room_fragment Fragment = new Full_Hotel_Room_fragment();
        Bundle bundle = new Bundle();
        bundle.putString("Full",full_description);
        bundle.putIntegerArrayList("photo", Photo);
        Fragment.setArguments(bundle);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fl_content, Fragment);
        transaction.commit();
    }

    @Override
    public void OnClicked(String url) {

    }
}
