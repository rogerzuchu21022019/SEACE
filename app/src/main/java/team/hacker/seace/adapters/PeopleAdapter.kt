package team.hacker.seace.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvPeopleBinding
import team.hacker.seace.models.users.UserItem

class PeopleAdapter: RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {
    var listPeople:List<UserItem> = emptyList()
    lateinit var itemRvPeopleBinding: ItemRvPeopleBinding
    lateinit var layoutInflater: LayoutInflater

    class PeopleViewHolder(itemRvPeopleBinding: ItemRvPeopleBinding) :RecyclerView.ViewHolder(itemRvPeopleBinding.root){

    }

    fun setDataForAdapter(listPeople:List<UserItem>){
        this.listPeople = listPeople
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvPeopleBinding = ItemRvPeopleBinding.inflate(layoutInflater,parent,false)
        return PeopleViewHolder(itemRvPeopleBinding = itemRvPeopleBinding)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        val currentUser = listPeople[position]
        itemRvPeopleBinding.user = currentUser

    }

    override fun getItemCount(): Int {
        return listPeople.size
    }
}