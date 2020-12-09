package com.rico.porkys.central;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;


import com.rico.porkys.R;

public class menuFragment extends AppCompatActivity   implements  View.OnClickListener{
private CardView cardReservar;
        //, cardComentarios, cardAjustes, cardInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fragment);

        cardReservar=findViewById(R.id.cardReservar);


        cardReservar.setOnClickListener(this::onClick);


        }

    @Override
    public void onClick(View v) {
    Intent i;
    switch (v.getId()){
        case R.id.cardReservar: i = new Intent(this, Reservade.class);startActivity(i);
        break;
        default:break;

    }
}
}