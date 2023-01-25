package com.bo.miedadcanina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bo.miedadcanina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
/*
        setContentView(R.layout.activity_main);
*/
        EditText ageEdit = binding.ageEdit;
        EditText edadTexto = findViewById(R.id.age_edit);
/*
        TextView resultado = findViewById(R.id.resultado);
*/
        TextView resultado = binding.resultado;
/*
        Button boton_calcular =findViewById(R.id.btn_calcular); dsdsdsd
*/
        Button boton_calcular =binding.btnCalcular;


        boton_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edad = edadTexto.getText().toString();
                if(!edad.isEmpty()) {
                    int edadEntero = Integer.parseInt(edad);
                    int calculo = edadEntero * 7;
                    String resultString = getString(R.string.result_format, calculo);
                    resultado.setText(resultString);
                }else {
                    Log.d("MainActivity", "Age field is empty");

                }
            }
        });

    }
}