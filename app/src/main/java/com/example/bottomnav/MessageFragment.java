package com.example.bottomnav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MessageFragment extends Fragment {

    String contactList[] = {
            "Bajig",
            "Allan",
            "Ryan",
            "Ace",
            "Arjay",
            "Aly",
            "Prince",
            "Renz",
            "Clarisse",
            "Aliazer"
    };

    int people[] = {
            R.drawable.bajig,
            R.drawable.allan,
            R.drawable.ryan,
            R.drawable.ace,
            R.drawable.arjay,
            R.drawable.aly,
            R.drawable.prince,
            R.drawable.renz,
            R.drawable.clarisse,
            R.drawable.aliazer,
    };

    public MessageFragment() {
        // Required empty public constructor
    }

    public static MessageFragment newInstance() {
        return new MessageFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        ListView data_list = view.findViewById(R.id.DataList);
        customAdapter base = new customAdapter(contactList, people, getActivity());
        data_list.setAdapter(base);
        return view;
    }
}
