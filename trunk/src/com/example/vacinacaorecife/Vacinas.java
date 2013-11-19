package com.example.vacinacaorecife;



import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class Vacinas extends Activity {
	public ListView listaVacina;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.vacinas);
	
	
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_1, vacinas);
	listaVacina = (ListView) findViewById(R.id.listaVacina);
	listaVacina.setAdapter(adapter);

	listaVacina.setOnItemClickListener(new OnItemClickListener() {
		public void onItemClick(AdapterView<?> parent, View view,
				int position, long id) {
			AlertDialog.Builder mensagem = new AlertDialog.Builder(
					Vacinas.this);
			mensagem.setTitle("Atenção, você escolheu:");
			mensagem.setMessage(((TextView) view).getText().toString());
			mensagem.setNeutralButton("OK", null);
			mensagem.show();

		}
	});
	}
	
	static final String[] vacinas = new String[] { "BCG", "Tétano",
		"Sarampo", "Aids", "Gripe", "Febre"};

}
