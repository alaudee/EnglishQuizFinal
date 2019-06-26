package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PerguntaDoisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_dois_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.twopx);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();
        int result = infos.getInt("chave_pontos");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");


    }


    public void opcaoUmQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();
        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo = scoreTwo + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        intentEnvia.putExtras(novoInfos);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaDoisActivity.this, "ALMOST", Toast.LENGTH_SHORT).show();
    }

    public void opcaoDoisQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();

        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo = scoreTwo + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        intentEnvia.putExtras(novoInfos);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaDoisActivity.this, "YOU MISS", Toast.LENGTH_SHORT).show();
    }

    public void opcaoTresQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();

        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        intentEnvia.putExtras(novoInfos);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaDoisActivity.this, "YOU ROCK", Toast.LENGTH_SHORT).show();
    }

    public void opcaoQuatroQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();

        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo = scoreTwo + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        intentEnvia.putExtras(novoInfos);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaDoisActivity.this, "FAILED", Toast.LENGTH_SHORT).show();
    }
}
