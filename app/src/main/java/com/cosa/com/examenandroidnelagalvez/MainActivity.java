package com.cosa.com.examenandroidnelagalvez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements IControlador{

    //Botones
    Button botonSalir;
    Button botonAlta;
    Button botonBaja;
    Button botonListado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventosFormulario();
    }

    private void eventosFormulario() {
        botonAlta = (Button)findViewById(R.id.botonMainAlta);
        botonBaja = (Button)findViewById(R.id.botonMainBaja);
        botonListado = (Button)findViewById(R.id.botonMainListado);
        botonSalir = (Button)findViewById(R.id.botonMainSalir);

        botonAlta.setOnClickListener(this);
        botonBaja.setOnClickListener(this);
        botonListado.setOnClickListener(this);
        botonSalir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.botonMainAlta:

                break;
            case R.id.botonMainBaja:

                break;
            case R.id.botonMainListado:

                break;
            case R.id.botonMainSalir:

                break;
        }
    }
}
