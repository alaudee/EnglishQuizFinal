package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerguntaCincoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_cinco_layout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.fivepx);

        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();
        int result = novoInfos.getInt("chave_pontos_quatro");

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
    }

    public void opcaoUmQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaCincoActivity.this, "THAT´S RIGHT", Toast.LENGTH_SHORT).show();
    }

    public void opcaoDoisQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive = scoreFive + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaCincoActivity.this, "NOT AT THIS TIME", Toast.LENGTH_SHORT).show();
    }

    public void opcaoTresQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive = scoreFive + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaCincoActivity.this, "YOU FAILED", Toast.LENGTH_SHORT).show();
    }

    public void opcaoQuatroQuestaoCinco(View view) {
        Intent intentRecebe = getIntent();

        Bundle novoInfos = intentRecebe.getExtras();

        int scoreFive = novoInfos.getInt("chave_pontos_quatro");

        scoreFive = scoreFive + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaSeisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos_cinco", scoreFive);

        Bundle infoNome = intentRecebe.getExtras();
        String usuario = infoNome.getString("chave_nome");
        intentEnvia.putExtras(infoNome);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);

        Toast.makeText(PerguntaCincoActivity.this, "WRONG", Toast.LENGTH_SHORT).show();
    }
}
