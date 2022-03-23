package team.hacker.seace.fragments.message.calls.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentChatSubBinding

class ChatSubFragment : Fragment() {
private lateinit var fmChatSubBinding: FragmentChatSubBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmChatSubBinding= FragmentChatSubBinding.inflate(layoutInflater)
        return fmChatSubBinding.root
    }
}