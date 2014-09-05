package com.example.android_alertdialog;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private TextView tv;
	private Button bt1;
	private Button bt2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView)findViewById(R.id.TextView1);
		bt1=(Button)findViewById(R.id.Button1);
		bt2=(Button)findViewById(R.id.Button2);
		
		final String[] items={"Chicken","putin","burger"};
		final AlertDialog.Builder builder = new AlertDialog.Builder(this);
		bt2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				builder.setMessage("Relly confirm?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						tv.setText("Confirm");
						
					}
					
				}).setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						tv.setText("");
					}
				}).create().show();
			}
			
		});
		
		bt1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				builder.setTitle("Please order").setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						tv.setText(items[which]);
					}
				}).create().show();
			}
			
		});
	}


}
