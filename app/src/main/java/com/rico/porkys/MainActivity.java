package com.rico.porkys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.rico.porkys.central.firstFragment;
import com.rico.porkys.interfaz.realization;

public class MainActivity extends AppCompatActivity implements realization, firstFragment.OnFragmentInteractionListener {
    Fragment fragmentFirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentFirst = new firstFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorActivity, fragmentFirst).commit();
    }


    @Override
    public void reservarMesa() {
        Toast.makeText(getApplicationContext(),"Su solicitud de reserva de mesa aun sigue en espera",Toast.LENGTH_SHORT).show();
    }
}