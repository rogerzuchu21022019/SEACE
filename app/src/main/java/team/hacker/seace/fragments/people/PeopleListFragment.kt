package team.hacker.seace
.fragments.people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentPeopleListBinding

class PeopleListFragment : Fragment() {
private lateinit var fmPeopleListBinding: FragmentPeopleListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmPeopleListBinding= FragmentPeopleListBinding.inflate(layoutInflater)

        return fmPeopleListBinding.root
    }

}