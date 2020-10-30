package com.appmiguel.appformulario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tvNombre;
    private DatePicker tvDate;
    private EditText tvTelefono;
    private EditText tvEmail;
    private EditText tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle parametros = getIntent().getExtras();
        EditText nombre = (EditText)findViewById(R.id.tvNombre);
        DatePicker nacimiento = (DatePicker)findViewById(R.id.tvDate);
        EditText telefono = (EditText)findViewById(R.id.tvTelefono);
        EditText email = (EditText)findViewById(R.id.tvEmail);
        EditText descripcion = (EditText)findViewById(R.id.tvDescripcion);
        AppCompatButton enviar = (AppCompatButton)findViewById(R.id.btnEnviar);


        enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nombre2 = nombre.getText().toString();
                String nacimiento2 = nacimiento.getMatrix().toString();
                String telefono2 = telefono.getText().toString();
                String email2 = email.getText().toString();
                String descripcion2 = descripcion.getText().toString();

                Intent i = new Intent(MainActivity.this, ConfirmarDatos.class);

                i.putExtra("nombre2", nombre2);
                i.putExtra("nacimiento2", nacimiento2);
                i.putExtra("telefono2", telefono2);
                i.putExtra("email2", email2);
                i.putExtra("descripcion2", descripcion2);

                startActivity(i);
                finish();
            }

        });

    }

}
