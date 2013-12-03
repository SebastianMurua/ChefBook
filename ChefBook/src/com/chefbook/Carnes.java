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

public class Carnes extends Activity implements OnClickListener {
	ImageView croquetas, paella, pastel, albondigas;
	TextView receta;
	String texto="";
	WebView wbReceta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carnes);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		croquetas = (ImageButton) findViewById(R.id.ivCroquetas);
		croquetas.setOnClickListener(this);
		paella = (ImageButton) findViewById(R.id.ivPaella);
		paella.setOnClickListener(this);
		pastel = (ImageButton) findViewById(R.id.ivPastel);
		pastel.setOnClickListener(this);
		albondigas = (ImageButton) findViewById(R.id.ivAlbondigas);
		albondigas.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.carnes, menu);
		return true;
	}
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivCroquetas:
			receta.setText("Croquetas de Jamon");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>200 g jamón curado picado</li>" +
					"<li>1 cebolla mediana</li>" +
					"<li>100 g harina</li>" +
					"<li>100 g mantequilla</li>" +
					"<li>1 l leche</li>" +
					"<li>1 ó 2 huevos batidos</li>" +
					"<li>pan rallado</li>" +
					"<li>perejil picado</li>" +
					"<li>sal</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Picamos la cebolla y el jamón a brunoise, muy finos. En una cazuela, con la mantequilla cortada en dados y un chorrito de aceite a fuego bajo, añadimos la cebolla, salpimentamos y doramos por 10 minutos, agregamos el jamón y sofreímos unos minutos. Seguidamente añadimos la harina y removemos bien con un batidor de varillas, cocinándolo todo durante 3 o 4 minutos. Seguidamente poco a poco, vamos incorporando la leche, sin dejar de batir, sazonamos. Batimos bien 1 minuto más. Paramos de batir y removemos con una lengua bien unos minutos más. Hasta que la masa en su conjunto se va despegando bien de la olla al remover y no se pega. Una masa uniforme. Retiramos del fuego y continuación extendemos la masa en una fuente o bandeja de horno que nos quepa en la nevera, dejamos que se atempere 10 minutos y la cubrimos con papel transparente, sin dejar aire, pegado a la masa, para que no se forme costra. Dejamos que se enfrí­e idealmente de un día para otro, sino mínimo 3 horas en la nevera. Una vez frí­a la masa, quitamos el film y cortamos al gusto. Moldeamos las croquetas. Ya formadas las croquetas, ponemos abundante aceite a calentar. Mientras, vamos pasando las croquetas por huevo y pan rallado y poco de perejil picado. Finalmente freí­mos las croquetas hasta que queden doradas.";
			break;
		case R.id.ivPaella:
			receta.setText("Paella Valenciana");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1 pollo chico (1kg aprox)</li>" +
					"<li>300 grs carne de chancho</li>" +
					"<li>4 chorizos</li>" +
					"<li>600 grs arroz</li>" +
					"<li>250 grs tomates pelados y cortados en pedazos</li>" +
					"<li>200 grs camarones chicos</li>" +
					"<li>200 grs pimientos</li>" +
					"<li>200 grs arvejitas cocidas</li>" +
					"<li>2 cebollas</li>" +
					"<li>100 grs jamón</li>" +
					"<li>2 dientes de ajo</li>" +
					"<li>1 taza aceite de oliva</li>" +
					"<li>1 cdta azafrán o pimentón</li>" +
					"<li>1 limón</li>" +
					"<li>1 zanahoria</li>" +
					"<li>Sal y pimienta</li>" +
					"<li>Perejil picado</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Cortamos el pollo y lo sancochamos en una olla con 1 litro de agua con sal, zanahoria y 1 cebolla. Limpiamos los choros. Los colocamos en otra olla y cocinamos hasta que se abran. Guardamos el agua. Retiramos la mitad de los choros de sus conchas y dejamos la otra mitad con sus conchas abiertas. Cortamos la carne de chancho en pedazos y el jamón en tiras. En una olla grande colocamos la mitad del aceite, añadimos la otra cebolla picadita y dejamos dorar. Les echamos los tomates, la carne de chancho y el jamón, dejando cocinar por unos 6 minutos más. Luego añadimos el pollo y el chorizo. Seguidamente colocamos los pimientos cortados a lo largo (trozos grandes). En otra olla más ( ya van cuatro!) freimos el arroz en el aceite restante. En la primera olla (donde se sancochó el pollo), se juntan todos los ingredientes (menos los choros y los camarones), más el caldo de los choros y del pollo. Añadimos el azafrán y un poco de perejil, sal, pimienta y algunas gotas de jugo de limón. Finalmente agregamos los choros y los camarones. Dejamos cocinar por 15 minutos sin mover. Retirar del fuego y dejar descansar por 5 minutos antes de servir. Rinde para 8 personas.";
			break;
		case R.id.ivPastel:
			receta.setText("Pastel de Carne");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1/2 kilo de carne molida (de bisteck, no la “especial”)</li>" +
					"<li>1/2 paquete de margarina</li>" +
					"<li>4 panes de molde</li>" +
					"<li>2 cebollas chicas picadas menudo</li>" +
					"<li>1 taza de leche</li>" +
					"<li>2 huevos</li>" +
					"<li>Perejil picado</li>" +
					"<li>Sal y pimienta al gusto</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Empezamos remojando las migas trozadas del pan en la leche caliente. Mientras tanto, ponemos en una sartén una cucharada de margarina y freimos ahí la cebolla. Amasamos la carne con las migas, la cebolla frita, huevo, perejil, sal y pimienta. Para llevarlo al horno debemos engrasar un molde rectangular. Colocamos en él la preparación y salpicamos con trocitos de margarina. Llevamos a horno caliente(350º) por 30 minutos. Para servir, acompáñalo con abundantes papas doradas, verdura cocida al vapor o arroz.";
			break;
		case R.id.ivAlbondigas:
			receta.setText("Albondigas con salsa de Verdura");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>24 albóndigas de carne vacuno</li>" +
					"<li>1 cebolla pequeña</li>" +
					"<li>3 zanahorias</li>" +
					"<li>2 tomates maduros</li>" +
					"<li>2 tomates maduros</li>" +
					"<li>500ml caldo de pollo</li>" +
					"<li>vino blanco para cocinar</li>" +
					"<li>aceite de oliva virgen extra</li>" +
					"<li>1 ramita de romero fresco</li>" +
					"<li>2 hojas de laurel</li>" +
					"<li>sal</li>" +
					"<li>pimienta negra molida</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Primero pasamos las albóndingas por harina, ponemos aceite de oliva en una sartén ancha y profunda, freímos por las dos caras las albóndigas, unos 2 minutos a fuego vivo, doradas por fuera pero crudas por dentro. Reservamos. Picamos finamente la cebolla y la zanahoria y las reservamos juntas en un plato. Pelamos las patatas y las cortamos a daditos de 1/2 centímetro de grosor. Reservamos las patatas. En otra sartén con aceite limpio, rehogamos la cebolla y la zanahoria, agregamos la ramita de romero y las 2 hojas de laurel, salpimentamos un poco, dejamos dorar unos minutos. Echamos un buen chorro de vino (como medio vaso) y dejamos que evapore. Rallamos los 2 tomates maduros y los agregamos al sofrito, damos vueltas durante 2 minutos y agregamos el caldo de pollo. Agregamos las albóndigas y sin tapar dejamos cocer 15 a 20 minutos hasta que las albóndigas estén hechas, la salsa haya reducido y las verduras estén al punto.";
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}
}
