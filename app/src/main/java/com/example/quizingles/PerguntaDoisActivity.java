package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PerguntaDoisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_dois_layout);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        if (infos != null){
            int resultado = infos.getInt("chave_pontos");

            Toast.makeText(PerguntaDoisActivity.this, "Seus acertos = "+resultado, Toast.LENGTH_SHORT).show();
        }
    }
}
