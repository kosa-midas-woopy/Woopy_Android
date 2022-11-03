package com.indoor.woopy_android.view.admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.ActivityAdminSignupBinding
import com.indoor.woopy_android.view.user.UserLoginActivity
import com.indoor.woopy_android.view.user.UserSignupOfficeActivity

class AdminSignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminSignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_admin_signup
        )
        binding.btnAdminSignup.setOnClickListener {

        }

        binding.tvOfficeLogin.setOnClickListener {
            val intent = Intent(this@AdminSignupActivity, AdminLoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        binding.backBtn.setOnClickListener {
            super.onBackPressed()
        }
    }
}










