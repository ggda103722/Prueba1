package com.example.andresguzmn.prueba1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Andres Guzmán on 14/11/2015.
 */
public class BandasAdapter extends ArrayAdapter<Bandas> {
    Context context;
    int layoutResourseId;
    Bandas data[]=null;
    public BandasAdapter(Context context,int layoutResourseId,Bandas[] data){
        super(context,layoutResourseId,data);
        this.context=context;
        this.layoutResourseId=layoutResourseId;
        this.data=data;
    }
    public View getView(int position,View convertView,ViewGroup parent){
        View row=convertView;
        BandasHolder holder=null;
        if (row==null){
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            row= inflater.inflate(layoutResourseId,parent,false);
            holder=new BandasHolder();
            holder.imagen=(ImageView) row.findViewById(R.id.img);
            holder.texto=(TextView) row.findViewById(R.id.tv1);
            row.setTag(holder);

        }else{
            holder=(BandasHolder)row.getTag();
        }
        Bandas bandas=data[position];
        holder.texto.setText(bandas.title);
        holder.imagen.setImageResource(bandas.icon);
        return row;
    }
    static class BandasHolder{
        ImageView imagen;
        TextView texto;
    }
}
