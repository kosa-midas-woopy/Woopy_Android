package com.indoor.woopy_android.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.ActivitySelectAccountTypeBinding
import com.indoor.woopy_android.view.admin.AdminLoginActivity
import com.indoor.woopy_android.view.user.UserLoginActivity
import com.indoor.woopy_android.view.user.UserSignupOfficeActivity

class SelectAccountTypeActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelectAccountTypeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_account_type)

        binding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_select_account_type
        )

        binding.bgUser.setOnClickListener {
            val intent = Intent(this@SelectAccountTypeActivity, UserLoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        binding.bgAdmin.setOnClickListener {
            val intent = Intent(this@SelectAccountTypeActivity, AdminLoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}