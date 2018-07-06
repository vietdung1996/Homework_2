package com.vietdung.homework2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.vietdung.homework2.R;
import com.vietdung.homework2.model.InforStudent;

public class StudentActivity extends AppCompatActivity {
    TextView tv_TenSV;
    EditText et_QueQuan,et_NgaySinh,et_GioiTinh,et_KhoaHoc,et_Lop;
    Button btn_NextInfor;
    InforStudent inforStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        addControls();
        addEvents();

        Intent intent =getIntent();
        String TenSV = intent.getStringExtra("TenSinhVien");
        tv_TenSV.setText(TenSV);
    }

    private void addEvents() {
        btn_NextInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PutData2();
            }
        });
    }

    //Truyền dữ liệu kiểu Serializable
    public void PutData(){
        Intent i =  new Intent(StudentActivity.this,StudentInforActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("TenSV",tv_TenSV.getText().toString());
        bundle.putString("QueQuan",et_QueQuan.getText().toString());
        bundle.putString("NgaySinh",et_NgaySinh.getText().toString());
        bundle.putString("GioiTinh",et_GioiTinh.getText().toString());
        bundle.putString("KhoaHoc",et_KhoaHoc.getText().toString());
        bundle.putString("Lop",et_Lop.getText().toString());
        i.putExtra("Bundle",bundle);
        startActivity(i);
    }
    // Truyền dữ liệu kiểu Parcelabale
    private void PutData2(){
        String TenSV = tv_TenSV.getText().toString();
        String Quequan = et_QueQuan.getText().toString();
        String NgaySinh = et_NgaySinh.getText().toString();
        String GioiTinh = et_GioiTinh.getText().toString();
        String Lop = et_Lop.getText().toString();
        String KhoaHoc = et_KhoaHoc.getText().toString();

        if (TenSV.isEmpty() || Quequan.isEmpty() || NgaySinh.isEmpty() || GioiTinh.isEmpty() || Lop.isEmpty() || KhoaHoc.isEmpty()) {
            //Kiểm tra thông tin có được điền đầy đủ
            Toast.makeText(StudentActivity.this,"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
        } else {
            //Chuyển màn hình
            inforStudent = new InforStudent(TenSV,Quequan,NgaySinh,GioiTinh,Lop,KhoaHoc);
            Intent intent = new Intent(StudentActivity.this,StudentInforActivity.class);
            intent.putExtra("parcelable",inforStudent);
            startActivity(intent);
        }

    }

    private void addControls() {
        tv_TenSV = findViewById(R.id.tvTenSV);
        et_QueQuan = findViewById(R.id.etQueQuan);
        et_NgaySinh = findViewById(R.id.etNgaySinh);
        et_GioiTinh = findViewById(R.id.etGioiTinh);
        et_KhoaHoc = findViewById(R.id.etKhoaHoc);
        et_Lop = findViewById(R.id.etLop);
        btn_NextInfor = findViewById(R.id.btnNextInfor);
    }
}
