package team.hacker.seace.fragments.message.history

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import team.hacker.seace.adapters.HistoryChatAdapter
import team.hacker.seace.databinding.FragmentMessChatBinding
import team.hacker.seace.networks.API
import team.hacker.seace.networks.APIService

class HistoryChatFM : Fragment() {
    lateinit var fmMessChat: FragmentMessChatBinding
    lateinit var adapter: HistoryChatAdapter

    var apiService: APIService = API.getAPI().create(APIService::class.java)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmMessChat = FragmentMessChatBinding.inflate(layoutInflater)
        initRecyclerView()
        GetAllUsers()
        return fmMessChat.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }

    private fun GetAllUsers() {
        GlobalScope.launch(Dispatchers.Main) {
            val response = apiService.getAllUsers()
            val responseComment = apiService.getAllComments()
            if (response.isSuccessful) {
                for (data in response.body()!!) {
                    adapter.setDataForAdapter(response.body()!!,responseComment.body()!!)
//                    adapter.setDataForAdapter(responseComment.body()!!)

                }
            }

//            var response = apiService.createNewUser(
//                address = "Q12",
//                age = 20,
//                avatar = "abcxyz",
//                email = "namzuchu@gmail.com",
//                fullname = "Vu Thanh Nam",
//                phone = "0990",
//                job = "IT",
//                password = "ok"
//            )

        }
    }


    private fun initRecyclerView() {
        adapter = HistoryChatAdapter()
        fmMessChat.rvStory.adapter = adapter
        fmMessChat.rvHistoryChat.adapter = adapter

    }
}