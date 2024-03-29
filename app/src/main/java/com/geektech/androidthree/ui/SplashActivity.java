package com.geektech.androidthree.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geektech.androidthree.App;
import com.geektech.androidthree.ui.main.MainActivity;
import com.geektech.androidthree.ui.onBoard.OnBoardActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        checkIsFirstLaunch();
    }

    private void checkIsFirstLaunch(){
        if (App.getPreferenceHelper().isFirstLaunch()){
            App.getPreferenceHelper().setIsFirstLaunch();
            OnBoardActivity.start(this);

        } else {
            MainActivity.start(this);
        }
        finish();
    }
}
