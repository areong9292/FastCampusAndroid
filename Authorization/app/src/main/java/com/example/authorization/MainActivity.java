package com.example.authorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int requestCode = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 권한 받았는지 여부 체크
        // 권한이 없다면
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
        {
            // 권한을 설명해줘야 할 필요가 있는지 체크
            // 이 권한이 이러한 이유로 필요하다는 안내 메시지
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.CAMERA))
            {
                // 권한 설명
            }
            else
            {
                // 요청하고자 하는 권한을 스트링 배열로 보낸다
                // requestCode를 보냄으로써 어떤 요청이 어떤 권한인지 체크할 수 있다
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, requestCode);
            }
        }
    }

    // 사용자 요청 응답
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // 내가 보낸 요청이라면
        if(requestCode == this.requestCode)
        {
            // 0번째 권한이 획득되었다면
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Log.d("permission", "PERMISSION_GRANTED");
            }
            else
            {
                Log.d("permission", "PERMISSION_DENIED");
            }
        }
    }
}
