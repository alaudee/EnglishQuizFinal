package com.example.quizingles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void comecarJogo(View view) {

        EditText editText = (EditText)findViewById(R.id.edtNomeUsuario);
        String nome = editText.getText().toString();

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle infoNome = new Bundle();

        infoNome.putString("chave_nome", nome);

        intent.putExtras(infoNome);

        startActivity(intent);
    }
}
