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

class MessageAdapter(var context:Context,
                     listMessages:ArrayList<Message>,
                     senderRoom:String,
                     receiverRoom:String
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var listMessages:ArrayList<Message>
    val ITEM_SEND = 1
    val ITEM_RECEIVER = 3
    val senderRoom:String
    val receiverRoom:String
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemSendMessBinding: ItemSendMessBinding
    lateinit var itemReceiverMessBinding: ItemReceiverMessBinding
    init {
        if (listMessages!=null){
            this.listMessages = listMessages
        }
        this.senderRoom = senderRoom
        this.receiverRoom = receiverRoom
    }

    inner class SentMessageViewHolder(itemSendMessBinding: ItemSendMessBinding) :
        RecyclerView.ViewHolder(itemSendMessBinding.root) {

    }

    inner class ReceiverMessageViewHolder(itemReceiverMessBinding: ItemReceiverMessBinding) :
        RecyclerView.ViewHolder(itemReceiverMessBinding.root) {

    }

    fun setDataForAdapter(listMessages: ArrayList<Message>){
        this.listMessages = listMessages
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        return if (viewType == ITEM_SEND) {
            itemSendMessBinding = ItemSendMessBinding.inflate(layoutInflater, parent, false)
            SentMessageViewHolder(itemSendMessBinding = itemSendMessBinding)

        }else{
            itemReceiverMessBinding = ItemReceiverMessBinding.inflate(layoutInflater,parent,false)
            ReceiverMessageViewHolder(itemReceiverMessBinding =  itemReceiverMessBinding)
        }
    }

    override fun getItemViewType(position: Int): Int {
        var messages = listMessages[position]
        itemSendMessBinding.messages = messages


        return  if (FirebaseAuth.getInstance().uid == messages.senderID){
            ITEM_SEND

        }else{
            ITEM_RECEIVER
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message: Message = listMessages[position]
        if (holder.javaClass == SentMessageViewHolder::class.java){
            val viewHolder= holder as SentMessageViewHolder
            if (message.contentMessages.equals(other = "photo")){
                itemSendMessBinding.civAvatar.visibility = View.VISIBLE
                itemSendMessBinding.lnChat.visibility = View.GONE
                itemSendMessBinding.tvSend.visibility = View.GONE
                Glide.with(context)
                    .load(message.imgaeURL)
                    .placeholder(R.drawable.placehoder)
                    .into(itemSendMessBinding.imageToSet)
            }
        }
    }

    override fun getItemCount(): Int {
        return listMessages.size
    }
}