package com.indoor.woopy_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indoor.woopy_android.databinding.ActivityEditOptionBinding

class EditOptionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditOptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_edit_option
        )
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, activity_option::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        binding.sumbit.setOnClickListener {
            val intent = Intent(this, activity_option::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}