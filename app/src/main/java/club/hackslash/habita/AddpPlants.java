package club.hackslash.habita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddpPlants extends AppCompatActivity {
public  Button nextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addp_plants);
        nextPage=(Button)findViewById(R.id.next_page);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri;
                Intent intent = new Intent(AddpPlants.this, scanpage.class);
                startActivity(intent);
            }
        });


    }
}
