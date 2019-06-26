package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaNoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_nove_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ninepx);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();
        int result = novoInfos.getInt("chave_pontos_oito");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine = scoreNine + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaNoveActivity.this, "TOO BAD", Toast.LENGTH_SHORT).show();
    }

    public void opcaoDoisQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaNoveActivity.this, "GOT IT", Toast.LENGTH_SHORT).show();
    }

    public void opcaoTresQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine = scoreNine + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaNoveActivity.this, "WRONG", Toast.LENGTH_SHORT).show();
    }

    public void opcaoQuatroQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine = scoreNine + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaNoveActivity.this, "YOU FAILED", Toast.LENGTH_SHORT).show();
    }
}
