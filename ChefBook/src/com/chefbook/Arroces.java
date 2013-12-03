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

public class Arroces extends Activity implements OnClickListener{
	ImageView tapado, atun, pescado, salchicha;
	TextView receta;
	String texto="";
	WebView wbReceta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arroces);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		tapado = (ImageButton) findViewById(R.id.ivTapado);
		tapado.setOnClickListener(this);
		atun = (ImageButton) findViewById(R.id.ivAtun);
		atun.setOnClickListener(this);
		pescado = (ImageButton) findViewById(R.id.ivPescado);
		pescado.setOnClickListener(this);
		salchicha = (ImageButton) findViewById(R.id.ivSalchicha);
		salchicha.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.arroces, menu);
		return true;
	}
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivTapado:
			receta.setText("Arroz Tapado");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>3 tazas de arroz cocido y bien graneado</li>" +
					"<li>1/2 kg de carne molida</li>" +
					"<li>1 diente de ajo picado</li>" +
					"<li>1 cebolla grande picada finamente</li>" +
					"<li>1 cucharada de pimentón picado</li>" +
					"<li>3 cucharadas de aceite</li>" +
					"<li>2 tomates pelados y cortados</li>" +
					"<li>3 huevos duros</li>" +
					"<li>12 aceitunas</li>" +
					"<li>1/4 taza de pasas</li>" +
					"<li>Ají verde picado</li>" +
					"<li>Perejil picado finamente</li>" +
					"<li>Sal, Pimienta</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Para preparar el deliciosos Arroz tapado, es necesario que primero preparemos el relleno. Calentamos el aceite en una olla pequeña o sartén de tamaño regular, agregamos la cebolla picadita finamente, ajo, ají y pimentón, esperamos a que cristalice la cebolla y añadimos la carne que debe estar cortada en pequeños trozos. Vamos moviendo con una cuchara de palo mientras se cocina la carne. Cuando notamos que la carne ya está lista, agregamos el tomate, la sal y pimienta a nuestro gusto. Seguimos moviendo. Dejamos unos minutos hasta que todos los ingredientes estén bien cocidos y ahí volvamos las pasas, aceitunas despepadas y los huevos duros que deben estar picados. Retirar del fuego. Una vez que tenemos listo el relleno, es tiempo de trabajar con el arroz. Para que nos salga un arroz tapado con bonita forma, necesitamos contar con un buen molde, para esto podremos usar un bowl pequeño, un plato sopero o un recipiente pequeño, la forma de nuestro Arroz tapado va a depender del molde. Así que tienes la libertad de elegir el que más te guste. Una vez que tienes el molde ideal, colocas una capa de arroz en el fondo, presionando con las manos para poder llenar todos los rincones del molde. Luego, agregamos una capa de relleno. Después de esto, colocamos otra capa de arroz, que debe tapar todo el molde. Tomamos un plato plano o tendido en el que vamos a servir, y volteamos delicadamente el contenido de nuestro molde, de tal manera que no pierda forma y no se vaya a desintegrar. Para que nuestro platillo se vea mejor, podemos decorar con perejil picado, un pedazo de pimiento o con la verdura que gustes.";
			break;
		case R.id.ivAtun:
			receta.setText("Arroz con Atún");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>2 tazas de arroz</li>" +
					"<li>1 lt de agua</li>" +
					"<li>1/3 taza de cebolla picada</li>" +
					"<li>1 cdta de ajos molidos</li>" +
					"<li>1 cdta de curry</li>" +
					"<li>2 cubitos de caldo de carne</li>" +
					"<li>1 lata de atún</li>" +
					"<li>1 pimiento</li>" +
					"<li>1 ramita de perejil</li>" +
					"<li>1 hoja de laurel</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Freímos los ajos y la cebolla, añadiendo luego la pasta de tomate. Movemos unos instantes y agregamos el curry, el pimiento picado, el perejil, el litro de agua y los cubitos. Cuando hierva, echamos el arroz y bajamos el fuego para dejarlo cocer. Cuando el arroz esté a punto, añadimos el atún y mezclamos bien. Servimos de inmediato.";
			break;
		case R.id.ivPescado:
			receta.setText("Arroz con Pescado");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1/3 de taza de margarina</li>" +
					"<li>1 kilo de pescado blanco</li>" +
					"<li>1 cebolla picada</li>" +
					"<li>2 tomates enteros pelados y picados</li>" +
					"<li>4 dientes de ajo</li>" +
					"<li>1/2 taza de vino blanco</li>" +
					"<li>3 1/2 tazas de caldo de pescado</li>" +
					"<li>1/3 de taza de hongos</li>" +
					"<li>3/4 de taza de arvejitas</li>" +
					"<li>1 pimiento</li>" +
					"<li>1 hoja de laurel</li>" +
					"<li>2 tazas de arroz</li>" +
					"<li>1/2 taza de queso parmesano</li>" +
					"<li>Sal, pimienta y pimentón</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Limpiamos el pescado, separamos la cabeza y el espinazo y hervimos en agua para obtener el caldo. Aparte, derretimos la margarina y freimos la cebolla, ajos, tomates, sal, pimienta y pimentón. Cuando esté cocido, añadimos las arvejitas, pimientos, hongos licuados, vino, caldo y arroz. Cocemos a fuego lento. Cuando empiece a secar, acomodamos el pescado encima. Servimos y espolvoreamos con queso parmesano.";
			break;
		case R.id.ivSalchicha:
			receta.setText("Arroz con Salchicha");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>2 tazas de arroz.</li>" +
					"<li>225 grs de salchicha.</li>" +
					"<li>1 cebolla.</li>" +
					"<li>1 pimiento verde.</li>" +
					"<li>1 lata de salsa de tomate.</li>" +
					"<li>1 cubito de caldo de carne.</li>" +
					"<li>Vino seco.</li>" +
					"<li>Aceite, ajo en polvo.</li>" +
					"<li>Sal y pimienta.</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Cortamos las cebollas y el pimiento en pedacitos pequeños y los sofreimos en un poco de aceite. Le añadimos luego las salchichas cortadas en rueditas. Condimentamos con sal, ajo, en polvo y pimienta. Añadimos la salsa de tomate, el cubito de caldo (diluido en agua) y el vino seco. Dejamos cocinar durante 10 minutos. Añadimos el arroz crudo y revolvemos bien para que éste adquiera un tono amarillo-anaranjado. Agregamos dos tazas de agua a la preparación y dejamos que hierva. Cuando el agua se haya evaporado, tapamos la olla y dejamos que el arroz se siga cocinando por 30 minutos más.";
			break;
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}
}
