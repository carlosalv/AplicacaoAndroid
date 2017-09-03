package br.com.app.cadastrodealunos;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

class MainActivity extends AppCompatActivity {

        private EditText edtview;
        private Button btnadiconar;
        private ListView lstview;
        private ArrayAdapter<String> adapter;
        private ArrayList<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastro);

        edtview = (EditText) findViewById(R.id.edtView);
        btnadiconar = (Button) findViewById(R.id.btnAdicionar);
        lstview = (ListView) findViewById(R.id.lstView);

        lista = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, lista);
        lstview.setAdapter(adapter);


       btnadiconar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              String nome = edtview.getText().toString();

               lista.add(nome);
               adapter.notifyDataSetChanged();
           }
       });




    }
}