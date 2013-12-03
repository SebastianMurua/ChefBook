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

public class Sopas extends Activity implements OnClickListener{
	ImageView apio, avellana, carne, zapallo;
	TextView receta;
	String texto="";
	WebView wbReceta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sopas);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		apio = (ImageButton) findViewById(R.id.ivApio);
		apio.setOnClickListener(this);
		avellana = (ImageButton) findViewById(R.id.ivAvellanas);
		avellana.setOnClickListener(this);
		carne = (ImageButton) findViewById(R.id.ivCarne);
		carne.setOnClickListener(this);
		zapallo = (ImageButton) findViewById(R.id.ivZapallo);
		zapallo.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sopas, menu);
		return true;
	}
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivApio:
			receta.setText("Sopa Crema de Apio");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>3 apios</li>" +
					"<li>100 g mantequilla</li>" +
					"<li>3 patatas</li>" +
					"<li>3 yemas de huevo</li>" +
					"<li>1 l leche</li>" +
					"<li>1/2 nata fresca</li>" +
					"<li>100 g pan</li>" +
					"<li>Sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Primero pelamos, lavamos y limpiamos bien los apios. Luego los colocamos en agua hirviendo unos instantes, hasta que veamos que se blanquean. Luego los escurrimos y los cortamos en trozos grandes. A continuación colocamos los trozos de apio en una olla con la mantequilla. Agregamos la leche y las patatas lavadas, peladas y cortadas en rodajas finas. Salamos a nuestro gusto y cocemos la mezcla a fuego lento durante 90 minutos. Una vez bien cocida la mezcla, la pasamos por un colador fino. Si ha quedado muy espesa, podemos añadir un poco de leche. Luego llevamos la crema a hervir nuevamente y la mezclamos con las yemas de huevo y un chorrito de nata. Mientras freí­mos los trozos de pan en mantequilla. Servimos caliente con los trozos de pan frito por encima.";
			break;
		case R.id.ivAvellanas:
			receta.setText("Sopa Crema de Avellanas");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>8 Patatas medianas</li>" +
					"<li>1-2 cebollas medianas</li>" +
					"<li>1 grapadito de avellanas</li>" +
					"<li>2-3 quesitos frescos tipo el caserio</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Herbir con agua, las patatas y las cebollas, con un poco de sal. Cuando haya pasado más o menos 1h. quitar del fuego y triturar dentro de la misma olla, luego a parte triturar las avellanas con el un, dos, tres y poner la trituración dentro de la olla donde habéis triturado las patatas y la cebolla, también poner a dentro un par de quesitos tipo el caserio y volver a triturar hasta obtener una crema (no muy espesa) y sal al gusto de cada familia. Y servir un poco caliente o también se puede servir a temperatura ambiente. Antes de llevar a mesa, o antes de servir a los platos, con las avellanas trituradas restantes se pueden espolvear encima del plato una vez servida la crema";
			break;
		case R.id.ivCarne:
			receta.setText("Caldo de Carne");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1 pechuga pollo entera</li>" +
					"<li>1/2 k centro ternera</li>" +
					"<li>2 huesos caña</li>" +
					"<li>2 huesos rodilla</li>" +
					"<li>150 g garbanzos</li>" +
					"<li>2 zanahorias</li>" +
					"<li>1 tomate</li>" +
					"<li>1 puerro</li>" +
					"<li>1 nabo</li>" +
					"<li>1 ramita perejil</li>" +
					"<li>1 apio, sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Limpiamos bien todos y cada uno de los ingredientes y los ponemos en una olla con 3 litros de agua frí­a. Tapamos la olla, dejándola medio cerrada, y lo llevamos a ebullición a fuego muy lento durante unas 3 horas. Si vemos que se va creando espuma, la quitamos de la superficie con ayuda de una cucharada. Pasadas las 3 horas, retiramos la olla del fuego y colamos el contenido.";
			break;
		case R.id.ivZapallo:
			receta.setText("Sopa Crema de Zapallo");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1 kg de zapallo</li>" +
					"<li>1 cebolla mediana picada finamente</li>" +
					"<li>1 diente de ajo picado</li>" +
					"<li>1 tarro grande de leche evaporada</li>" +
					"<li>4 tazas de caldo</li>" +
					"<li>1/2 taza de queso parmesano</li>" +
					"<li>3 cucharadas de mantequilla o margarina</li>" +
					"<li>1 cucharada de harina sin preparar</li>" +
					"<li>Sal, pimienta</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"El primer paso para preparar esta deliciosa crema de zapallo es sancochar el ingrediente principal, el zapallo, el cual hemos debido cocinar en trozos. En una olla aparte, derretimos a fuego medio la mantequilla, y agregamos la cebolla y el ajo, dejamos que se cristalicen un poco por unos minutos y agregamos el zapallo. Dejamos que el zapallo y los ingredientes se mezclen, agregamos las tazas de caldo y dejamos hervir. Si notamos que esta crema no tiene mucha consistencia, podemos disolver la cucharada de harina en un poquito de agua hervida y agregamos lentamente a la crema sin dejar de mover. Seguir cocinando por unos 5 minutos más. Una vez que hierva nuestra crema la retiramos del fuego y agregamos el queso, revolvemos y agregamos la leche evaporada. Después de haber hecho esto, podemos servir nuestra crema de zapallo con pan tostado, el cual se coloca encima de la crema, dejándolos flotar.";
			break;
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}
}
