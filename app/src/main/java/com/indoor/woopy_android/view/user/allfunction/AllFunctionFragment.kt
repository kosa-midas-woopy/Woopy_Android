package com.indoor.woopy_android.view.user.allfunction


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.indoor.woopy_android.EditOptionActivity
import com.indoor.woopy_android.R
import com.indoor.woopy_android.activity_option
import com.indoor.woopy_android.databinding.ActivityAdminLoginBinding
import com.indoor.woopy_android.databinding.FragmentAllFunctionFragmentBinding
import com.indoor.woopy_android.view.admin.AdminSignupActivity


class AllFunctionFragment : Fragment() {

    companion object{
        const val TAG: String = "로그"
        fun newInstance() : AllFunctionFragment {
            return AllFunctionFragment()
        }
    }
    private lateinit var binding: FragmentAllFunctionFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            Activity(),
            R.layout.activity_option
        )
        Log.d(TAG,"AllFunctionFragment - onCreate() called")
        binding.option.setOnClickListener {
            val intent = Intent(context, activity_option::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

    }
    //프레그먼트를 안고 있는 엑티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"AllFunctionFragment - onAttach() called")
    }

    //뷰가 생성되었을 때
    //프로그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "AllFunctionFragment - onCreateView() called")

        return inflater.inflate(R.layout.fragment_all_function_fragment, container, false)
    }
}