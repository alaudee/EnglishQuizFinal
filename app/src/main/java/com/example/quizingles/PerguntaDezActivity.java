package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerguntaDezActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_dez_layout);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int result = infos.getInt("chave_pontos_nove");

        if (infos != null){
            Toast.makeText(PerguntaDezActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }

    public void opcaoUmQuestaoDez(View view) {
        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int scoreTen = infos.getInt("chave_pontos_nove");

        scoreTen++;
        Intent intentEnvia = new Intent(getApplicationContext(), FinalActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dez", scoreTen);

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

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }
}
