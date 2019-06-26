package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaQuatroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_quatro_layout);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.fourpx);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();
        int result = infos.getInt("chave_pontos_tres");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour = scoreFour + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaQuatroActivity.this, "INCORRECT", Toast.LENGTH_SHORT).show();
    }

    public void opcaoDoisQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaQuatroActivity.this, "YOU ROCK", Toast.LENGTH_SHORT).show();
    }

    public void opcaoTresQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour = scoreFour + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaQuatroActivity.this, "NO...", Toast.LENGTH_SHORT).show();
    }

    public void opcaoQuatroQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour = scoreFour + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaQuatroActivity.this, "YOU´RE WRONG", Toast.LENGTH_SHORT).show();
    }
}
