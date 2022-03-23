package team.hacker.seace.fragments.message.calls.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentChatListBinding

class ChatListFragment : Fragment()  {
private lateinit var fmChatListBinding: FragmentChatListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmChatListBinding= FragmentChatListBinding.inflate(layoutInflater)

        return fmChatListBinding.root
    }

}