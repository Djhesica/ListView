package com.example.inter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // ListView listView;
    ListView listComponentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listComponentes = findViewById(R.id.list_view);

        final ArrayList<String> lista_componentes = new ArrayList<>();
        lista_componentes.add("Botão");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, lista_componentes);

        listComponentes.setAdapter(adapter);

        listComponentes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, lista_componentes.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, ComponentView.class);

                intent.putExtra("Componente", lista_componentes.get(position));
                startActivity(intent);

            }
        });

    }
}
