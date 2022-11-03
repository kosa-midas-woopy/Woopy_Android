package com.indoor.woopy_android.view.user.home


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.indoor.woopy_android.R
import com.indoor.woopy_android.databinding.FragmentHomeBinding
import java.util.*


class HomeFragment : Fragment() {

    var dateList = arrayListOf<Date>()
    private var listAdapter = WeeklyCalendarAdapter(dateList)
    lateinit var weeklyCalendarRecyclerview : RecyclerView
    lateinit var mLayoutManager: LinearLayoutManager
    lateinit var binding : FragmentHomeBinding


    companion object{
        const val TAG: String = "로그"
        fun newInstance() : HomeFragment {
            return HomeFragment()
        }
    }

    private fun setCalendarListView() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
        val lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)

        binding.txtDateTitle.text = calendar.get(Calendar.YEAR).toString()+"년 "+(calendar.get(Calendar.MONTH)+1)+"월"

        for(i: Int in 1..lastDayOfMonth) {
            val date : java.util.Date = GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, i).time
            val day : String = when(date.day) {
                0 -> "SUN"
                1 -> "MON"
                2 -> "TUE"
                3 -> "WED"
                4 -> "THU"
                5 -> "FRI"
                6 -> "SAT"
                else -> "NON"
            }
            dateList.add(Date(day, i.toString()))
        }
        weeklyCalendarRecyclerview.adapter = listAdapter
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

        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_home, container, false)

        weeklyCalendarRecyclerview = binding.recyclerviewWeeklyCalendar
        mLayoutManager = LinearLayoutManager(context)
        mLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        weeklyCalendarRecyclerview.layoutManager = mLayoutManager

        setCalendarListView()


        return binding.root
    }


}