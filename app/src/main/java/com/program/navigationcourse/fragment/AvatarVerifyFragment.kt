package com.program.navigationcourse.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.program.navigationcourse.R
import com.program.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_avatar_verify.view.*

class AvatarVerifyFragment:BaseFragment() {

    override fun getLayoutResId(): Int {
        return R.layout.fragment_avatar_verify
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.avatarVerifyBtn.setOnClickListener {
            findNavController().navigate(R.id.to_login_page)
        }
    }

}