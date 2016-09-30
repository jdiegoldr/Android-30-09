package com.jdldr.appsemana8lab2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	//Variables Globales
	EditText etCod,etNom,etN1,etN2;
	Button btnok;
	Toast msj;
	
	//Metodos de USUARIO
	private void calcular(){
		Alumno obj = new Alumno();
		obj.codigo = Integer.parseInt(etCod.getText().toString());
		obj.nombre = etNom.getText().toString();
		obj.nota1 = Integer.parseInt(etN1.getText().toString());
		obj.nota2 = Integer.parseInt(etN2.getText().toString());
		
		//Imprimir en el TOAST
		msj = Toast.makeText(getApplicationContext(),
				"Codigo: "+ obj.codigo + "\n" + 
			    "Nombre: "+ obj.nombre + "\n" +
			    "Nota1: "+ obj.nota1 + "\n" +
			    "Nota2: "+ obj.nota2 + "\n"+ 
			    "Promedio: "+obj.promedio() + "\n"+ 
			    "Estado: "+obj.estado() , Toast.LENGTH_LONG);
				msj.show();
	}
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Crear y Referenciar
        etCod = (EditText)findViewById(R.id.etCodigo);
        etNom = (EditText)findViewById(R.id.etNombre);
        etN1 = (EditText)findViewById(R.id.etNota1);
        etN2 = (EditText)findViewById(R.id.etNota2);
        btnok = (Button)findViewById(R.id.btnCalcular);
        
        //Crear Evento 
        //Click Boton CALCULAR
        btnok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//LLamar al METODO CALCULAR
				calcular();
				
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
