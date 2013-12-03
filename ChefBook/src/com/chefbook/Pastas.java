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

public class Pastas extends Activity implements OnClickListener{
	ImageView canelones, fideos, lasagna, noquis;
	TextView receta;
	String texto="";
	WebView wbReceta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pastas);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		canelones = (ImageButton) findViewById(R.id.ivCanelones);
		canelones.setOnClickListener(this);
		fideos = (ImageButton) findViewById(R.id.ivFideos);
		fideos.setOnClickListener(this);
		lasagna = (ImageButton) findViewById(R.id.ivLasagna);
		lasagna.setOnClickListener(this);
		noquis = (ImageButton) findViewById(R.id.ivNoquis);
		noquis.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pastas, menu);
		return true;
	}
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivCanelones:
			receta.setText("Canelones de Espinaca");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1 kg pasta para canelones</li>" +
					"<li>100 grs de mantequilla</li>" +
					"<li>1 taza de crema de leche</li>" +
					"<li>200 grs de queso fresco</li>" +
					"<li>1 taza de salsa blanca (ver Salsas)</li>" +
					"<li>800 grs de espinacas</li>" +
					"<li>50 grs de queso parmesano</li>" +
					"<li>2 huevos</li>" +
					"<li>1 ajo molido</li>" +
					"<li>Orégano, sal, pimienta</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Rociamos las espinacas con agua caliente, las escurrimos, trituramos y freímos en un poco de margarina con ajo hasta formar una pasta. Mezclamos con el queso fresco, la mitad de queso parmesano, nuez moscada, orégano, sal y pimienta. Añadimos los huevos, mezclamos con un poco de la salsa blanca y rellenamos los canelones. Colocamos los canelones en un molde enmantequillado, cubriéndolos con trocitos de mantequilla, la salsa blanca restante, la crema de leche y el resto del queso parmesano. Llevamos al horno precalentado a 350ºF hasta que dore.";
			break;
		case R.id.ivFideos:
			receta.setText("Fetuccini a lo Alfredo");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>500 gr de fetuccini</li>" +
					"<li>100 gr de mantequilla o margarina</li>" +
					"<li>1 taza de crema de leche – 1 caja pequeña</li>" +
					"<li>1/2 taza de queso parmesano rallado</li>" +
					"<li>1 diente de ajo</li>" +
					"<li>Pimienta blanca, Nuez moscada</li>" +
					"<li>Sal y Perejil</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Lo primero que se debe hacer es hervir agua, una pizca de sal y unas gotitas de aceite. Cuando veas que el agua está hirviendo se debe agregar el fetuccini y que hierva hasta que se cocine al dente. Una buena manera de reconocerlos es cuando sacas uno de estos y lo partes, el lado del centro no debe estar amarillo. Trata de que se cocinen sin que se hagan mazamorrosos. Después de esto se escurre el fetuccini, no lo enjuagues con agua fría, sólo escúrrelos y déjalos en la misma olla o en otro recipiente que los mantenga calientitos. Cuando ya hayas hecho esto, empieza a hacer la crema. Para esto debes tomar una sartén y ponerla a fuego medio, en esta colocas la mantequilla y esperas a que se derrita, ayudándote con una cuchara de palo. Cuando veas que empieza a hervir agregas el diente de ajo cortado finamente y esperas un minuto para agregar la nuez moscada y pimienta. Después de esto agregar la crema de leche y el queso parmesano. Continuar moviendo y dejar en el fuego un par de minutos más. Después de esto probar el salado de la crema y si crees que necesita un poco más de sal, la agregas, pues el queso parmesano y la mantequilla, de por sí tienen un poco de sal. Ahora sí, ya puedes retirar la crema del fuego y le agregas el perejil picado muy finamente. Ahora sí, pasas a servir el fetuccini en los platos y le colocas encima la crema. Disfruta de tu Fetuccini a lo Alfredo con buena compañía y una gran copa de vino. ¡Buon appetit";
			break;
		case R.id.ivLasagna:
			receta.setText("Lasagna de pollo y jamón");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>2tazas de pollo cocido  y picado.</li>" +
					"<li>200 gramos de jamón.</li>" +
					"<li>1 paquete de masa wantán.</li>" +
					"<li>1 bola de queso mozzarella.</li>" +
					"<li>3 tazas de leche.</li>" +
					"<li>1/3 de harina sin preparar.</li>" +
					"<li>1/3 de taza de mantequilla.</li>" +
					"<li>Queso parmesano rallado al gusto.</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Se debe comenzar picando el jamón en cuadritos, luego rallar o picar finamente el queso mozzarella y sazonarlo con sal y pimienta. Hacer una salsa blanca derritiendo en una olla la mantequilla, agregar la harina y una pizca de sal,moviendo constantemente con cuchara de madera para que no se formen grumos e incorporando de a pocos la leche sin dejar de mover. Cocer sobre fuego moderado hasta que la salsa hierva por 3 o 4 minutos y espese. Sazonar con sal, pimienta y nuez moscada rallada y reservar. Enmantequillar un molde para horno y colocar una capa de salsa blanca encima una capa de masa wantán , una capa de pollo,un poco de mozzarella rallada y jamón picado. Cubrir con más salsa blanca  y repetir hasta acabar con los ingredientes, terminando con una capa de salsa blanca. Espolvorear con queso parmesano rallado y llevar al horno por 30 minutos a temperatura moderada.";
			break;
		case R.id.ivNoquis:
			receta.setText("ÑOQUIS DE CALABAZA Y PAPA A LA CARUSO");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>300 g. de calabaza (1 taza)</li>" +
					"<li>1/2 Kg. de papas (2 tazas)</li>" +
					"<li>1/2 taza de almidón de maíz Maizena (60 g.)</li>" +
					"<li>1 1/4 tazas de harinas (150 g.)</li>" +
					"<li>1 cucharada de manteca</li>" +
					"<li>Sal, pimienta y nuez moscada</li>" +
					"<li>2 cucharadas de queso rallado</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Cocinar la calabaza al vapor, al microondas, o con muy poco agua. Escurrir bien y hacer un puré. Cocinar en agua y sal las papas con su cáscara. Escurrirlas, pelarlas y hacer un puré. Mezclar ambos purés con el almidón de maíz Maizena® tamizados con la harina, la manteca, condimentos y queso rallado. Dividir la masa en pedazos, formar tiras redondas, haciéndolas rodar con la palma de la mano sobre la mesa, espolvoreada con harina. Cortar en pequeños dados y pasarlos por el tenedor o por el molde de hacer ñoquis, para ahuecarlos. Cocinar en abundante agua hirviendo con sal. Retirar del fuego cuando el agua suelte bien el hervor y los ñoquis hayan subido a la superficie. Colar y acomodar en una fuente.";
			break;
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}
}
