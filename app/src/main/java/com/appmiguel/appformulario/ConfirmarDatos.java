package com.appmiguel.appformulario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView datNombre, datNacimiento, datTelefono, datEmail, datDescripcion;
    AppCompatButton btnConfirmar = findViewById(R.id.btnConfirmar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        datNombre = (TextView) findViewById(R.id.tvNombre);
        datNacimiento = (TextView) findViewById(R.id.tvNacimiento);
        datTelefono = (TextView) findViewById(R.id.tvTelefono);
        datEmail = (TextView) findViewById(R.id.tvEmail);
        datDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mostrar();
    }
        private void mostrar() {
            Bundle datos = this.getIntent().getExtras();
            String nombre = datos.getString("nombre2");
            String nacimiento = datos.getString("nacimeiento2");
            String telefono = datos.getString("telefono2");
            String email = datos.getString("email2");
            String descripcion = datos.getString("descripcion2");

            datNombre.setText(nombre);
            datNacimiento.setText(nacimiento);
            datTelefono.setText(telefono);
            datEmail.setText(email);
            datDescripcion.setText(descripcion);

        }

}
