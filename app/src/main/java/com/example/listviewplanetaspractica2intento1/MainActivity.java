package com.example.listviewplanetaspractica2intento1;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};
    private String[] descripciones = {"Planeta más cercano al Sol.", "Segundo planeta del Sistema Solar.", "Nuestro hogar.", "Conocido por sus montañas y volcanes.", "El mayor planeta del Sistema Solar.", "Famoso por sus anillos.", "Planeta helado.", "El más distante del Sol."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planetas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String planetaSeleccionado = planetas[position];
                String descripcionSeleccionada = descripciones[position];
                String mensaje = planetaSeleccionado + ": " + descripcionSeleccionada;
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

