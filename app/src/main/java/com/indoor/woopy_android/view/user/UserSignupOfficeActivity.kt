package com.indoor.woopy_android.view.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.ActivityUserLoginBinding
import com.indoor.woopy_android.databinding.ActivityUserSignupOfficeBinding

class UserSignupOfficeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserSignupOfficeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_user_signup_office
        )

        binding.btnUserSignup.setOnClickListener {

        }

        binding.backBtn.setOnClickListener {
            super.onBackPressed()
        }
    }
}