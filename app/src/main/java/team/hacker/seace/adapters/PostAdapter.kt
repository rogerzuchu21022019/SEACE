package team.hacker.seace.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvPostBinding
import team.hacker.seace.models.posts.PostItem
import team.hacker.seace.models.users.UserItem

class PostAdapter: RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    private var listPosts: List<PostItem> = emptyList()
    private var listUser: List<UserItem> = emptyList()

    lateinit var layoutInflater:LayoutInflater
    lateinit var itemRvPostBinding: ItemRvPostBinding
    lateinit var onClickItemInRecyclerView: OnClickItemInRecyclerView
    class PostViewHolder(itemRvPostBinding: ItemRvPostBinding,onClickItemInRecyclerView: OnClickItemInRecyclerView) : RecyclerView.ViewHolder(itemRvPostBinding.root) {
        init {
            itemRvPostBinding.root.setOnClickListener {
                onClickItemInRecyclerView.onItemClick(adapterPosition,itemRvPostBinding)
            }
            onClickItemInRecyclerView.onItemClick(adapterPosition,itemRvPostBinding)

        }
    }

    fun setDataforAdapter(listPosts: List<PostItem>,
                          listUser: List<UserItem>
    ){
        this.listPosts = listPosts
        this.listUser = listUser
        notifyDataSetChanged()
    }
    fun setItemOnClickInRecyclerView(onClickItemInRecyclerView: OnClickItemInRecyclerView){
        this.onClickItemInRecyclerView = onClickItemInRecyclerView
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvPostBinding = ItemRvPostBinding.inflate(layoutInflater,parent,false)
        return PostViewHolder(itemRvPostBinding = itemRvPostBinding,onClickItemInRecyclerView=onClickItemInRecyclerView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentPost = listPosts[position]
        val currentUser = listUser[position]
        itemRvPostBinding.post=currentPost
        itemRvPostBinding.user=currentUser
    }

    override fun getItemCount(): Int {
        return listPosts.size
    }

    interface OnClickItemInRecyclerView{
        fun onItemClick(position: Int,itemRvPostBinding: ItemRvPostBinding)
    }

}