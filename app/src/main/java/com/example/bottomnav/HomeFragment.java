package com.example.bottomnav;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button button;
    public CardView telegram, discord, facebook;
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    // BUTTON
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        button = view.findViewById(R.id.button_home); // Assuming your button has the id 'button_home'

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity2();
            }
        });

        telegram = view.findViewById(R.id.telegram);
        telegram.setOnClickListener(this::onClick);

        discord = view.findViewById(R.id.discord);
        discord.setOnClickListener(this::onClick);

        facebook = view.findViewById(R.id.facebook);
        facebook.setOnClickListener(this::onClick);

        return view;
    }

    private void openNextActivity2() {
        Intent intent = new Intent(getActivity(), Activity2.class);
        startActivity(intent);
    }

    public void onClick(View view){
        Intent i;

        if(view.getId() == R.id.telegram){
            i = new Intent(getActivity(),Telegram.class);
            startActivity(i);
        }else if(view.getId() == R.id.discord){
            i = new Intent(getActivity(),Discord.class);
            startActivity(i);
        }else if(view.getId() == R.id.facebook){
            i = new Intent(getActivity(),Facebook.class);
            startActivity(i);
        }else if(view.getId() == R.id.instagram){
            i = new Intent(getActivity(),Instagram.class);
            startActivity(i);
        }else if(view.getId() == R.id.pinterest){
            i = new Intent(getActivity(),Pinterest.class);
            startActivity(i);
        }else if(view.getId() == R.id.youtube){
            i = new Intent(getActivity(),Youtube.class);
            startActivity(i);
        }
    }
}