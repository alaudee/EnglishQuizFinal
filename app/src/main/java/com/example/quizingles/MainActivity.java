package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreOne = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirOp1(View view) {
        scoreOne++;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle infos = new Bundle();

        infos.putInt("chave_pontos", scoreOne);

        intentEnvia.putExtras(infos);

        startActivity(intentEnvia);
    }

    public void abrirOp2(View view) {
        scoreOne = scoreOne + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle bundle = new Bundle();

        bundle.putInt("chave_pontos", scoreOne);

        intentEnvia.putExtras(bundle);

        startActivity(intentEnvia);
    }

    public void abrirOp3(View view) {
        scoreOne = scoreOne + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle bundle = new Bundle();

        bundle.putInt("chave_pontos", scoreOne);

        intentEnvia.putExtras(bundle);

        startActivity(intentEnvia);
    }

    public void abrirOp4(View view) {
        scoreOne = scoreOne + 0;
        Intent intentEnvia = new Intent(getApplicationContext(), PerguntaDoisActivity.class);
        Bundle bundle = new Bundle();

        bundle.putInt("chave_pontos", scoreOne);

        intentEnvia.putExtras(bundle);

        startActivity(intentEnvia);
    }
}
