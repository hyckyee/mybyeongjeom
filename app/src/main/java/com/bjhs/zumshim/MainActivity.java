package com.bjhs.zumshim;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView selectedMeathod;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextmeathodloginbutton = findViewById(R.id.next_login_meathod_button);
        nextmeathodloginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 클릭되었을 때 실행될 동작 정의
                Toast.makeText(MainActivity.this, "버튼이 클릭되었습니다!", Toast.LENGTH_SHORT).show();
            }
        });
        selectedMeathod = findViewById(R.id.selected_meathod);
        radioGroup = findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_button_phone) {
                    selectedMeathod.setText("전화번호");
                } else if (checkedId == R.id.radio_button_email) {
                    selectedMeathod.setText("이메일");
                } else if (checkedId == R.id.radio_button_UID) {
                    selectedMeathod.setText("UID");
                } else if (checkedId == R.id.radio_button_id) {
                    selectedMeathod.setText("ID");
                }
            }
        });
    }
}
