package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PerguntaDoisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta_dois_layout);

        Intent intentRecebe = getIntent();

        Bundle infos = intentRecebe.getExtras();

        int result = infos.getInt("chave_pontos");

        if (infos != null){
            Toast.makeText(PerguntaDoisActivity.this, "Seus acertos = "+result, Toast.LENGTH_SHORT).show();
        }
    }


    public void opcaoUmQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();

        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo = scoreTwo + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoDoisQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();

        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo = scoreTwo + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoTresQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();

        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }

    public void opcaoQuatroQuestaoDois(View view) {
        Intent intent = getIntent();

        Bundle infos = intent.getExtras();

        int scoreTwo = infos.getInt("chave_pontos");

        scoreTwo = scoreTwo + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaTresActivity.class);
        Bundle novoInfos = new Bundle();

        novoInfos.putInt("chave_pontos_dois", scoreTwo);

        intentEnvia.putExtras(novoInfos);

        startActivity(intentEnvia);
    }
}
