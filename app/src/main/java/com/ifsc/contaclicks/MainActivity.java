package com.ifsc.contaclicks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int i=0;
    String [] nomes= new String[] {"Mercurio","Venus","Terra","Marte","Jupter","Saturno","Urano","Netuno"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recupera listview
        lv= findViewById(R.id.listview);

        //Adaptador
        ArrayAdapter<String> a=new ArrayAdapter(
                this,
                R.layout.item_lista,
                R.id.textView,
                nomes);

        lv.setAdapter(a);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i= new Intent(getApplicationContext(), PlanetaActivity.class);
                i.putExtra("nome",nomes[position]);

                startActivity(i);


            }
        });
    }
}