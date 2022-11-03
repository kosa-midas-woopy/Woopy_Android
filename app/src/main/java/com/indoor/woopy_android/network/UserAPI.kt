package com.indoor.woopy_android.network

import com.indoor.woopy_android.server.request.AdminSIgnUpResquest
import com.indoor.woopy_android.server.request.AdminSignInRequest
import com.indoor.woopy_android.server.request.UserSIgnInResquest
import com.indoor.woopy_android.server.request.UserSIgnUpResquest
import com.indoor.woopy_android.server.response.AdminSIgnUpResponse
import com.indoor.woopy_android.server.response.AdminSignInResponse
import com.indoor.woopy_android.server.response.UserSIgnInResponse
import com.indoor.woopy_android.server.response.UserSIgnUpResponse
import retrofit2.http.POST
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*


interface UserAPI {

    // 관리자 - 회원가입
    @POST("")
    fun adminSignUp(
        @Body signupInfo : AdminSIgnUpResquest
    ): Call<AdminSIgnUpResponse>

    // 관리자 - 로그인
    @POST("")
    fun adminSignIn(
        @Body signinInfo : AdminSignInRequest
    ): Call<AdminSignInResponse>

    // 개인 가입
    @POST("")
    fun userSignUp(
        @Body signupInfo: UserSIgnUpResquest
    ): Call<UserSIgnUpResponse>

    // 개인 가입
    @POST("")
    fun userSignIn(
        @Body signinInfo: UserSIgnInResquest
    ): Call<UserSIgnInResponse>


}