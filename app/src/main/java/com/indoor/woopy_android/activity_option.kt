package com.indoor.woopy_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.databinding.ActivityEditOptionBinding
import com.indoor.woopy_android.databinding.ActivityMainBinding
import com.indoor.woopy_android.databinding.ActivityOptionBinding

class activity_option : AppCompatActivity() {
    private lateinit var binding: ActivityOptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_option
        )
        binding.edit.setOnClickListener {
            val intent = Intent(this, EditOptionActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}