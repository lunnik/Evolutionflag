package com.lionsquare.evolutionflag.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lionsquare.evolutionflag.R;
import com.lionsquare.evolutionflag.databinding.ActivityCategoryBinding;
import com.lionsquare.evolutionflag.utils.Preferences;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityCategoryBinding binding;
    private Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_category);
        preferences = new Preferences(this);
        initView();
        initSetUp();
    }

    void initView() {
        binding.acBtnMale.setOnClickListener(this);
        binding.acBtnFame.setOnClickListener(this);
        binding.acBtnMix.setOnClickListener(this);
    }

    void initSetUp() {
        if (preferences.getTypeLogin() != 0) {
            Intent iMenu = new Intent(this, MenuActivity.class);
            startActivity(iMenu);
            finish();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ac_btn_male:
                preferences.setProfil(1);
                break;
            case R.id.ac_btn_fame:
                preferences.setProfil(2);
                break;
            case R.id.ac_btn_mix:
                preferences.setProfil(3);
                break;
        }
        Intent iMenu = new Intent(this, MenuActivity.class);
        startActivity(iMenu);
        finish();

    }
}
