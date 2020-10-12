package com.example.calculadora_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroN = "";
    private String segundoN = "";
    private String operacao = "";
    private String divisao = "0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tv_display);
    }

    public void onClickBotao0(View v) {
        atualizarDisplay( "0");
        atualizarNDigitado( "0");

    }
    public void onClickBotao1(View v) {
        atualizarNDigitado("1");
        atualizarDisplay( "1");
    }
    public void onClickBotao2(View v) {
        atualizarNDigitado("2");
        atualizarDisplay( "2");
    }
    public void onClickBotao3(View v) {
        atualizarNDigitado("3");
        atualizarDisplay( "3");
    }
    public void onClickBotao4(View v) {
        atualizarNDigitado("4");
        atualizarDisplay( "4");
    }
    public void onClickBotao5(View v) {
        atualizarNDigitado("5");
        atualizarDisplay( "5");
    }
    public void onClickBotao6(View v) {
        atualizarNDigitado("6");
        atualizarDisplay( "6");
    }
    public void onClickBotao7(View v) {
        atualizarNDigitado("7");
        atualizarDisplay( "7");
    }
    public void onClickBotao8(View v) {
        atualizarNDigitado("8");
        atualizarDisplay( "8");
    }
    public void onClickBotao9(View v) {
        atualizarNDigitado("9");
        atualizarDisplay( "9");
    }

    public void onClickAdicao(View v) {
        operacao = "+";
        atualizarDisplay( "+" );
    }
    public void onClickSubtracao(View v) {
        operacao = "-";
        atualizarDisplay( "-" );
    }
    public void onClickMultiplicacao(View v) {
        operacao = "x";
        atualizarDisplay( "x" );
    }
    public void onClickDivisao(View v) {
        operacao = "/";
        atualizarDisplay( "/" );

        }
        
    public void onClickIgual(View v) {
        if (!primeiroN.isEmpty() && !segundoN.isEmpty()) {

            int numero1 = Integer.parseInt(primeiroN);
            int numero2 = Integer.parseInt(segundoN);
            if (operacao.equals("+")) {
                int resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("-")) {
                int resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }

            if (operacao.equals("x")) {
                int resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }

            if (operacao.equals("/")) {
                int resultado = numero1 / numero2;
                display.setText(String.valueOf(resultado));

            }
        }else {
            Toast.makeText(MainActivity.this, "Nenhuma operação foi selecionada !" , Toast.LENGTH_LONG).show();
        }
    }


    private void atualizarDisplay(String texto) {
        String textodisplay = display.getText().toString();
        textodisplay = textodisplay + texto;
        display.setText(textodisplay);
    }

    private void atualizarNDigitado(String numero){
        if(operacao.isEmpty()) {
            primeiroN = primeiroN + numero;

        }else {
                segundoN = segundoN + numero;
            }
    }

}