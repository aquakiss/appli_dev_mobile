package com.example.testlabo;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    
  /*  //Liste view item de liste ,adapter fourni les données
    ListView lliste = (ListView)findViewById(R.id.listView_produit);
    String[] data ={"aaaa", "bbbbb", "cccc"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, R.layout.activity_second,data); //array retourne juste une ligne
    lliste.setAdapter(adapter);
    
    }

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}
    */
     Spinner spinner = (Spinner) findViewById(R.id.spinner_img_categori);
     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.activity2_spin_catg ,R.layout.activity_second);
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) ;
     spinner.setAdapter(adapter);
}
    public class SpinnerActivity extends Activity implements OnItemSelectedListener{

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
    	
    }
    
	private static final int MENU_ITEM_DIALOG=1;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, MENU_ITEM_DIALOG, Menu.NONE, "Quitter");
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if(item.getItemId()==MENU_ITEM_DIALOG) {
			finish();
		}
		return true;
	}
}