package team.hacker.seace.fragments.stories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentStoriesListBinding

class StoriesListFragment : Fragment() {
private lateinit var fmStoriesListBinding: FragmentStoriesListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmStoriesListBinding= FragmentStoriesListBinding.inflate(layoutInflater)
        return fmStoriesListBinding.root
    }
}