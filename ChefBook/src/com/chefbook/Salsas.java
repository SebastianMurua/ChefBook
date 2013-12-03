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

public class Salsas extends Activity implements OnClickListener {
	ImageView barbacoa, bechamel, boloñesa, chimichurri;
	TextView receta;
	String texto="";
	WebView wbReceta;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_salsas);
		
		receta = (TextView) findViewById(R.id.txtRecetaId);
		barbacoa = (ImageButton) findViewById(R.id.ivBarbacoa);
		barbacoa.setOnClickListener(this);
		bechamel = (ImageButton) findViewById(R.id.ivBechamel);
		bechamel.setOnClickListener(this);
		boloñesa = (ImageButton) findViewById(R.id.ivBolonesa);
		boloñesa.setOnClickListener(this);
		chimichurri = (ImageButton) findViewById(R.id.ivChimichurri);
		chimichurri.setOnClickListener(this);
		
		wbReceta = (WebView) findViewById(R.id.wbContenido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.salsas, menu);
		return true;
	}
	
	public void onClick(View vista) {
		switch (vista.getId()){
		case R.id.ivBarbacoa:
			receta.setText("Salsa de Barbacoa");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>15 g cidronela</li>" +
					"<li>35 de jengibre fresco</li>" +
					"<li>60 g de melaza</li>" +
					"<li>600 g de tomate triturado</li>" +
					"<li>225 de naranjas</li>" +
					"<li>600 g de cebolla</li>" +
					"<li>4 ajos</li>" +
					"<li>15 ml de aceite de girasol</li>" +
					"<li>140 de azúcar moreno</li>" +
					"<li>60 g de miel</li>" +
					"<li>75 ml de vinagre de jerez</li>" +
					"<li>400 g de ketchup</li>" +
					"<li>30 g mostaza de dijón</li>" +
					"<li>10 g de salsa worcester</li>" +
					"<li>2 g de sal</li>" +
					"<li>1 g de pimienta negra</li> </ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Exprimimos el zumo de las naranjas, colamos y reservamos. Pelamos la cebollas y las cortamos a brunoise, muy fina, picamos los ajos muy finos. Cortamos en trozos pequeños la cidronela y el jengibre y los machacamos en un mortero. En una olla con el aceite de girasol, procedemos a dorar la cebolla a fuego medio, salpimentamos y cuando esté dorada agregamos el ajo. Añadimos la cidronela y el jengibre, removemos bien y dejamos dorar todo el conjunto sin parar de remover. Incorporamos el azúcar moreno, la miel y la melaza y dejamos caramelizar por 3 minutos. Añadimos el zumo de naranja, el vinagre y seguimos cocinando hasta que empiece a hervir. Una vez rompa hervir la salsa, agregamos la mostaza, el salsa worcester y el ketchup. Añadimos el tomate triturado, cocemos bien durante 30 minutos a fuego medio-bajo. Pasado este tiempo, pasmos la salsa por un toormix y colamos la salsa por un “chino”. Rectificamos de sal y ya la tenemos. Podemos servir caliente o frí­a.";
			break;
		case R.id.ivBechamel:
			receta.setText("Salsa Bechamel");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>1 litro de leche</li>" +
					"<li>60 g de mantequilla</li>" +
					"<li>60 g de harina</li>" +
					"<li>1 cebolla</li>" +
					"<li>pimienta negra molida</li>" +
					"<li>una pizca de nuez moscada</li>" +
					"<li>sal</li></ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Picamos la cebolla muy fina. En una olla agregamos un chorrito de aceite de oliva y agregamos la mantequilla para que no se queme, a fuego bajo. Agregamos la cebolla, salpimentamos y cuando la cebolla esté doradita agregamos la harina y mezclamos bien con la ayuda de un batidor de varillas. Cocemos durante dos minutos, sin dejar de remover con el batidor de varillas, hasta ver la mezcla espumosa. A continuación vamos añadiendo la leche poco a poco y sin dejar de remover, para que no queden grumos. Sazonamos con sal y sin dejar de remover lo llevamos a ebullición y lo cocemos durante 5-8 minutos. Una pizca de nuez moscada una vuelta más y listo.";
			break;
		case R.id.ivBolonesa:
			receta.setText("Salsa Boloñesa");
			texto ="<b>Ingredientes:</b><br><ul>" +
					"<li>250 g de carne picada de cerdo</li>" +
					"<li>250 g de carne picada de ternera</li>" +
					"<li>500 g de tomate triturado en conserva</li>" +
					"<li>1 cebolla</li>" +
					"<li>2 zanahorias grandes</li>" +
					"<li>30 g de mantequilla</li>" +
					"<li>150 ml de aceite de oliva</li>" +
					"<li>2 hojas de laurel</li>" +
					"<li>pimienta negra molida</li>" +
					"<li>sal</li></ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Pelamos y picamos la cebolla, la zanahoria muy fina. Ponemos a calentar el aceite y la mantequilla en una sartén. Cuando la mezcla de aceite y mantequilla esté a punto, echamos la cebolla, la zanahoria y el perejil. Agregamos el laurel, salpimentamos y lo doramos por 10-15 minutos a fuego bajo. Removemos de vez en cuando para que no se pegue. Salpimentamos las carnes picadas. A continuación añadimos la carne de cerdo y la ternera y lo salteamos 5 minutos más. Con la ayuda de una cuchara de palo vamos triturando la carne hasta que veamos la carne bien dorada. Añadimos el tomate triturado y dejamos cocer a fuego lento 45-60 minutos. Rectificamos de sal al final.";
			break;
		case R.id.ivChimichurri:
			receta.setText("Salsa Chimichurri");
			texto = "<b>Ingredientes:</b><br><ul>" +
					"<li>150 ml de aceite de oliva </li>" +
					"<li>150 ml de aceite de girasol</li>" +
					"<li>50 ml del vinagre</li>" +
					"<li>1 tomate maduro pequeño</li>" +
					"<li>1/4 de pimiento rojo</li>" +
					"<li>3 dientes ajo</li>" +
					"<li>2 cucharadas orégano</li>" +
					"<li>1/2 chile verde</li>" +
					"<li>1 cucharada perejil fresco</li>" +
					"<li>1 cucharadita de tomillo</li>" +
					"<li>1 cucharadita de romero</li>" +
					"<li>1/2 cucharadita comino</li>" +
					"<li>aderezo 5 pimientas molidas</li>" +
					"<li>sal</li></ul><br><br>" +
					"<b>Preparación:</b><br>" +
					"Antes de todo aclarar que verdaderamente la receta es originaria de Argentina y Uruguay, en ambas lleva tomate y pimiento, en España es más típico no poner estos 2 ingredientes. Lavamos los tomates, con un cuchillo les hacemos una crucecita en la base del tomate y en un cazo con agua hirviendo los escaldamos durante 45 segundos. Los pasamos rápidamente a un bol con agua y hielo para cortar la cocción. Los pelamos, los cortamos por la midad, les sacamos las pepitas y los cortamos a cuadraditos muy, muy pequeños, a brunoise. Reservamos en un bol. Lavamos y picamos muy muy fino a brunoise el pimiento rojo. Colocamos en el bol. Pelamos y picamos 1 de los 3 ajos y lo rallamos muy fino, si no tenemos rallador lo picamos muy fino. Picamos también el medio chile verde. Picamos el perejil. Colocamos todo en un bol. Añadimos el orégano, el tomillo, el romero, el tomillo, lo aderezamos todo con un poco de 5 pimientas, sazonamos al gusto y añadimos el aceite de oliva, el aceite de girasol y el vinagre. Mezclamos hasta que todos los ingredientes queden bien revueltos. Con los 2 ajos sobrantes, chafamos con la mano y los agregamos al chimichurri. Dejamos reposar en la nevera y lo ideal es prepararlo el día anterior. Podemos prepararlo hasta 1 semana antes logrando un macerado de verdad. Utilizaremos este mojo para macerar todo tipo de carnes antes de cocinarlas al horno o si hacemos chuletas o churrascos a la plancha como condimento después de cocinar.";
		}
		wbReceta.loadDataWithBaseURL(null, texto, "text/html", "UTF-8", null);
	}
}
	
