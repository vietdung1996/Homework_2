package com.vietdung.homework2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.vietdung.homework2.R;

public class MainActivity extends AppCompatActivity {
    EditText et_Ten;
    Button btn_Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TenSV = et_Ten.getText().toString();
                if ( TenSV.isEmpty() ) {
                    // Kiểm tra họ tên đã được điền hay chưa
                   Toast.makeText(MainActivity.this,"Vui lòng nhập họ tên",Toast.LENGTH_SHORT).show();
                } else {
                    //Chuyển màn hình
                    Intent intent = new Intent(MainActivity.this,StudentActivity.class);
                    intent.putExtra("TenSinhVien",TenSV);
                    startActivity(intent);
                }
            }
        });
    }

    private void addControls() {
        et_Ten = findViewById(R.id.etTen);
        btn_Next = findViewById(R.id.btnNext);
    }
}
