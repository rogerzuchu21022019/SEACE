package team.hacker.seace.models.comments

import android.os.Parcelable
import com.google.gson.annotations.Expose
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CommentItem(
    @Expose
    val contentComment: String,
    @Expose
    val idComment: Int,
    @Expose
    val idPost: Int,
    @Expose
    val idUser: String
):Parcelable