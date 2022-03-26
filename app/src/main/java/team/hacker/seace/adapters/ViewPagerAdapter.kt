package team.hacker.seace.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import team.hacker.seace.fragments.intro.Intro1FM
import team.hacker.seace.fragments.intro.Intro2FM
import team.hacker.seace.fragments.intro.Intro3FM

class ViewPagerAdapter(
    fragment: Fragment
    ) :  FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return Intro1FM()
        }else if(position == 1){
            return  Intro2FM()
        }else{
            return Intro3FM()
        }
        return Intro1FM()
    }

}
