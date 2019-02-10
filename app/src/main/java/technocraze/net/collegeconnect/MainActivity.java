package technocraze.net.collegeconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button lostAndFoundBtn, canteenBtn, cleaningBtn, eventBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lostAndFoundBtn = (Button) findViewById(R.id.lostAndFoundBtn);
        canteenBtn = (Button) findViewById(R.id.canteenBtn);
        cleaningBtn = (Button) findViewById(R.id.cleaningBtn);
        eventBtn = (Button) findViewById(R.id.eventBtn);
        cleaningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,clean.class);
                startActivity(in);
            }
        });
        canteenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,canteen.class);
                startActivity(in);
            }
        });
        lostAndFoundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,lostAndFound.class );
                startActivity(intent);
            }
        });
        eventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,event.class);
                startActivity(in);
            }
        });

    }
}
