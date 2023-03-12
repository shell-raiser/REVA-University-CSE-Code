package com.example.radiobutton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
public class yearwiseActivity extends AppCompatActivity {
 CheckBox ch, ch1, ch2, ch3;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_yearwise);
 // Finding CheckBox by its unique ID
 ch=(CheckBox)findViewById(R.id.checkBox);
 ch1=(CheckBox)findViewById(R.id.checkBox2);
 ch2=(CheckBox)findViewById(R.id.checkBox3);
 ch3=(CheckBox)findViewById(R.id.checkBox4);
 ch.setOnCheckedChangeListener(new 
CompoundButton.OnCheckedChangeListener() {
 @Override
 public void onCheckedChanged(CompoundButton compoundButton, 
boolean b) {
 ch1.setChecked(false);
 ch2.setChecked(false);
 ch3.setChecked(false);
 }
 });
 ch1.setOnCheckedChangeListener(new 
CompoundButton.OnCheckedChangeListener() {
 @Override
 public void onCheckedChanged(CompoundButton compoundButton, 
boolean b) {
 ch.setChecked(false);
 ch2.setChecked(false);
 ch3.setChecked(false);
 }
 });
 ch2.setOnCheckedChangeListener(new 
CompoundButton.OnCheckedChangeListener() {
 @Override
 public void onCheckedChanged(CompoundButton compoundButton, 
boolean b) {
 ch.setChecked(false);
 ch1.setChecked(false);
 ch3.setChecked(false);
 }
 });
 ch3.setOnCheckedChangeListener(new 
CompoundButton.OnCheckedChangeListener() {
 @Override
 public void onCheckedChanged(CompoundButton compoundButton, 
boolean b) {
 ch.setChecked(false);
 ch1.setChecked(false);
 ch2.setChecked(false);
 }
 });
 }
 // This function is invoked when the button is pressed.
 public void Check(View v)
 {
 String msg="";
 // Concatenation of the checked options in if
 // isChecked() is used to check whether
 // the CheckBox is in true state or not.
 if(ch.isChecked()) {
 msg = msg + ch.getText();
 Toast.makeText(this, msg +" " + "is Selected", 
Toast.LENGTH_SHORT).show();
 }
 else if (ch1.isChecked()) {
 msg = msg + ch1.getText();
 Toast.makeText(this, msg +" " + "is Selected", 
Toast.LENGTH_SHORT).show();
 } else if (ch2.isChecked()) {
 msg = msg + ch2.getText();
 Toast.makeText(this, msg +" " + "is Selected", 
Toast.LENGTH_SHORT).show();
 } else if (ch3.isChecked()) {
 msg = msg + ch3.getText();
 Toast.makeText(this, msg +" " + "is Selected", 
Toast.LENGTH_SHORT).show();
 }
 else
 // Toast is created to display the
 // message using show() method.
 Toast.makeText(this, msg +" " + " Nothing is selected, kindly 
select one from above checkbox",
 Toast.LENGTH_LONG).show();
 }
}
