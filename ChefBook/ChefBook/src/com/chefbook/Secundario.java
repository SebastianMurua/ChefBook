package com.chefbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Secundario extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secundario);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secundario, menu);
		return true;
	}
	public void pasarActividad(View v){
    	Intent siguiente = new Intent(this,Entrada.class);
    	startActivity(siguiente);
	}
	public void pasarActividad1(View v){
    	Intent siguiente = new Intent(this,Salsas.class);
    	startActivity(siguiente);
	}
	public void pasarActividad2(View v){
    	Intent siguiente = new Intent(this,Postres.class);
    	startActivity(siguiente);
	}
}
