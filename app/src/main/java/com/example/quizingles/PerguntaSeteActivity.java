package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerguntaSeteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_sete_layout);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int result = novoInfos.getInt("chave_pontos_seis");

        if (novoInfos != null){
            Toast.makeText(PerguntaSeteActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }

    public void opcaoUmQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven = scoreSeven + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven = scoreSeven + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoSete(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreSeven = novoInfos.getInt("chave_pontos_seis");

        scoreSeven = scoreSeven + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaOitoActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_sete", scoreSeven);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }
}
