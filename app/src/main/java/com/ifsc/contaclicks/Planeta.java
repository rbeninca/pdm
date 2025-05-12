package com.ifsc.contaclicks;

import android.graphics.Bitmap;

public class Planeta {
    String nome;
    //Bitmap Imagem;
    Integer imagem; //São recursos da pasta drawable R.drawable.nome

    public Planeta(String nome, Integer imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }
}

