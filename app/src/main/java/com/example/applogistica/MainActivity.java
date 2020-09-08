package com.example.applogistica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextEstado;
    private EditText mEditTextValor;
    private TextView mTextViewPorcentagem;
    private TextView mTextViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditTextEstado = findViewById(R.id.editTextEstado);
        mEditTextValor = findViewById(R.id.editTextValor);
        mTextViewPorcentagem = findViewById(R.id.textViewPorcentagem);
        mTextViewTotal = findViewById(R.id.editTextTotal);

    }

    public void calcular(View view) {
        //recuperamos o estado digitado
        String estado = (mEditTextEstado.getText().toString()).toUpperCase();
        System.out.println(estado);
        //recuperamos o valor digitado
        String valorString = mEditTextValor.getText().toString();
        //Convertemos o ValorString para tipo Float
        float valor = Float.parseFloat(valorString);
        //Inicaializamos uma variavel float com o valor da porcentagem
        float porcentagem = 0;
        //Verrifica qual estado foi digitado para definir o valor da porcentagem
        switch (estado) {
            case "DF":
                porcentagem = 17;
                break;
            case "RO":
                porcentagem = 16;
                break;
            case "SP":
                porcentagem = 10;
                break;
            case "AC":
                porcentagem = 13;
                break;
            case "AL":
                porcentagem = 15;
                break;
            case "AP":
                porcentagem = 16;
                break;
            case "AM":
                porcentagem = 9;
                break;
            case "BA":
                porcentagem = 18;
                break;
            case "CE":
                porcentagem = 20;
                break;
            case "ES":
                porcentagem = 30;
                break;
            case "GO":
                porcentagem = 25;
                break;
            case "MA":
                porcentagem = 27;
                break;
            case "MT":
                porcentagem = 8;
                break;
            case "MS":
                porcentagem = 7;
                break;
            case "MG":
                porcentagem = 14;
                break;
            case "PA":
                porcentagem = 12;
                break;
            case "PB":
                porcentagem = 12;
                break;
            case "PR":
                porcentagem = 5;
                break;
            case "PE":
                porcentagem = 17;
                break;
            case "PI":
                porcentagem = 3;
                break;
            case "RJ":
                porcentagem = 32;
                break;
            case "RN":
                porcentagem = 16;
                break;
            case "RS":
                porcentagem = 17;
                break;
            case "RR":
                porcentagem = 21;
                break;
            case "SC":
                porcentagem = 17;
                break;
            case "SE":
                porcentagem = 15;
                break;
            case "TO":
                porcentagem = 25;
                break;
        }
        //Declara uma nova variável float com o valor do cálculo
        float total;
        total = valor + (valor * porcentagem / 100);
        //Exibi o resultado no TextView para o usuario
        mTextViewPorcentagem.setText(String.valueOf(porcentagem) + "%");
        mTextViewTotal.setText(String.format("R$ %,2f, total"));

    }
}