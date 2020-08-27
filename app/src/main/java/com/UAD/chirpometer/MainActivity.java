package com.UAD.chirpometer;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import javax.xml.transform.sax.*;
import java.text.*;
import android.widget.NumberPicker.*;
import android.support.v7.app.AppCompatActivity;
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    final DecimalFormat formatter;
		final EditText etID;
		Button btnSubmit;
		final TextView tvResult;
		etID = findViewById(R.id.etID);	
		btnSubmit = findViewById(R.id.btnSubmit);

		tvResult = findViewById(R.id.tvResult);
		tvResult.setVisibility(View.GONE);
		 formatter = new DecimalFormat("#0.00");
		
		String hintmessage = "Did you know you can determine the temperature outside by counting the number of chirps the cricket makes per  25 seconds and place that number in the box below";
		TextView tvHint;
		tvHint= findViewById(R.id.tvHint);
		tvHint.setText(hintmessage);
		
		btnSubmit.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View view)
				{
				if(etID	.getText().toString().isEmpty())
				{
					
					Toast.makeText( MainActivity.this, "pelase enter all fields", Toast.LENGTH_SHORT).show();
				}else			
				{
					int chirps =Integer.parseInt(etID.getText().toString().trim());
					double temp =(chirps/3.0)+4;
				

String result = "The approximate temparature outside is    "+ formatter.format(temp) + "  degree celsious";
tvResult.setText(result);
					tvResult.setVisibility(view.VISIBLE);
}
}
});
}}
