package com.example.testlabo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
private static final int MENU_ITEM_DIALOG=1;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    // -----------------  click sur le bouton de l'id btGoToSecondActivity pour passer a l'activiter 2
        Button changeButton = (Button) findViewById(R.id.btGoToSecondActivity);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), SecondActivity.class);
				startActivity(changeActivity);
			}
		});
        
  // -----------------  click sur le bouton de l'id btGoToUse_liste pour passer a l'activiter Use_liste     
        Button changeButton2 = (Button) findViewById(R.id.btGoToUse_liste);
        changeButton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), ThirdActivity.class);
				startActivity(changeActivity);
			}
		}); 
       
     // -----------------  click sur le bouton de l'id btGoToThirdActivity pour passer a l'activiter 3
        Button changeButton3 = (Button) findViewById(R.id.btGoToThirdActivity);
        changeButton3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Use_liste.class);
				startActivity(changeActivity);
			}
		});
    }
        

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
