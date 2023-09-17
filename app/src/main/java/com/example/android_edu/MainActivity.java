package com.example.android_edu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloTextView;
    private Button button;
    private boolean isTextVisible = true; // 텍스트 보임 여부를 추적하는 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // XML 레이아웃에서 뷰를 찾습니다.
        helloTextView = findViewById(R.id.helloTextView);
        button = findViewById(R.id.button);

        // 버튼 클릭 이벤트 리스너를 설정합니다.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼이 클릭되었을 때 실행될 코드를 작성합니다.
                if (!isTextVisible) {
                    helloTextView.setText(""); // 텍스트를 비웁니다.
                } else {
                    helloTextView.setText("Hello, Button Clicked!");
                }
                isTextVisible = !isTextVisible; // 텍스트 보임 여부를 토글합니다.
            }
        });
    }
}