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
        return when (position) {
            0 -> {
                Intro1FM()
            }
            1 -> {
                Intro2FM()
            }
            else -> {
                Intro3FM()
            }
        }
    }

}
