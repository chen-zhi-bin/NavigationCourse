package com.program.navigationcourse.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.program.navigationcourse.R
import com.program.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_forget.view.*

class ForgetFragment : BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_forget
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.backBtnView.setOnClickListener {
//            findNavController().navigateUp()//返回(角落？标题栏之类 的返回键适用)
            findNavController().popBackStack()//返回(按返回键时用)
        }
    }
}