package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerguntaQuatroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_quatro_layout);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int result = infos.getInt("chave_pontos_tres");

        if (infos != null){
            Toast.makeText(PerguntaQuatroActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }

    public void opcaoUmQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour = scoreFour + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour = scoreFour + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoQuatro(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreFour = infos.getInt("chave_pontos_tres");

        scoreFour = scoreFour + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaCincoActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_quatro", scoreFour);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }
}
