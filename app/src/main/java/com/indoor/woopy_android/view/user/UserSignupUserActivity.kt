package com.indoor.woopy_android.view.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.ActivityUserSignupUserBinding

class UserSignupUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserSignupUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_user_signup_user
        )

        binding.btnCheck.setOnClickListener {

        }

        binding.btnUserNext.setOnClickListener {
            val intent = Intent(this@UserSignupUserActivity, UserSignupOfficeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        binding.tvUserLogin.setOnClickListener {
            val intent = Intent(this@UserSignupUserActivity, UserLoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        binding.backBtn.setOnClickListener {
            super.onBackPressed()
        }
    }
}