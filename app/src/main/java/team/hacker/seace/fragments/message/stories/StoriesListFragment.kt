package team.hacker.seace.fragments.message.stories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import team.hacker.seace.databinding.FragmentSharePostBinding
import team.hacker.seace.databinding.FragmentStoriesListBinding

class StoriesListFragment : Fragment() {
private lateinit var fmStoriesListBinding: FragmentStoriesListBinding

    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmStoriesListBinding= FragmentStoriesListBinding.inflate(layoutInflater)


        initNavController()
        NavigationUI.setupWithNavController(fmStoriesListBinding.navBot,navController)
        return fmStoriesListBinding.root
    }



    private fun initNavController() {
        navController = findNavController()
    }

}