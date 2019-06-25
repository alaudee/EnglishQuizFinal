package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerguntaOitoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_oito_layout);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int result = infos.getInt("chave_pontos_sete");

        if (infos != null){
            Toast.makeText(PerguntaOitoActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }

    public void opcaoUmQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight = scoreEight + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight = scoreEight + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight = scoreEight + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoOito(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreEight = infos.getInt("chave_pontos_sete");

        scoreEight++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaNoveActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_oito", scoreEight);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }
}
