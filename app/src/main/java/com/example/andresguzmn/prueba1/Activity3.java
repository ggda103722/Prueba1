package com.example.andresguzmn.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class Activity3 extends AppCompatActivity {
    ListView lv;
    TextView tv;
    String[] st=new String[]{"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "En construcción", Snackbar.LENGTH_LONG).setAction(ALARM_SERVICE, null).show();
            }
        });
        /*lv=(ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,st);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Posicion "+position,Toast.LENGTH_SHORT).show();
            }
        });*/
        tv=(TextView)findViewById(R.id.usuario);
        Intent intent=getIntent();
        Bundle extra= intent.getExtras();
        if (extra!=null){
            String dato=extra.getString("dato");
            tv.setText("Buenvenido " + dato);
            //Toast.makeText(getApplicationContext(),"dato1: "+ dato, Toast.LENGTH_SHORT).show();
        }
                Bandas bandas_datos[]=new Bandas[]{
                new Bandas(R.drawable.ic_launcher,"uno"),
                new Bandas(R.drawable.ic_launcher,"dos"),
                new Bandas(R.drawable.ic_launcher,"tres"),
                new Bandas(R.drawable.ic_launcher,"cuatro"),
                new Bandas(R.drawable.ic_launcher,"cinco"),
                new Bandas(R.drawable.ic_launcher,"seis"),
                new Bandas(R.drawable.ic_launcher,"siete"),
                new Bandas(R.drawable.ic_launcher,"ocho"),
                new Bandas(R.drawable.ic_launcher,"nueve"),
                new Bandas(R.drawable.ic_launcher,"diez"),
                new Bandas(R.drawable.ic_launcher,"once"),
                new Bandas(R.drawable.ic_launcher,"doce")
        };

        BandasAdapter adapter=new BandasAdapter(this,R.layout.listview_item_row,bandas_datos);
        lv=(ListView)findViewById(R.id.lv1);
        View header=(View)getLayoutInflater().inflate(R.layout.list_header_row,null);
        lv.addHeaderView(header);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v =(TextView)view.findViewById(R.id.tv1);
                Toast.makeText(getApplicationContext(), v.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
