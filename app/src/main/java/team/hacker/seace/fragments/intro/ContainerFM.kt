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
import team.hacker.seace.databinding.FragmentContainerFmBinding

class ContainerFM : Fragment(){
    lateinit var containerFmBinding: FragmentContainerFmBinding
    lateinit var navController: NavController
    companion object {
        val FRAGMENT_INTRO1 : Int = 0
        val FRAGMENT_INTRO2 : Int = 1
        val FRAGMENT_INTRO3 : Int = 2
        var mFragmentCurrent = FRAGMENT_INTRO1
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        containerFmBinding = FragmentContainerFmBinding.inflate(layoutInflater)
        initViewPager2(container!!.rootView)
        return containerFmBinding.root
    }
    //  khai báo fragments và set adapter

    fun initViewPager2(view : View){
        val adapter = ViewPagerAdapter(this)
        containerFmBinding.viewpager.adapter = adapter
        containerFmBinding.indicator.setViewPager(containerFmBinding.viewpager)
        containerFmBinding.viewpager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when(position)
                {
                    1 ->{
                        mFragmentCurrent = FRAGMENT_INTRO2
                        if(mFragmentCurrent != FRAGMENT_INTRO2){
                            containerFmBinding.viewpager.currentItem = FRAGMENT_INTRO2
                            mFragmentCurrent = FRAGMENT_INTRO2
                        }
                    }
                    2 -> {
                        mFragmentCurrent = FRAGMENT_INTRO3
                        if(containerFmBinding.viewpager.currentItem == FRAGMENT_INTRO3){
                            var a : View = view.findViewById(R.id.btnLetGo)
                            a.setOnClickListener{
                                navController = findNavController()
                                var action = ContainerFMDirections.actionContainerFM2ToSignInFM()
                                navController.navigate(action)
                            }
                        }
                    }
                }
            }
        })


    }



}