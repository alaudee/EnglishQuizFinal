package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaOitoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_oito_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.eightpx);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();
        int result = infos.getInt("chave_pontos_sete");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight = scoreEight + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaOitoActivity.this, "TOO BAD", Toast.LENGTH_SHORT).show();
    }

    public void opcaoDoisQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight = scoreEight + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaOitoActivity.this, "TOO BAD", Toast.LENGTH_SHORT).show();
    }

    public void opcaoTresQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight = scoreEight + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaOitoActivity.this, "WRONG", Toast.LENGTH_SHORT).show();
    }

    public void opcaoQuatroQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaOitoActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
    }
}
