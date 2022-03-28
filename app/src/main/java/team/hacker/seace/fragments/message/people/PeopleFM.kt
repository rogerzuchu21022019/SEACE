package team.hacker.seace.fragments.message.people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import team.hacker.seace.adapters.PeopleAdapter
import team.hacker.seace.databinding.FragmentPeopleBinding
import team.hacker.seace.databinding.FragmentStoriesBinding
import team.hacker.seace.networks.API
import team.hacker.seace.networks.APIService

class PeopleFM : Fragment() {
    private lateinit var fmPeopleBinding: FragmentPeopleBinding
    var apiService: APIService = API.getAPI().create(APIService::class.java)
    lateinit var navController: NavController
    lateinit var peopleAdapter:PeopleAdapter
    lateinit var action:NavDirections
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmPeopleBinding = FragmentPeopleBinding.inflate(layoutInflater)
        getAllStories()
        initRecyclerView()
        initNavController()
        NavigationUI.setupWithNavController(
            navController = navController,
            navigationBarView = fmPeopleBinding.navBot
        )
        initClick()
        return fmPeopleBinding.root
    }

    private fun initClick() {
        fmPeopleBinding.tvBackSeaceHomeScreen.setOnClickListener {

        }
    }

    private fun runAction() {
        navController.navigate(action)
    }

    private fun initRecyclerView() {
        peopleAdapter = PeopleAdapter()
        fmPeopleBinding.rvPeople.setHasFixedSize(true)
        fmPeopleBinding.rvPeople.addItemDecoration(DividerItemDecoration(requireContext(),DividerItemDecoration.VERTICAL))
        fmPeopleBinding.rvPeople.adapter = peopleAdapter

    }

    private fun getAllStories() {
        GlobalScope.launch(Dispatchers.Main) {
            val response = apiService.getAllUsers()
            if (response.isSuccessful){
                for (data in response.body()!!){
                    peopleAdapter.setDataForAdapter(response.body()!!)

                }
            }
        }
    }

    private fun initNavController() {
        navController = findNavController()
    }


}