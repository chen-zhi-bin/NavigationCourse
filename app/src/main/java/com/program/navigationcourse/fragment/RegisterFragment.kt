package com.program.navigationcourse.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionInflater
import com.program.navigationcourse.R
import com.program.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*

class RegisterFragment:BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_register
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireContext())
            .inflateTransition(R.transition.shared_image)
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toAvatarVerifyBtn.setOnClickListener {
            findNavController().navigate(R.id.avatar_verify_fragment)
        }
        val userName:String? = arguments?.getString("userName")
        println(userName)
        rootView.regUserNameInput.setText(userName)
    }
}