package com.indoor.woopy_android.server.request

import java.text.FieldPosition

data class UserSIgnUpResquest (
    var email : String,
    var password : String,
    var name : String,
    var companyName : String,
    var department : String,
    var position: String
)