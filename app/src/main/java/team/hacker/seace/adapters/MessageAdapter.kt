package team.hacker.seace.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import team.hacker.seace.R
import team.hacker.seace.databinding.ItemReceiverMessBinding
import team.hacker.seace.databinding.ItemSendMessBinding
import team.hacker.seace.models.Message

class MessageAdapter(
    var context: Context,
    listMessages: ArrayList<Message>,
    senderRoom: String,
    receiverRoom: String
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var listMessages: ArrayList<Message>
    val ITEM_RECEIVER = 1
    val ITEM_SENT = 2
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemSendMessBinding: ItemSendMessBinding
    lateinit var itemReceiverMessBinding: ItemReceiverMessBinding


    inner class SentMessageViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val sendMessage = itemSendMessBinding.tvSend as View
    }

    inner class ReceiverMessageViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val receiverMessage = itemReceiverMessBinding.tvReceiver as View

    }

    fun setDataForAdapter(listMessages: ArrayList<Message>) {
        this.listMessages = listMessages
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 1) {
        }
        return TODO()
    }

    override fun getItemViewType(position: Int): Int {
        var currentMessage = listMessages[position]
        if (FirebaseAuth.getInstance().currentUser?.uid.equals(currentMessage.senderID)) {
            return ITEM_SENT
        } else {
            return ITEM_RECEIVER
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentMessage = listMessages[position]
        if (holder.javaClass == SentMessageViewHolder::class.java) {
            holder.itemView as ItemSendMessBinding
            itemSendMessBinding.tvSend.text = currentMessage.contentMessages
        }
    }

    override fun getItemCount(): Int {
        return listMessages.size
    }
}