package team.hacker.seace.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvUserOnlineInChatBinding

import team.hacker.seace.models.users.UserItem

class UserInHomeScreenChatAdapter :
    RecyclerView.Adapter<UserInHomeScreenChatAdapter.HistoryViewHolder>() {
    private var listUsers: List<UserItem> = emptyList()
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemRvUserOnlineInChatBinding: ItemRvUserOnlineInChatBinding
    lateinit var onItemClickInRecyclerView: OnItemClickInRecyclerViewUser

    class HistoryViewHolder(itemRvUserOnlineInChatBinding: ItemRvUserOnlineInChatBinding,onItemClickInRecyclerView: OnItemClickInRecyclerViewUser) :
        RecyclerView.ViewHolder(itemRvUserOnlineInChatBinding.root) {
            init {
                itemRvUserOnlineInChatBinding.root.setOnClickListener {
                    onItemClickInRecyclerView.onItemClick(adapterPosition,itemRvUserOnlineInChatBinding)
                }
                onItemClickInRecyclerView.onItemClick(adapterPosition,itemRvUserOnlineInChatBinding)

            }
    }

    fun setOnClickItem(onItemClickInRecyclerView: OnItemClickInRecyclerViewUser){
        this.onItemClickInRecyclerView = onItemClickInRecyclerView
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setDataForAdapter(listUsers: List<UserItem>) {
        this.listUsers = listUsers
        this.notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvUserOnlineInChatBinding = ItemRvUserOnlineInChatBinding.inflate(layoutInflater, parent, false)
        return HistoryViewHolder(itemRvUserOnlineInChatBinding = itemRvUserOnlineInChatBinding,onItemClickInRecyclerView=onItemClickInRecyclerView)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val currentUser = listUsers[position]
        itemRvUserOnlineInChatBinding.user = currentUser
    }

    override fun getItemCount(): Int {
        return listUsers.size
    }
    interface OnItemClickInRecyclerViewUser{
        fun onItemClick(position: Int,itemRvUserOnlineInChatBinding: ItemRvUserOnlineInChatBinding)
    }
}