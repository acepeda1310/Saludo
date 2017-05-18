package com.example.adrian.saludo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nombre extends AppCompatActivity implements View.OnClickListener{
    TextView saludo;
    EditText nombre;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre);

        saludo=(TextView)findViewById(R.id.saludo);
        nombre=(EditText)findViewById(R.id.nombre);
        go=(Button)findViewById(R.id.go);

        go.setOnClickListener(this);

    }

    public void onClick(View v){
        Intent intent=new Intent(this, Resultado.class);
        intent.putExtra("nombre", nombre.getText().toString());

        startActivity(intent);
    }
}
