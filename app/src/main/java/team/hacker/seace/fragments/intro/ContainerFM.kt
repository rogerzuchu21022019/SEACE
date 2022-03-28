package team.hacker.seace.fragments.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import team.hacker.seace.R
import team.hacker.seace.adapters.ViewPagerAdapter
import team.hacker.seace.databinding.FragmentContainerBinding

class ContainerFM : Fragment(){
    lateinit var fmContainerBinding: FragmentContainerBinding
    lateinit var navController: NavController
    companion object {
        private const val FRAGMENT_INTRO1 : Int = 0
        const val FRAGMENT_INTRO2 : Int = 1
        const val FRAGMENT_INTRO3 : Int = 2
        var mFragmentCurrent = FRAGMENT_INTRO1
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fmContainerBinding = FragmentContainerBinding.inflate(layoutInflater)
        initViewPager2(container!!.rootView)
        return fmContainerBinding.root
    }

    fun initViewPager2(view : View){
        val adapter = ViewPagerAdapter(this)
        fmContainerBinding.viewPager2.adapter = adapter
        fmContainerBinding.ci3.setViewPager(fmContainerBinding.viewPager2)
        fmContainerBinding.viewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when(position)
                {
                    1 ->{
                        mFragmentCurrent = FRAGMENT_INTRO2
                        if(mFragmentCurrent != FRAGMENT_INTRO2){
                            fmContainerBinding.viewPager2.currentItem = FRAGMENT_INTRO2
                            mFragmentCurrent = FRAGMENT_INTRO2
                        }
                    }
                    2 -> {
                        mFragmentCurrent = FRAGMENT_INTRO3
                        if(fmContainerBinding.viewPager2.currentItem == FRAGMENT_INTRO3){
                            val a : View = view.findViewById(R.id.acbStart)
                            a.setOnClickListener{
                                navController = findNavController()
                                val action = ContainerFMDirections.actionContainerFMToSignInFM()
                                navController.navigate(action)
                            }
                        }
                    }
                }
            }
        })


    }



}