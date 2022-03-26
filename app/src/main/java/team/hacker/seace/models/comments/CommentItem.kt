package team.hacker.seace.models.comments

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CommentItem(
    val contentComment: String,
    val idComment: Int,
    val idPost: Int,
    val idUser: String
):Parcelable