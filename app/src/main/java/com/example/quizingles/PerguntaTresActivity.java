package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaTresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_tres_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.threepx);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();
        int result = novoInfos.getInt("chave_pontos_dois");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoTres(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreThree = novoInfos.getInt("chave_pontos_dois");

        scoreThree = scoreThree + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaQuatroActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_tres", scoreThree);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoTres(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreThree = novoInfos.getInt("chave_pontos_dois");

        scoreThree = scoreThree + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaQuatroActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_tres", scoreThree);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoTres(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreThree = novoInfos.getInt("chave_pontos_dois");

        scoreThree = scoreThree + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaQuatroActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_tres", scoreThree);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoTres(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreThree = novoInfos.getInt("chave_pontos_dois");

        scoreThree++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaQuatroActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_tres", scoreThree);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }
}
