package com.example.activitieswithpush;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class SendActivity extends Activity {
	private Button sendNotificationButton;
	private Spinner spinner;
	private EditText editText;
	private CheckBox checkBoxLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send);
		
		sendNotificationButton = ( Button )this.findViewById( R.id.buttonSend );
		spinner = (Spinner) findViewById(R.id.spinner1);
		editText = (EditText) findViewById(R.id.editText1);
		checkBoxLocation = (CheckBox) findViewById(R.id.checkBoxLocation);
		
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.activities_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		
		sendNotificationButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_send, menu);
		return true;
	}

}
