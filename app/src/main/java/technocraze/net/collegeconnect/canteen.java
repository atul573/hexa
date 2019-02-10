package technocraze.net.collegeconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class canteen extends AppCompatActivity {
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference ref = db.getReference();
Button b4;
int count =1,time=0,total = 0;
EditText nam;
Spinner spin;
CheckBox c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        b4 = findViewById(R.id.button4);
        nam = findViewById(R.id.editText3);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        c6 = findViewById(R.id.checkBox6);
        spin = findViewById(R.id.spinner);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(canteen.this,"Rs 10",Toast.LENGTH_SHORT).show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(canteen.this,"Rs 20",Toast.LENGTH_SHORT).show();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(canteen.this,"Rs 30",Toast.LENGTH_SHORT).show();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(canteen.this,"Rs 40",Toast.LENGTH_SHORT).show();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(canteen.this,"Rs 50",Toast.LENGTH_SHORT).show();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(canteen.this,"Rs 60",Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nam.getText().toString();
                String can = spin.getSelectedItem().toString();
                if(c1.isChecked()) {
                    time++;
                    total+=10;
                    ref.child("canteen").child(Integer.toString(count)).child(can).child(c1.getText().toString()).child("name").setValue(name);
                }if(c2.isChecked()) {
                    time++;
                    total+=20;
                    ref.child("canteen").child(Integer.toString(count)).child(can).child(c2.getText().toString()).child("name").setValue(name);
                }if(c3.isChecked()) {
                    time++;
                    total+=30;
                    ref.child("canteen").child(Integer.toString(count)).child(can).child(c3.getText().toString()).child("name").setValue(name);
                }if(c4.isChecked()) {
                    time++;
                    total+=40;
                    ref.child("canteen").child(Integer.toString(count)).child(can).child(c4.getText().toString()).child("name").setValue(name);
                }if(c5.isChecked()) {
                    time++;
                    total+=50;
                    ref.child("canteen").child(Integer.toString(count)).child(can).child(c5.getText().toString()).child("name").setValue(name);
                }if(c6.isChecked()) {
                    time++;
                    total+=60;
                    ref.child("canteen").child(Integer.toString(count)).child(can).child(c6.getText().toString()).child("name").setValue(name);
                }Toast.makeText(canteen.this,"order placed ready in "+ Integer.toString(time*5)+"min total cost is Rs"+Integer.toString(total),Toast.LENGTH_LONG).show();
                count+=1;
            }
        });
    }
}
