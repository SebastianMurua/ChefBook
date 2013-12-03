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

public class Postres extends Activity implements OnClickListener{
	ImageView cupcake, cake, alfajores, brownie;
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
		cake = (ImageButton) findViewById(R.id.ivCake);
		cake.setOnClickListener(this);
		alfajores = (ImageButton) findViewById(R.id.ivAlfajor);
		alfajores.setOnClickListener(this);
		brownie = (ImageButton) findViewById(R.id.ivBrownie);
		brownie.setOnClickListener(this);
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
					"Precalentar el horno a 250ºC, en un recipiente poner la mantequilla. Luego revolver con azúcar y cuando todo parezca una sola mezcla, agregas los huevos uno por uno. Después siguen los sabores, agrega los detalles y sabores que hayas escogido como frutas etc. Agrega la esencia y el polvo de hornear, mezclar todo muy bien. Por ultimo agregas la harina, cuando todo este muy cremoso. Finalmente puedes colocar la masa en los moldes e introducirlo al horno";
			break;
		case R.id.ivCake:
			receta.setText("Cake");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>2 tazas de harina sin preparar</li>" +
					"<li>100 gr. de margarina</li>" +
					"<li>1 taza de azúcar</li>" +
					"<li>2 huevos</li>" +
					"<li>1 cdta. de vainilla</li>" +
					"<li>3 cdtas. de polvo de hornear</li>" +
					"<li>2/3 taza de leche</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Batir la margarina hasta que esté cremosa, agregar el azúcar en forma de lluvia y los huevos uno a uno, sin dejar de batir. Cernir la harina sin preparar junto con el polvo para hornear e incorporar fuera de la batidora a la preparación anterior alternando con la leche. Volcar la mezcla en un molde de 20 cm. de diámetro o uno alargado de 12 x 25 cm. o en un molde de 24 cm. con tubo al centro, previamente enmantequillado y enharinado. Hornear a temperatura moderada (350°F – 175°C) por 35 minutos o hasta que el probador salga limpio y seco.<br>" +
					"<b>Variaciones:</b><br><br>" +
					"<b>Cake de nueces:</b> Preparar la receta básica y agregar al final 1/1 taza de nueces picadas mezclada con dos cucharaditas de harina.<br>" +
					"<b>Cake de chocolate:</b> Agregar 4 cucharadas de cocoa junto a la harina cernida.<br>" +
					"<b>Cake marmolado:</b> Dividir la mezcla básica en dos, agregar a una parte 3 cucharadas de cocoa, mezclar bien y acomodar dentro del molde por cucharadas, alternando los dos colores.<br>";
			break;
		case R.id.ivAlfajor:
			receta.setText("Alfajores de Chocolate");
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
					"Primero rompes 3 huevos y separas las yemas de las claras, dejando cada ingrediente en un recipiente distinto.<br>" +
					"En un bowl grande procedes a cernir la harina, el azúcar impalpable y la cocoa, agregas la margarina, las tres yemas, el huevo entero y las almendras picadas.<br>" +
					"Con una espátula de repostería empiezas a unir todos los ingredientes por unos minutos. Dejas reposar la mezcla tapándola con un trapo o secador de cocina por una hora.<br>" +
					"Pasado el tiempo de reposo, preparas tu mesa de trabajo despejándola de todo elemento. Tomas un puñado de harina y la dispersas sobre la mesa, tomas la masa y con la ayuda de un rodillo, empiezas a estirarla.<br>" +
					"Estira la masa, y empieza a cortarla con moldes redondos o los modelos que más te gusten. Continua hasta que termines toda la masa; si es que no deseas hacerla toda en ese instante, puedes guardarla en una bolsa ziploc y refrigerarla.<br>" +
					"Teniendo la placa o bandeja de lata con los alfajores ordenados en fila, puedes llevarlos al horno entre 8 a 10 minutos. Posteriormente a ese tiempo, sacas con cuidado la bandeja y la dejas enfriar por unos 5 minutos. Empiezas a armar los alfajores untando sobre una tapita un poco de manjar blanco o dulce de leche (o también fudge) y sobreponiendo con otra tapita, y así sucesivamente hasta que termines.<br>" +
					"Si deseas puedes espolvorearle un poco de azúcar impalpable sobre tus alfajores de chocolate, y puedes acompañarlos bebiendo té o leche fría o caliente.";
			break;
		case R.id.ivBrownie:
			receta.setText("Brownies");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>4 huevos</li>" +
					"<li>350 grs de azúcar</li>" +
					"<li>300 grs de chocolate</li>" +
					"<li>200 grs de manteca</li>" +
					"<li>250 grs de harina</li>" +
					"<li>150 grs de nueces</li>" +
					"<b>Preparación:</b><br>" +
					"Lo primero que debemos hacer es batir los huevos junto con el azúcar. Aparte, derretimos el chocolate junto con la manteca. Luego mezclamos las dos preparaciones, agregamos la harina tamizada y por último las nueces picadas en trozos grandes. Colocamos en una placa con papel manteca y llevamos a horno a 180ºC. Dejamos enfriar.";
			break;
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}

}
