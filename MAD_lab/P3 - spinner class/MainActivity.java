public package com.example.program12;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements 
AdapterView.OnItemSelectedListener {
 String[] Branches = { "CSE", "AIDS", "IOT", "ECE", "CNIT" };
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 Spinner spin = (Spinner) findViewById(R.id.spinner1);
 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
android.R.layout.simple_spinner_item, Branches);
 
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_it
em);
 spin.setAdapter(adapter);
 spin.setOnItemSelectedListener(this);
 }
 @Override
 public void onItemSelected(AdapterView<?> arg0, View arg1, int 
position,long id) {
 Toast.makeText(getApplicationContext(), "Selected User: 
"+Branches[position] ,Toast.LENGTH_SHORT).show();
 }
 @Override
 public void onNothingSelected(AdapterView<?> arg0) {
 // TODO - Custom Code
 }
} {
    
}
