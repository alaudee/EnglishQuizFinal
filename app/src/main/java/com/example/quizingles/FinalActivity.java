package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_layout);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int result = novoInfos.getInt("chave_pontos_dez");

        TextView textView = (TextView)findViewById(R.id.txtResultado);
        
    }

    public void voltarAoLogin(View view) {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }
}
