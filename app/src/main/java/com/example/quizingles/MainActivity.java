package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreOne = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentRecebe = getIntent();

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.onepx);
    }

    public void opcaoUmQuestaoUm(View view) {
        Intent intent = getIntent();

        scoreOne++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos", scoreOne);

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        intentEnvia.putExtras(infos);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoUm(View view) {
        Intent intent = getIntent();

        scoreOne = scoreOne + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle bundle = new Bundle();

        bundle.putInt("chave_pontos", scoreOne);

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        intentEnvia.putExtras(bundle);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoUm(View view) {
        Intent intent = getIntent();

        scoreOne = scoreOne + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle bundle = new Bundle();

        bundle.putInt("chave_pontos", scoreOne);

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        intentEnvia.putExtras(bundle);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoUm(View view) {
        Intent intent = getIntent();

        scoreOne = scoreOne + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle bundle = new Bundle();

        Bundle infoNome = intent.getExtras();
        String usuario = infoNome.getString("chave_nome");

        bundle.putInt("chave_pontos", scoreOne);

        intentEnvia.putExtras(bundle);
        intentEnvia.putExtras(infoNome);

        startActivity(intentEnvia);
    }
}
