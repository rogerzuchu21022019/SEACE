package team.hacker.seace.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvHomeScreenChatBinding
import team.hacker.seace.models.comments.CommentItem
import team.hacker.seace.models.users.UserItem

class HomeScreenChatAdapter() : RecyclerView.Adapter<HomeScreenChatAdapter.HistoryViewHolder>() {
    private var historyChatList: List<UserItem> = emptyList()
    private var listComment: List<CommentItem> = emptyList()
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemRvHomeScreenChatBinding: ItemRvHomeScreenChatBinding
    lateinit var onClickItemChatInRecyclerView: OnClickItemChatInRecyclerView

    class HistoryViewHolder(
        itemRvHomeScreenChatBinding: ItemRvHomeScreenChatBinding,
        onClickItemChatInRecyclerView: OnClickItemChatInRecyclerView
    ) :
        RecyclerView.ViewHolder(itemRvHomeScreenChatBinding.root) {
        init {
            itemRvHomeScreenChatBinding.root.setOnClickListener {
                onClickItemChatInRecyclerView.onClickItem(adapterPosition, itemRvHomeScreenChatBinding)
            }
        }
    }

    fun setItemOnClickInRecyclerView(onClickItemChatInRecyclerView: OnClickItemChatInRecyclerView) {
        this.onClickItemChatInRecyclerView = onClickItemChatInRecyclerView
    }

    fun setDataForAdapter(historyChatList: List<UserItem>, listComment: List<CommentItem>) {
        this.historyChatList = historyChatList
        this.listComment = listComment
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvHomeScreenChatBinding =
            ItemRvHomeScreenChatBinding.inflate(layoutInflater, parent, false)
        return HistoryViewHolder(
            itemRvHomeScreenChatBinding = itemRvHomeScreenChatBinding,
            onClickItemChatInRecyclerView = onClickItemChatInRecyclerView
        )
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        var currentContent = historyChatList[position]
//        var currentComment = listComment[position]
        itemRvHomeScreenChatBinding.user = currentContent
//        itemRvHomeScreenChatBinding.comment = currentComment
    }

    override fun getItemCount(): Int {
        return historyChatList.size
    }

    interface OnClickItemChatInRecyclerView {
        fun onClickItem(position: Int, itemRvHomeScreenChatBinding: ItemRvHomeScreenChatBinding)
    }
}