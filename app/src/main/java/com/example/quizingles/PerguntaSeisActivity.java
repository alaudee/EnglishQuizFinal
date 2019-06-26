package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaSeisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_seis_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.sixpx);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();
        int result = infos.getInt("chave_pontos_cinco");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix = scoreSix + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeisActivity.this, "NOT NOW", Toast.LENGTH_SHORT).show();
    }

    public void opcaoDoisQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix = scoreSix + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeisActivity.this, "TOO BAD", Toast.LENGTH_SHORT).show();
    }

    public void opcaoTresQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeisActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
    }

    public void opcaoQuatroQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix = scoreSix + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaSeisActivity.this, "NO", Toast.LENGTH_SHORT).show();
    }
}
