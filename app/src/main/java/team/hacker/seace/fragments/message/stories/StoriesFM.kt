package team.hacker.seace.fragments.message.stories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import team.hacker.seace.adapters.StoriesChatAdapter
import team.hacker.seace.databinding.FragmentStoriesBinding
import team.hacker.seace.networks.API
import team.hacker.seace.networks.APIService

@DelicateCoroutinesApi
class StoriesFM : Fragment() {
    private lateinit var fmStoriesBinding: FragmentStoriesBinding
    val apiService:APIService = API.getAPI().create(APIService::class.java)
    lateinit var storiesChatAdapter:StoriesChatAdapter
    lateinit var navController: NavController
    lateinit var action:NavDirections
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmStoriesBinding = FragmentStoriesBinding.inflate(layoutInflater)
        getAllStories()
        initRecyclerView()
        initNavController()
        NavigationUI.setupWithNavController(
            navController = navController,
            navigationBarView = fmStoriesBinding.navBot
        )
        initClick()
        return fmStoriesBinding.root
    }

    private fun initClick() {
        fmStoriesBinding.tvBackSeaceHomeScreen.setOnClickListener {

        }
    }

    private fun runAction() {
        navController.navigate(action)
    }

    private fun getAllStories() {
        GlobalScope.launch(Dispatchers.Main){
            val response = apiService.getAllStories()
            val responseUsers = apiService.getAllUsers()
            if (response.isSuccessful){
                for (data in response.body()!!){
                    storiesChatAdapter.setDataForAdapter(response.body()!!,responseUsers.body()!!)
                }
            }
        }
    }

    private fun initRecyclerView() {
        storiesChatAdapter = StoriesChatAdapter()
        fmStoriesBinding.rvStories.setHasFixedSize(true)
        fmStoriesBinding.rvStories.addItemDecoration(DividerItemDecoration(requireContext(),DividerItemDecoration.VERTICAL))
        fmStoriesBinding.rvStories.adapter = storiesChatAdapter

    }

    private fun initNavController() {
        navController = findNavController()

    }

}