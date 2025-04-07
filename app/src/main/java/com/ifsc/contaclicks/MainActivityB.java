package com.ifsc.contaclicks;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        Bundle bundle=getIntent().getExtras();
        Double peso= bundle.getDouble("peso");
        Double altura= bundle.getDouble("altura");
        Double imc=(peso/(altura*altura));

        TextView tvIMC =findViewById(R.id.textViewIMC);
        TextView tvaltura =findViewById(R.id.tvAlturaResult);
        TextView tvpeso =findViewById(R.id.tvpesoResult);
        ImageView imageView=findViewById(R.id.imageView2);
/*
IMC abaixo de 18,5: Abaixo do peso
IMC entre 18,5 e 24,9: Peso normal
IMC entre 25 e 29,9: Sobrepeso
IMC entre 30 e 34,9: Obesidade grau 1
IMC entre 35 e 39,9: Obesidade grau 2
IMC acima de 40: Obesidade grau 3
 */
        if (imc<18.5){
           imageView.setImageResource(R.drawable.abaixopeso);
        }else{
            if( imc<25.9){
                imageView.setImageResource(R.drawable.normal);
            }
        }




    }
}