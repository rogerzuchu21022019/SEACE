package team.hacker.seace.models.comments

data class CommentItem(
    val Post: Any,
    val User: Any,
    val contentComment: String,
    val idComment: Int,
    val idPost: Int,
    val idUser: String
)