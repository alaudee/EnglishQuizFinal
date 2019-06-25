package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerguntaSeisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_seis_layout);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int result = infos.getInt("chave_pontos_cinco");

        if (infos != null){
            Toast.makeText(PerguntaSeisActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }

    public void opcaoUmQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix = scoreSix + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix = scoreSix + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoSeis(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreSix = infos.getInt("chave_pontos_cinco");

        scoreSix = scoreSix + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeteActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_seis", scoreSix);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }
}
