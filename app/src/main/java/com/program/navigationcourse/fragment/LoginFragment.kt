package com.program.navigationcourse.fragment

import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.navigation.ActivityNavigator
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.program.navigationcourse.R
import com.program.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment:BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_login
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toRegisterPage.setOnClickListener {
            //两个共享元素
            //头像
            val imagePair = Pair<View,String>(userAvatarIv,"userAvatarTn")
            //用户名
            val userNamePair = Pair<View,String>(userNameInput,"userNameTn")
//            val extras :FragmentNavigator.Extras=
//                FragmentNavigatorExtras(userAvatarIv to "userAvatarTn")
            val extras :FragmentNavigator.Extras=
                            FragmentNavigatorExtras(imagePair,userNamePair)
            //数据
            val bundle = Bundle()
            bundle.putString("userName",userNameInput.text.toString())
                //跳转到注册界面
            findNavController().navigate(R.id.to_register_fragment,
            bundle,
            null,
                extras)
        }
        rootView.toForgetPage.setOnClickListener {
            //跳转到找回密码界面
            findNavController().navigate(R.id.to_forget_fragment)
        }
        rootView.toAgreementPage.setOnClickListener {
            val ImagePair = androidx.core.util.Pair<View,String>(userAvatarIv,"userAvatarTn")

            val userNamePair = androidx.core.util.Pair<View,String>(userNameInput,"userNameTn")
            var options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                requireActivity(),
                ImagePair,userNamePair
            )
            val extras = ActivityNavigator.Extras.Builder()
                .setActivityOptions(options)
                .build()

            val bundle = Bundle()
            bundle.putString("userName",userNameInput.text.toString())
            //跳转到用户协议界面
            findNavController().navigate(R.id.to_agreement_activity,
                bundle,
                null,
                extras
            )
        }

    }
}