package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerguntaCincoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_cinco_layout);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int result = novoInfos.getInt("chave_pontos_quatro");

        if (novoInfos != null){
            Toast.makeText(PerguntaCincoActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }

    public void opcaoUmQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive = scoreFive + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive = scoreFive + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive = scoreFive + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }
}
