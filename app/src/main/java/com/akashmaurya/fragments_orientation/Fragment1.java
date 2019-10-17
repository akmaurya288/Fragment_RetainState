package com.akashmaurya.fragments_orientation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    int[] list = {10,2,5,7,9,3};
    int count = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tv= view.findViewById(R.id.hello);
        final TextView countTV = view.findViewById(R.id.counter);
        countTV.setText(count+"");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countTV.setText(++count + "");
            }
        });
    }
}
