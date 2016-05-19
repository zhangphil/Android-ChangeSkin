package zhangphil.apptest;

import com.zhy.changeskin.SkinManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		SkinManager.getInstance().register(this);
		
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onDestroy(){
	    super.onDestroy();
	    SkinManager.getInstance().unregister(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {	
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.red_skin) {
			SkinManager.getInstance().changeSkin("red");
			return true;
		}
		
		if (id == R.id.green_skin) {
			SkinManager.getInstance().changeSkin("green");
			return true;
		}
		
		if (id == R.id.default_skin) {
			SkinManager.getInstance().changeSkin("default");;
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
