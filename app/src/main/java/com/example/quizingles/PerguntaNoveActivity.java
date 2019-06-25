package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerguntaNoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_nove_layout);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int result = novoInfos.getInt("chave_pontos_oito");

        if (novoInfos != null){
            Toast.makeText(PerguntaNoveActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }

    public void opcaoUmQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine = scoreNine + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine = scoreNine + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoNove(View view){
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreNine = novoInfos.getInt("chave_pontos_oito");

        scoreNine = scoreNine + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDezActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_nove", scoreNine);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }
}
