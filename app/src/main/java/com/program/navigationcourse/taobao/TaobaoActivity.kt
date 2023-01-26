package com.program.navigationcourse.taobao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.program.navigationcourse.R
import kotlinx.android.synthetic.main.activity_taobao.*

class TaobaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taobao)
        initView()
    }

    private fun initView() {
        //方法一：去fragment管理器通过id找到NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navigition_host_fragment)  as NavHostFragment
        //方法二：把androidx.fragment.app.FragmentContainerView改成fragment
//        val navController = findNavController(R.id.navigition_host_fragment)


        bottomNavigationView.setupWithNavController(navHostFragment.navController)

    }
}