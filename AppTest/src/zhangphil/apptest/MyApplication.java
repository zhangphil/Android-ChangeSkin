package zhangphil.apptest;

import com.zhy.changeskin.SkinManager;

import android.app.Application;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		SkinManager.getInstance().init(this);
	}
}
