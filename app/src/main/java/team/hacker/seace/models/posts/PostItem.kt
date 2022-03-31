package team.hacker.seace.models.posts

import com.google.gson.annotations.Expose
import team.hacker.seace.models.comments.CommentItem
import team.hacker.seace.models.likes.LikeItem
import team.hacker.seace.models.photoposts.PhotoPostItem

data class PostItem(
    @Expose
    val Comments: List<CommentItem>,
    @Expose
    val Likes: List<LikeItem>,
    @Expose
    val PhotoPosts: List<PhotoPostItem>,
    @Expose
    val User: Any,
    @Expose
    val contentPost: String,
    @Expose
    val idPost: Int,
    @Expose
    val idUser: String,
    @Expose
    val sharePost: Int,
    @Expose
    val timePost: String
)