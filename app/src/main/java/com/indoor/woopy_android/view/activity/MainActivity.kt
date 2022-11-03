package com.indoor.woopy_android.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.ActivityMainBinding
import com.indoor.woopy_android.view.fragment.*
import javax.xml.datatype.DatatypeFactory.newInstance

class MainActivity : AppCompatActivity() {

    private lateinit var requestFragment: RequestFragment
    private lateinit var homeFragment: HomeFragment
    private lateinit var allFunctionFragment: AllFunctionFragment
    private lateinit var statisticsFragment: StatisticsFragment
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        homeFragment = HomeFragment.newInstance()
        binding.bottomNav.setOnNavigationItemSelectedListener (onBottomNavItemSelectedListener)
    }

    private val onBottomNavItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    homeFragment = HomeFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragments_frame, homeFragment).commit()

                }
                R.id.menu_request -> {
                    requestFragment = RequestFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragments_frame, requestFragment).commit()


                }
                R.id.menu_statistics -> {
                    statisticsFragment = StatisticsFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragments_frame, statisticsFragment).commit()


                }
                R.id.menu_all_function -> {
                    allFunctionFragment=AllFunctionFragment.newInstance()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragments_frame,allFunctionFragment).commit()
                }

            }
            true
        }
}