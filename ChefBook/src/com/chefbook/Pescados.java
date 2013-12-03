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

public class Pescados extends Activity implements OnClickListener {
	ImageView cazuelamerluza, croquetascaballa, empanadillas, merluza;
	TextView receta;
	String texto="";
	WebView wbReceta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pescados);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		cazuelamerluza = (ImageButton) findViewById(R.id.ivCazuelamerluza);
		cazuelamerluza.setOnClickListener(this);
		croquetascaballa = (ImageButton) findViewById(R.id.ivCroquetascaballa);
		croquetascaballa.setOnClickListener(this);
		empanadillas = (ImageButton) findViewById(R.id.ivEmpanadillas);
		empanadillas.setOnClickListener(this);
		merluza = (ImageButton) findViewById(R.id.ivMerluza);
		merluza.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pescados, menu);
		return true;
	}
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivCazuelamerluza:
			receta.setText("Cazuela de Merluza");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>4 lomos de merluza de 200 g por unidad</li>" +
					"<li>1 zanahoria grande</li>" +
					"<li>1 cebolla grande</li>" +
					"<li>2 ajos pequeños</li>" +
					"<li>1 limón</li>" +
					"<li>250 ml de vino blanco</li>" +
					"<li>150 ml de agua</li>" +
					"<li>50 g de piñones</li>" +
					"<li>1 ramita de perejil</li>" +
					"<li>pimienta negra molida</li>" +
					"<li>aceite de oliva</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Salpimentamos la merluza por ambas caras y aliñamos con el zumo de limón, reservamos las 2 mitades ya exprimidas para la cocción posterior. Pelamos y cortamos a rodajas finas la zanahoria. Pelamos y cortamos la cebolla a juliana. Pelamos y cortamos los ajos a láminas finas. Luego, en una cazuela de barro con un buen chorro de aceite, agregamos la cebolla y la zanahoria. Colocamos la merluza encima de la cama de verduras y regamos con el jugo que quede en el plato de reserva. Añadimos la ramita de perejil, adornamos con los piñones, espolvoreamos con el ajo laminado por encima. Añadimos el vino y el agua. Colocamos las 2 mitades de limón previamente reservadas. Tapamos y cocinamos a fuego suave durante 30 minutos. Retiramos del fuego cuando la merluza quede bien hecha y servimos.";
			break;
		case R.id.ivCroquetascaballa:
			receta.setText("Croquetas de Caballa");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>2 caballas frescas fileteadas</li>" +
					"<li>1 cebolla grande</li>" +
					"<li>100 g harina</li>" +
					"<li>115 g mantequilla</li>" +
					"<li>50 ml de vino blanco</li>" +
					"<li>1 litro de leche</li>" +
					"<li>2 huevos</li>" +
					"<li>200 g pan rallado o panko</li>" +
					"<li>pimienta negra molida</li>" +
					"<li>aceite de girasol o vegetal</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Pedimos en la pescadería que nos limpien las caballas y nos las preparen fileteadas. Picamos la cebolla a brunoise, muy fina. En una sartén con un poquito de aceite a fuego vivo, marcamos los filetes de caballa por ambos lados. Retiramos la piel y desmenuzamos con los dedos y reservamos. En la misma sartén con la mantequilla y un chorrito de aceite extra, a fuego medio, agregamos la cebolla, salpimentamos y doramos unos 10 minutos. Seguimos a fuego medio y agregamos el caballa cocinamos por 2 minutos. Añadimos la harina y mezclamos con un batidor de varillas, hacemos un roux. Dejamos cocinar por 3 minutos sin parar de remover. Calentamos e incorporamos la leche poco a poco y sin dejar de batir con el batidor de varillas. Subimos a fuego fuerte sin dejar de remover hasta conseguir una masa cremosa, rectificamos de sal y removemos hasta que se desprenda de la olla. Retiramos del fuego y continuación extendemos la masa en una fuente o bandeja de horno que nos quepa en la nevera, dejamos que se atempere 10 minutos y la cubrimos con papel transparente, sin dejar aire, pegado a la masa, para que no se forme costra. Dejamos que se enfrí­e idealmente de un día para otro, sino mínimo 3 horas en la nevera. Una vez frí­a la masa, quitamos el film y cortamos al gusto. Moldeamos las croquetas de caballa. Rebozamos en huevo y pan rallado o panko. Freí­mos las croquetas en abundante aceite de girasol o vegetal caliente. Una vez fritas reservamos sobre un papel absorbente.";
			break;
		case R.id.ivEmpanadillas:
			receta.setText("Empanadas de Atún");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>3 latas de atún</li>" +
					"<li>12 tapas de empanadas</li>" +
					"<li>1 cebolla</li>" +
					"<li>1 diente de ajo</li>" +
					"<li>2 huevos</li>" +
					"<li>150 ml de tomate frito</li>" +
					"<li>pimienta negra molida</li>" +
					"<li>aceite de oliva</li>" +
					"<li>aceite de girasol (para freír)</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Retiramos el excedente de aceite del atún de las latas y cococamo en un bol. Pelamos y cortamos a brunoise la cebolla y los ajos, muy finos. En una sartén con un chorro de aceite, al fuego medio, agregamos la cebolla, salpimentamos, damos una vuelta y cocinamos por 10 minutos. Pasado este tiempo agregamos el ajo, bajamos el fuego y dejamos pochar por 5 minutos más. Agregamos el tomate frito, damos unas vueltas para que tome temperatura. Retiramos del fuego y a pasamos al bol. Mientras hervimos los huevos en agua con un chorrito de vinagre por 10 minutos. Enfriamos y pelamos los huevos. Luego picamos los huevos y los agregamos al bol. Procedemos a rellenar cada empanadilla con una cucharada de masa. Cerramos haciendo una media luna y con el tenedor chafamos el borde para sellar la empanadilla. Freí­mos las empanadillas de atún unos 3 minutos en abundante aceite de girasol bien caliente.";
			break;
		case R.id.ivMerluza:
			receta.setText("Merluza al Horno");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>4 lomos de merluza de 200 g por unidad</li>" +
					"<li>4 patatas medianas</li>" +
					"<li>4 tomates</li>" +
					"<li>1 cebolla grande</li>" +
					"<li>2 dientes de ajo</li>" +
					"<li>2 hojas de laurel</li>" +
					"<li>250 ml vino blanco</li>" +
					"<li>1 rama de perejil picado</li>" +
					"<li>aceite de oliva</li>" +
					"<li>pimienta negra molida</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Precalentamos el horno a 180º. Salpimentamos y marcamos los lomos de merluza en una sartén con un poco de aceite de oliva por ambos lados. Reservamos. Pelamos y cortamos las patatas a rodajas de 0.5 cm, salpimentamos y extendemos, haciendo una cama, en una fuente de horno engrasada con un poco de aceite. Pelamos y picamos la cebolla a juliana colocamos en la fuente. Chafamos el ajo con piel y todo colocamos en la fuente. Salpimentamos sobre la cebolla un poquito más. Colocamos los filetes de merluza sobre la cama de patatas y cebolla. Rallamos los tomates y agregamos a la fuente, agregamos el vino blanco, las hojas de laurel. Colocamos en el horno durante 20 minutos a 180º. Pasado este tiempo, sacamos la fuente del horno y servimos caliente espolvoreando un poquito de perejil picado fresco.";
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}
}
