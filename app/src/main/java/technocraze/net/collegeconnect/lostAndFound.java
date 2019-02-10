package technocraze.net.collegeconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lostAndFound extends AppCompatActivity {
Button lost,found;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_and_found);
        lost = findViewById(R.id.button);
        found = findViewById(R.id.button2);
        lost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(lostAndFound.this,lost.class);
                startActivity(in);
            }
        });
        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(lostAndFound.this,found.class);
                startActivity(in);
            }
        });
    }
}
