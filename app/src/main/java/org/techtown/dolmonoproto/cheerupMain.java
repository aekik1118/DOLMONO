package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by aekik on 2017-06-26.
 */

public class cheerupMain extends Fragment{
    View v;
    String tmp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.cheerup_main_layout, container, false);
        Button b6 = (Button)v.findViewById(R.id.button6);
        final EditText et = (EditText)v.findViewById(R.id.editText);


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = et.getText().toString();

                Intent intent = new Intent (getActivity(),cheerupShow.class);
                intent.putExtra("text",tmp);
                startActivity(intent);
            }
        });




        return v;
    }
}