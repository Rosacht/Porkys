package com.rico.porkys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.rico.porkys.central.Reservade;
import com.rico.porkys.central.menuFragment;

public class MainActivity extends AppCompatActivity  {
    Button reservaMesas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reservaMesas=(Button)findViewById(R.id.button1);
        reservaMesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), menuFragment.class);
                startActivity(intent);

            }
        });
    }

}