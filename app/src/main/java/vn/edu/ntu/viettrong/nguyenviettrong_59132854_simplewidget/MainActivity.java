package vn.edu.ntu.viettrong.nguyenviettrong_59132854_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String textXacNhan;
    EditText edtTen, edtNgaySinh, edtSoThichKhac;
    RadioGroup radgGioiTinh;
    CheckBox chCafe, chPhim, chNhac, chNha, chNau;
    Button bttXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    private void addView(){
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.editNgaySinh);
        radgGioiTinh = findViewById(R.id.radgGioiTinh);
        chPhim = findViewById(R.id.checkPhim);
        chNhac = findViewById(R.id.checkNhac);
        chCafe = findViewById(R.id.checkCafe);
        chNha = findViewById(R.id.checkNha);
        chNau = findViewById(R.id.checkNau);
        edtSoThichKhac = findViewById(R.id.editSoThichKhac);
        bttXacNhan = findViewById(R.id.bttXacNhan);
    }
    private void addEvent(){
        bttXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacNhan();
            }
        });
    }
    private void xacNhan(){
        textXacNhan = edtTen.getText().toString() + "\n" +
                "Ngày sinh: " + edtNgaySinh.getText().toString() + "\n" +
                "Giới tính: ";
        if(radgGioiTinh.getCheckedRadioButtonId() == R.id.rdbNam)
            textXacNhan += "Nam" + "\n" + "Sở thích: ";
        else
            textXacNhan += "Nữ" + "\n" + "Sở thích: ";

        if (chPhim.isChecked())
            textXacNhan += "Xem phim; ";
        if (chNhac.isChecked())
            textXacNhan += "Nghe nhạc; ";
        if (chCafe.isChecked())
            textXacNhan += "Đi cà phê với bạn; ";
        if (chNha.isChecked())
            textXacNhan += "Ở nhà một mình; ";
        if (chNau.isChecked())
            textXacNhan += "Vào bếp nấu ăn; ";

        textXacNhan += edtSoThichKhac.getText().toString();
        Toast.makeText(getApplicationContext(), textXacNhan, Toast.LENGTH_SHORT).show();
    }
}
