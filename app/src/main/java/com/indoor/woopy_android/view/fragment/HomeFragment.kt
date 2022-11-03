package com.indoor.woopy_android.view.fragment


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.indoor.woopy_android.R


class HomeFragment : Fragment() {

    companion object{
        const val TAG: String = "로그"
        fun newInstance() : HomeFragment{
            return HomeFragment()
        }
    }

    //메모리에 올라갔을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"homeFragment - onCreate() called")
    }
    //프레그먼트를 안고 있는 엑티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"homeFragment - onAttach() called")
    }
    //뷰가 생성되었을 때
    //프로그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"homeFragment - onCreateView() called")

        val view=inflater.inflate(R.layout.fragment_home,container,false)

        return view
    }


}