package team.hacker.seace.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainer
import team.hacker.seace.adapters.ViewPagerAdapter
import team.hacker.seace.databinding.FragmentContainerFmBinding

class ContainerFM : Fragment(){
    lateinit var containerFmBinding: FragmentContainerFmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        containerFmBinding = FragmentContainerFmBinding.inflate(layoutInflater)
        val adapter = ViewPagerAdapter(fragments, requireActivity() as AppCompatActivity)
        containerFmBinding.viewpager.adapter = adapter
        containerFmBinding.indicator.setViewPager(containerFmBinding.viewpager)
        return containerFmBinding.root
    }
    //  khai báo fragments và set adapter
    val fragments : List<Fragment> = listOf(
        Intro1FM(),
        Intro2FM(),
        Intro3FM()
    )
//    override fun onBackPressed() {
//        if(.viewpager.currentItem == 0){
//            super.onBackPressed()
//        }else{
//            ctnbinding.viewpager.currentItem = ctnbinding.viewpager.currentItem - 1
//        }
//}
}