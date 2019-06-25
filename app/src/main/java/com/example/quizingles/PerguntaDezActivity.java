package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaDezActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_dez_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.tenpx);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();
        int result = infos.getInt("chave_pontos_nove");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoDez(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreTen = infos.getInt("chave_pontos_nove");

        scoreTen++;
        Intent intentEnvia = new Intent(getApplicationContext(), FinalActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dez", scoreTen);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoDez(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreTen = infos.getInt("chave_pontos_nove");

        scoreTen = scoreTen + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), FinalActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dez", scoreTen);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoDez(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreTen = infos.getInt("chave_pontos_nove");

        scoreTen = scoreTen + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), FinalActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dez", scoreTen);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoDez(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreTen = infos.getInt("chave_pontos_nove");

        scoreTen = scoreTen + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), FinalActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dez", scoreTen);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }
}
