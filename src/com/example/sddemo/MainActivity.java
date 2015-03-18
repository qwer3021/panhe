package com.example.sddemo;

import java.io.File;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if(Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())){
			File file=new File(Environment.getExternalStorageDirectory(),"info.txt");
		}//»ñÈ¡sd¿¨µÈ×´Ì¬
	}


}
