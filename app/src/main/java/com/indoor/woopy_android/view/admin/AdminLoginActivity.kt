package com.indoor.woopy_android.view.admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.ActivityAdminLoginBinding
import com.indoor.woopy_android.databinding.ActivityUserSignupOfficeBinding
import com.indoor.woopy_android.view.user.UserSignupUserActivity

class AdminLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_admin_login
        )

        binding.backBtn.setOnClickListener {
            super.onBackPressed()
        }

        binding.btnAdminLogin.setOnClickListener {

        }

        binding.tvAdminSignUp.setOnClickListener {
            val intent = Intent(this@AdminLoginActivity, AdminSignupActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)

        }
    }
}



