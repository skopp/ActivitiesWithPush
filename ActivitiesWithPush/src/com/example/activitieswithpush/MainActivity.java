package com.example.activitieswithpush;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {
	private Button sendButton, registerButton;
	private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;
	public static String apiKey ="Your Netmera Apikey";
	public static String projectId = "Project Id from Google";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sendButton = ( Button ) this.findViewById( R.id.buttonSendActivity );
		registerButton = ( Button ) findViewById( R.id.buttonRegister );
		checkBox1= (CheckBox) findViewById(R.id.checkBox1);
		checkBox2= (CheckBox) findViewById(R.id.checkBox2);
		checkBox3= (CheckBox) findViewById(R.id.checkBox3);
		checkBox4= (CheckBox) findViewById(R.id.checkBox4);
		checkBox5= (CheckBox) findViewById(R.id.checkBox5);
		checkBox6= (CheckBox) findViewById(R.id.checkBox6);
		
		
		registerButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});
		sendButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SendActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
