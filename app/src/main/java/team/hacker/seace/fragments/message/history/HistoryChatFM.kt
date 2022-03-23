package team.hacker.seace.fragments.message.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.models.HistoryChatModel
import team.hacker.seace.R
import team.hacker.seace.adapters.HistoryChatAdapter
import team.hacker.seace.databinding.FragmentMessChatBinding

class HistoryChatFM : Fragment() {
    lateinit var fmMessChat: FragmentMessChatBinding
    lateinit var adapter: HistoryChatAdapter
     var historyChatList= listOf(
         HistoryChatModel(userName = "nam", contentChat = "cuong", R.drawable.ic_launcher_background),
         HistoryChatModel(userName = "nam", contentChat = "cuong", R.drawable.ic_launcher_background),
         HistoryChatModel(userName = "nam", contentChat = "cuong", R.drawable.ic_launcher_background),
         HistoryChatModel(userName = "nam", contentChat = "cuong", R.drawable.ic_launcher_background),
         HistoryChatModel(userName = "nam", contentChat = "cuong", R.drawable.ic_launcher_background),
     )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmMessChat = FragmentMessChatBinding.inflate(layoutInflater)
        return fmMessChat.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter = HistoryChatAdapter()
        adapter.setDataForAdapter(historyChatList = historyChatList)
        fmMessChat.rvStory.adapter = adapter

    }
}