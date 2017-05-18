package com.example.adrian.saludo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView resultadoTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        resultadoTV=(TextView)findViewById(R.id.resultado);
        Bundle bundle=getIntent().getExtras();
        resultadoTV.setText(resultadoTV.getText()+" "+bundle.getString("nombre").toString());
    }

}
