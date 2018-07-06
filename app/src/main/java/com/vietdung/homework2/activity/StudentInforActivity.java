package com.vietdung.homework2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.vietdung.homework2.R;
import com.vietdung.homework2.model.InforStudent;

public class StudentInforActivity extends AppCompatActivity {
    TextView tv_TenSV, tv_QueQuan, tv_Gioitinh, tv_KhoaHoc,tv_Lop,tv_NgaySinh;
    InforStudent inforStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);

        addControls();
        addEvents();
    }

    private void addEvents() {
        getData2();

    }
    // Lấy dữ liểu kiểu Serializable
    private void getData(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle");
        tv_TenSV.setText("Tên sinh viên: "+bundle.getString("TenSV"));
        tv_Gioitinh.setText("Giới tính: "+bundle.getString("GioiTinh"));
        tv_QueQuan.setText("Quê quán: "+bundle.getString("QueQuan"));
        tv_NgaySinh.setText("Ngày sinh: "+bundle.getString("NgaySinh"));
        tv_Lop.setText("Lớp: "+bundle.getString("Lop"));
        tv_KhoaHoc.setText("Khóa học: "+bundle.getString("KhoaHoc"));

    }
    //Lấy dữ liệu kiểu Parcelable
    private void getData2(){
        Intent intent = getIntent();
        inforStudent = intent.getParcelableExtra("parcelable");
        if(inforStudent != null){
            tv_TenSV.setText("Tên: "+inforStudent.getTenSV());
            tv_Gioitinh.setText("Giới tính: "+inforStudent.getGioiTinh());
            tv_QueQuan.setText("Quê quán: "+inforStudent.getQueQuan());
            tv_NgaySinh.setText("Ngày sinh: "+inforStudent.getNgaySinh());
            tv_Lop.setText("Lớp: "+ inforStudent.getLop());
            tv_KhoaHoc.setText("Khóa học: "+inforStudent.getKhoaHoc());

        }
    }

    private void addControls() {
        tv_TenSV  = findViewById(R.id.tvTenSV);
        tv_Gioitinh = findViewById(R.id.tvGioiTinh);
        tv_NgaySinh = findViewById(R.id.tvNgaySinh);
        tv_QueQuan = findViewById(R.id.tvQueQuan);
        tv_KhoaHoc = findViewById(R.id.tvKhoaHoc);
        tv_Lop = findViewById(R.id.tvLop);
    }
}
