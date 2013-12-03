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

public class Postres extends Activity implements OnClickListener {
	ImageView cupcake, chiffon, alfajor, mousse;
	TextView receta;
	String texto="";
	WebView wbReceta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_postres);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		cupcake = (ImageButton) findViewById(R.id.ivCupcake);
		cupcake.setOnClickListener(this);
		chiffon = (ImageButton) findViewById(R.id.ivChiffon);
		chiffon.setOnClickListener(this);
		alfajor = (ImageButton) findViewById(R.id.ivAlfajor);
		alfajor.setOnClickListener(this);
		mousse = (ImageButton) findViewById(R.id.ivMousse);
		mousse.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.postres, menu);
		return true;
	}
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivCupcake:
			receta.setText("Cupcake");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>500 gramos de mantequilla</li>" +
					"<li>1 taza de azúcar</li>" +
					"<li>4 huevos</li>" +
					"<li>1 cucharadita de esencia de vainilla</li>" +
					"<li>2 cucharaditas de polvo de hornear</li>" +
					"<li>2 de tazas de harina</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Precalentar el horno a 250ºC, en un recipiente poner la mantequilla, procura que no este ni derretida ni en la nevera. Luego revolver con azúcar y cuando todo parezca una sola mezcla, agregas los huevos uno por uno. Después siguen los sabores, agrega los detalles y sabores que hayas escogido como frutas etc. Agrega la esencia y el polvo de hornear, mezclar todo muy bien. Por ultimo agregas la harina, cuando todo este muy cremoso. Finalmente, puedes colocar la masa en los moldes e introducirlo al horno";
			break;
		case R.id.ivChiffon:
			receta.setText("Chiffon de Chocolate");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1 taza y 3/4 de harina</li>" +
					"<li>1/4 taza de fécula de maíz</li>" +
					"<li>1 taza y 1/2 de azúcar</li>" +
					"<li>1/2 taza y 2 cucharadas de cacao</li>" +
					"<li>1 cucharada de polvo de hornear</li>" +
					"<li>1/2 cucharadita de sal</li>" +
					"<li>1/2 taza de aceite</li>" +
					"<li>7 huevos</li>" +
					"<li>1/2 taza de agua</li>" +
					"<li>1/4 taza de bebida</li>" +
					"<li>1 cucharadita y 1/2 de vainilla</li>" +
					"<li>1/2 cucharadita de cremor tártaro</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Comencemos mezclando la harina con la fécula de maíz, el azúcar, el cacao, el polvo de hornear y la sal. Luego hagamos un hueco en el centro y agreguemos (en orden) el aceite,las 7 yemas, el agua, la bebida y la vainilla y batamos todo con una cuchara de palo hasta que la masa alcance una consistente suavidad. Enseguida batamos a punto de nieve las 7 claras con el cremor tártaro. Incorporemos la mezcla de yemas a las claras, vertámosla en un molde enmantecado y llevemos a horno moderado durante 1 hora (en promedio). Una vez que esté listo, dejemos enfriar el chiffon, desmoldémoslo y cubrámoslo hasta el momento en que vayamos a servir.";
			break;
		case R.id.ivAlfajor:
			receta.setText("Alfajor");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>300 gr. de harina.</li>" +
					"<li>200 gr. margarina.</li>" +
					"<li>100 gr. de almendras finamente picadas.</li>" +
					"<li>100 gr. de azúcar impalpable.</li>" +
					"<li>1 huevo entero.</li>" +
					"<li>3 yemas.</li>" +
					"<li>3 cucharas de cocoa en polvo.</li>" +
					"<li>1 paquete de manjar blanco o dulce de leche para el relleno.</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Primero rompes 3 huevos y separas las yemas de las claras, dejando cada ingrediente en un recipiente distinto. En un bowl grande procedes a cernir la harina, el azúcar impalpable y la cocoa, agregas la margarina, las tres yemas, el huevo entero y las almendras picadas. Con una espátula de repostería empiezas a unir todos los ingredientes por unos minutos. Dejas reposar la mezcla tapándola con un trapo o secador de cocina por una hora. Pasado el tiempo de reposo, preparas tu mesa de trabajo despejándola de todo elemento. Tomas un puñado de harina y la dispersas sobre la mesa, tomas la masa y con la ayuda de un rodillo, empiezas a estirarla. Prevo a cortar la masa, te recomiendo que tengas lista una placa engrasada para disponer en orden las tapitas de los alfajores, además de precalentar el horno a temperatura moderada. Estira la masa, y empieza a cortarla con moldes redondos o los modelos que más te gusten. Continua hasta que termines toda la masa; si es que no deseas hacerla toda en ese instante, puedes guardarla en una bolsa ziploc y refrigerarla. Teniendo la placa o bandeja de lata con los alfajores ordenados en fila, puedes llevarlos al horno entre 8 a 10 minutos. Posteriormente a ese tiempo, sacas con cuidado la bandeja y la dejas enfriar por unos 5 minutos. Empiezas a armar los alfajores untando sobre una tapita un poco de manjar blanco o dulce de leche (o también fudge) y sobreponiendo con otra tapita, y así sucesivamente hasta que termines. Si deseas puedes espolvorearle un poco de azúcar impalpable sobre tus alfajores de chocolate, y puedes acompañarlos bebiendo té o leche fría o caliente.";
			break;
		case R.id.ivMousse:
			receta.setText("Mousse de Maracuyá");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>2  maracuyá frescos</li>" +
					"<li>1 cucharada de colapíz o gelatina sin sabor</li>" +
					"<li>4 huevos</li>" +
					"<li>1 lata de leche condensada</li>" +
					"<li>1/2 taza de agua caliente</li>" +
					"<li>Fruta fresca para decorar</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Lava los maracuyá y ábrelos para sacarle el relleno; luego en una licuadora, procede a licuar el contenido por 30 segundos. Enseguida, pásalo por un colados menudo para retirar las semillas y separar el zumo. No uses agua en el proceso. Aparte disuelve el colapíz en el agua caliente y déjalo enfriar a temperatura ambiente. En otro recipiente, separa las claras de la yema y bátelas a punto de nieve o hasta que formen picos consistentes. Enjuaga la licuadora y mezcla la leche condensada con el jugo de maracuyá hasta que se forme una crema homogénea. Luego, en un recipiente aparte, vacea el contenido de la licuadora y con una espátula incorpora el colapíz disuelto y las claras a punto de nieve, pero en forma envolvente para evitar que se aplaste. Una vez integrada la mezcla, colócala en copas o vasitos para postre y refrigéralo por dos horas como mínimo. Antes de servir, corta unas frutas, que pueden ser peras, mandarinas, fresas o duraznos y colócalos en el centro con una hoja de menta.";
			break;
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}

}
