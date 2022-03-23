package team.hacker.seace.fragments.message.calls.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentChatBinding

class ChatFM : Fragment() {
    var fragmentChatBinding : FragmentChatBinding?=null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentChatBinding = FragmentChatBinding.inflate(layoutInflater)
        return fragmentChatBinding!!.root
    }
}