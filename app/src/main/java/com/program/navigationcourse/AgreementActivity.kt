package com.program.navigationcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agreement.*
import kotlinx.android.synthetic.main.fragment_login.*

class AgreementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agreement)
        window.setBackgroundDrawableResource(R.color.transparent)
        val userName =intent.getStringExtra("userName")
        agrUserNameInp.setText(userName)
    }

}