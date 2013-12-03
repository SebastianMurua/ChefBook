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

public class Huevos extends Activity implements OnClickListener {
	ImageView escalfados, plancha, vinagreta, tortilla;
	TextView receta;
	String texto="";
	WebView wbReceta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_huevos);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		escalfados = (ImageButton) findViewById(R.id.ivEscalfados);
		escalfados.setOnClickListener(this);
		plancha = (ImageButton) findViewById(R.id.ivPlancha);
		plancha.setOnClickListener(this);
		vinagreta = (ImageButton) findViewById(R.id.ivVinagreta);
		vinagreta.setOnClickListener(this);
		tortilla = (ImageButton) findViewById(R.id.ivTortilla);
		tortilla.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.huevos, menu);
		return true;
	}
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivEscalfados:
			receta.setText("Huevos Escalfados");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>8 huevos</li>" +
					"<li>vinagre</li>" +
					"<li>aceite de oliva</li>" +
					"<li>pimentón dulce de la vera</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Ponemos una olla al fuego con cuatro dedos de agua, un poco de sal y un chorro de vinagre, y lo llevamos a ebullición. Una vez el agua hierva bajamos el fuego, y con cuidado, abrimos 2 huevos y los echamos al agua. Sirviéndonos de una espumadera vamos cubriendo los huevos con el agua para asegurarnos que la clara queda cocida, mientras que la yema debe quedarnos un poco más cruda. A cabo de un par de minutos, sacamos los huevos y servimos. Realizamos este proceso de 2 en 2, con los 8 huevos. A continuación espolvoreamos con un poco de pimentón dulce de la vera, regamos con un chorro de aceite de oliva, salpimentamos y servimos con una rodaja de pan.";
			break;
		case R.id.ivPlancha:
			receta.setText("Huevos a la Plancha");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>4 huevos</li>" +
					"<li>Aceite</li>" +
					"<li>Pimienta</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Primero de todo, colocamos en una plancha o en una sartén antiadherente con unas gotitas de aceite y las distribuimos por toda la superficie. Una vez el aceite esté caliente agregamos los huevos, procurando que la yema nos quede centrada y dejamos que la clara se cocine. Por último condimentamos con un poco de sal y pimienta y retiramos del fuego para que la yema no se cocine.";
			break;
		case R.id.ivVinagreta:
			receta.setText("Huevos a la Vinagreta");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>4 huevos</li>" +
					"<li>1 cebolleta tierna</li>" +
					"<li>50 ml vinagre de jerez</li>" +
					"<li>100 ml de aceite de oliva</li>" +
					"<li>50 g de virutas de parmesano</li>" +
					"<li>trufa negra en conserva</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Picamos la cebolla muy fina. Reservamos en un bol. En un vaso hacemos la mezcla de aceite y vinagre. Agregamos al bol. Removemos y reservamos. Ponemos abundante aceite en una sartén antiadherente y cuando esté caliente echamos los huevos. Los freí­mos sin que la yema cuaje y los sacamos. Colocamos en los platos de emplatar directamente. Espolvoreamos con las virutas de parmesano. Aliñamos con la mezcla de cebolla y vinagreta al gusto. Acabamos rallando por encima con un poco de trufa al gusto, ojo que es fuerte. Sazonamos. Servimos los huevos a la vinagreta trufada al momento.";
			break;
		case R.id.ivTortilla:
			receta.setText("Tortilla de Papa");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>6 huevos</li>" +
					"<li>4 papas</li>" +
					"<li>200 g cebolla</li>" +
					"<li>pimienta negra molida</li>" +
					"<li>aceite de oliva</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Precalentamos el horno a 160º. Pelamos y cortamos las papas en rodajas de 0.5 cm. Las ponemos en el fondo de una bandeja grande para horno engrasada con aceite de oliva. A continuación cortamos la cebolla a juliana fina y la añadimos a la bandeja, con un poco de sal y pimienta. Por último, añadimos un buen chorro de aceite por arriba y metemos en el horno a 160º. Vamos removiendo las papas de vez en cuando hasta que queden tiernas, pero no doradas. Las sacamos de la bandeja y las escurrimos. Entre 15-20 minutos. Reservamos en un plato hondo. Luego batimos los huevos con un poco de sal. En un molde alto mezclamos bien los huevos con las papas y lo horneamos a 180º hasta que la tortilla cuaje.";
			break;
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}

}
