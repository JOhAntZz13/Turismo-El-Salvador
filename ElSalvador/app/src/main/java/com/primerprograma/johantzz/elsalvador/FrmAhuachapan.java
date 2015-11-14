package com.primerprograma.johantzz.elsalvador;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by JOhAntZz on 11/11/2015.
 */
public class FrmAhuachapan extends Fragment {
        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.frm_ahuachapan,container,false);

        RadioButton rb1 = (RadioButton)rootView.findViewById(R.id.rb1);
        Button btn1=(Button)rootView.findViewById(R.id.btn1);

        return rootView;
    }
}
