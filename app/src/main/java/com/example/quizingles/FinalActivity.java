package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_layout);

        getSupportActionBar().setTitle("Quiz English");

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();
        int result = novoInfos.getInt("chave_pontos_dez");
        TextView textView = (TextView)findViewById(R.id.txtResultado);
        textView.setText(""+result);


        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        TextView textUsuario = (TextView)findViewById(R.id.txtUsuario);
        textUsuario.setText(""+usuario);
    }

    public void voltarAoLogin(View view) {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }
}
