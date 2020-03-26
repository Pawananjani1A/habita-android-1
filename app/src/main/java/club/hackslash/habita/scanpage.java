package club.hackslash.habita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class scanpage extends AppCompatActivity {
    public static final int CAMERA_REQUEST = 99;
    ImageView scanPlant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanpage);
        scanPlant = findViewById(R.id.imageView2);


    }
    public void openCamera(View view) {


        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);


        startActivityForResult(intent, CAMERA_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA_REQUEST) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            scanPlant.setImageBitmap(bitmap);
        }

    }


}
