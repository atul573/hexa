package technocraze.net.collegeconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class lost extends AppCompatActivity {
    int count;
FirebaseDatabase db = FirebaseDatabase.getInstance();
DatabaseReference ref = db.getReference();
    EditText nam,pho,descr;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);
        nam = findViewById(R.id.editText);
        pho = findViewById(R.id.editText2);
        count=1;
        descr = findViewById(R.id.editText4);
        b1 = findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref.child("lost").child("Users").child(Integer.toString(count)).child("name").setValue(nam.getText().toString());
                ref.child("lost").child("Users").child(Integer.toString(count)).child("pho").setValue(pho.getText().toString());
                ref.child("lost").child("Users").child(Integer.toString(count)).child("descr").setValue(descr.getText().toString());
                count+=1;
                Toast.makeText(lost.this,"inserted successfully go to room 123",Toast.LENGTH_LONG).show();
            }
        });
    }
}
