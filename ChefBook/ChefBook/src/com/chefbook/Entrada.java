package com.chefbook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Entrada extends Activity implements OnClickListener{
	ImageView crepes, crepes2, espinaca, quiche;
	TextView receta;
	String texto="";
	WebView wbReceta;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_entrada);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		crepes = (ImageButton) findViewById(R.id.ivCrepes);
		crepes.setOnClickListener(this);
		crepes2 = (ImageButton) findViewById(R.id.ivCrepes2);
		crepes2.setOnClickListener(this);
		espinaca = (ImageButton) findViewById(R.id.ivEspinaca);
		espinaca.setOnClickListener(this);
		quiche = (ImageButton) findViewById(R.id.ivQuiche);
		quiche.setOnClickListener(this);
		wbReceta = (WebView) findViewById(R.id.wbContenido);
		
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.entrada, menu);
		return true;
	}

	@Override
	public void onClick(View vista) {
		//if (vista.getId()==findViewById(R.id.ivCrepes).getId()){
			//texto.setText("hola");
		switch (vista.getId()){
		case R.id.ivCrepes:
			receta.setText("Crepe");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>2/3 taza de harina</li>" +
					"<li>1 taza de leche descremada</li>" +
					"<li>1 cucharadita de aceite de oliva</li>" +
					"<li>1/4 cucharada de polvo de hornear</li>" +
					"<li>1/4 cucharada de sal</li>" +
					"<li>1 huevo</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Incorpora los ingredientes en un tazón mediano y bate hasta que la masa esté uniforme y sin grumos. Calienta una sartén y vierte un poco de aceite de oliva. Agrega un cucharón chico de la mezcla para formar el panqueque lo más fino posible en la sartén. Una vez que tome consistencia sólida, dale vuelta para que no se dore mucho.";
			break;
		case R.id.ivCrepes2:
			receta.setText("Crepe de pollo capresse");
			texto= "Ingredientes:\n" +
					"Pechuga de pollo deshilachada\n" +
					"Tajadas de queso mozarella\n" +
					"Hojas de albahaca fresca\n" +
					"Tomate en rodajas\n" +
					"Aliño: aceite de oliva, sal y pimienta";
			break;
		case R.id.ivEspinaca:
			receta.setText("Crepe vegetariano de espinaca");
			texto="Ingredientes:\n" +
					"Espinaca\n" +
					"Queso fresco\n" +
					"Pimiento rojo\n" +
					"Pecanas o nueces picadas\n" +
					"Champiñones\n" +
					"Mayonesa de leche:\n" +
					"  1 huevo ,1 taza de aceite de oliva,\n" +
					"  1/4 de cucharadita de mostaza, Limón y sal al gusto";
			break;
		case R.id.ivQuiche:
			receta.setText("Quiche");
			texto="Ingredientes:\n" +
					"200 g de tocino ahumado picado o en tiras.\n" +
					"200 g de queso tipo gruyere rallado.\n" +
					"una cucharada de aceite vegetal.\n" +
					"250 ml de nata o crema de leche.\n" +
					"100 ml de leche.\n" +
					"4 huevos.\n" +
					"Sal y pimienta al gusto.\n";
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}

}
