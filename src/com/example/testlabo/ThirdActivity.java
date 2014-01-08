package com.example.testlabo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
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
