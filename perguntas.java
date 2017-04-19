package com.example.gabi2.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class perguntas extends AppCompatActivity implements View.OnClickListener {

    private Button   enviar;
    private EditText resposta1;
    private EditText resposta2;
    private EditText resposta3;
    private EditText resposta4;
    private EditText resposta5;
    private EditText resposta6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);

        //enviar para outra tela
        enviar = (Button) findViewById(R.id.enviar);
        enviar.setOnClickListener(this);

        //respostas
        resposta1 = (EditText)findViewById(R.id.resposta1);
        resposta2 = (EditText)findViewById(R.id.resposta2);
        resposta3 = (EditText)findViewById(R.id.resposta3);
        resposta4 = (EditText)findViewById(R.id.resposta4);
        resposta5 = (EditText)findViewById(R.id.resposta5);
        resposta6 = (EditText)findViewById(R.id.resposta6);
    }

    //enviar para outra tela
    public void onClick(View v) {

        String res1 = "Mesma para todas as classes";
        String res2 = "A variável não pode assumir outro valor";
        String res3 = "new Filha();";
        String res4 = "Operação a ser executada";
        String res5 = "Para mostrar uma mensagem";
        String res6 = "Para exibir a mensagem na tela";
        String oi = "oi";
        String ola = "ola";
        String d = new String("abc");


        switch(v.getId()){
            //case R.id.enviar:
            //    Intent it = new Intent(perguntas.this, resultado.class);
             //   startActivity(it);
             //   this.Verifica();
             //   break;

            case R.id.enviar:

                //pergunta 1
                if (d.equals(resposta1)){
                    Toast.makeText(this, "Certo", Toast.LENGTH_SHORT).show();
                   // System.out.println("Legal");
                }else{
                    Toast.makeText(this, "Errado", Toast.LENGTH_SHORT).show();
                }

                //pergunta2
                if (res2.toString().equals(resposta2)){
                    //Toast.makeText(this, "Certo", Toast.LENGTH_SHORT).show();
                    System.out.println("Legal");
                }else{
                    Toast.makeText(this, "Errado", Toast.LENGTH_SHORT).show();
                }

                //pergunta3

                if (res3.equals(resposta3)){
                    //Toast.makeText(this, "Certo", Toast.LENGTH_SHORT).show();
                    System.out.println("Legal");
                }else{
                    Toast.makeText(this, "Errado", Toast.LENGTH_SHORT).show();
                }

                //pergunta4

                if (res4.equals(resposta4)){
                    //Toast.makeText(this, "Certo", Toast.LENGTH_SHORT).show();
                    System.out.println("Legal");
                }else{
                    Toast.makeText(this, "Errado", Toast.LENGTH_SHORT).show();
                }

                //pergunta5

                if (res5.equals(resposta5)){
                    //Toast.makeText(this, "Certo", Toast.LENGTH_SHORT).show();
                    System.out.println("Legal");
                }else{
                    Toast.makeText(this, "Errado", Toast.LENGTH_SHORT).show();
                }

                //pergunta6

                if (res6.equals(resposta6)){
                    //Toast.makeText(this, "Certo", Toast.LENGTH_SHORT).show();
                    System.out.println("Legal");
                }else{
                    Toast.makeText(this, "Errado", Toast.LENGTH_SHORT).show();
                }

        }

    };

    // verificar se o campo é nulo
    public void Verifica() {
        //1

        if (resposta1.getText().toString().trim().isEmpty()) {
            resposta1.setError("Preencha esse campo");
        } else {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        }
        //2

        if (resposta2.getText().toString().trim().isEmpty()) {
            resposta2.setError("Preencha esse campo");
        } else {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        }
        //3

        if (resposta3.getText().toString().trim().isEmpty()) {
            resposta3.setError("Preencha esse campo");
        } else {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        }
        //4

        if (resposta4.getText().toString().trim().isEmpty()) {
            resposta4.setError("Preencha esse campo");
        } else {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        }
        //5

        if (resposta5.getText().toString().trim().isEmpty()) {
            resposta5.setError("Preencha esse campo");
        } else {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        }
        //6

        if (resposta6.getText().toString().trim().isEmpty()) {
            resposta6.setError("Preencha esse campo");
        } else {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        }


    }
}
