package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaSeteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_sete_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.sevenpx);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();
        int result = novoInfos.getInt("chave_pontos_seis");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven = scoreSeven + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeteActivity.this, "WRONG", Toast.LENGTH_SHORT).show();
    }

    public void opcaoDoisQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeteActivity.this, "RIGHT", Toast.LENGTH_SHORT).show();
    }

    public void opcaoTresQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven = scoreSeven + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeteActivity.this, "NOT AT THIS TIME", Toast.LENGTH_SHORT).show();
    }

    public void opcaoQuatroQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven = scoreSeven + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeteActivity.this, "ALMOST", Toast.LENGTH_SHORT).show();
    }
}
