package com.indoor.woopy_android.view.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.ActivityUserLoginBinding
import com.indoor.woopy_android.view.user.viewmodel.UserLoginViewModel

class UserLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserLoginBinding
    private lateinit var loginViewModel : UserLoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_user_login
        )

        observeViewModel()

        binding.backBtn.setOnClickListener {
            super.onBackPressed()
        }


        binding.tvUserSignUp.setOnClickListener {
            val intent = Intent(this@UserLoginActivity, UserSignupUserActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)

        }

    }

    private fun observeViewModel() = with(loginViewModel) {
        onClickLSignInEvent.observe(this@UserLoginActivity) {
            startActivity(Intent(this@UserLoginActivity, MainActivity::class.java))
            finish()
        }
    }
}