package com.vietdung.homework2.model;

import android.os.Parcel;
import android.os.Parcelable;

public class InforStudent implements Parcelable {
    private String tenSV,queQuan,ngaySinh,gioiTinh,Lop,khoaHoc;



    protected InforStudent(Parcel in) {
        this.tenSV = in.readString();
        this.queQuan = in.readString();
        this.ngaySinh = in.readString();
        this.gioiTinh = in.readString();
        this.Lop = in.readString();
        this.khoaHoc = in.readString();
    }

    public static final Creator<InforStudent> CREATOR = new Creator<InforStudent>() {
        @Override
        public InforStudent createFromParcel(Parcel in) {
            return new InforStudent(in);
        }

        @Override
        public InforStudent[] newArray(int size) {
            return new InforStudent[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(tenSV);
        parcel.writeString(queQuan);
        parcel.writeString(ngaySinh);
        parcel.writeString(gioiTinh);
        parcel.writeString(Lop);
        parcel.writeString(khoaHoc);
    }

    public InforStudent(String tenSV, String queQuan, String ngaySinh, String gioiTinh, String lop, String khoaHoc) {
        this.tenSV = tenSV;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.Lop = lop;
        this.khoaHoc = khoaHoc;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        tenSV = tenSV;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        gioiTinh = gioiTinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        khoaHoc = khoaHoc;
    }
}
