package com.indoor.woopy_android.view.user.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indoor.woopy_android.network.RetrofitService
import com.indoor.woopy_android.network.util.SingleLiveEvent
import com.indoor.woopy_android.server.request.UserSIgnInResquest
import com.indoor.woopy_android.server.response.UserSIgnInResponse
import retrofit2.Call
import retrofit2.Response
import kotlin.math.log

class UserLoginViewModel(private val application : Application):ViewModel() {
    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    val onClickLSignInEvent = SingleLiveEvent<Unit>()


    fun onClickLogin() {
        val loginData = RetrofitService.userAPI.userSignIn(
            UserSIgnInResquest(email.value.toString(), password.value.toString())
        )
        loginData.enqueue(object : retrofit2.Callback<UserSIgnInResponse> {
            override fun onResponse(
                call: Call<UserSIgnInResponse>,
                response: Response<UserSIgnInResponse>
            ) {
                if(response.isSuccessful) {
                    // 로그인 성공,
                    Log.d("LOGIN TESTING", "SUCCESSED")
                    onClickLSignInEvent.call()
                }
            }

            override fun onFailure(call: Call<UserSIgnInResponse>, t: Throwable) {
                // 로그인 실패
            }

        })
    }
}