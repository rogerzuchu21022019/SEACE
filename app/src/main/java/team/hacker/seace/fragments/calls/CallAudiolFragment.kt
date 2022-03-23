package team.hacker.seace.fragments.calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentCallAudioBinding

class CallAudiolFragment : Fragment() {
private lateinit var fmCallAudioBinding: FragmentCallAudioBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        fmCallAudioBinding= FragmentCallAudioBinding.inflate(layoutInflater)
        return fmCallAudioBinding.root
    }
}