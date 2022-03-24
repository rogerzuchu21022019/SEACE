package team.hacker.seace.models.posts

data class PostItem(
    val Comments: List<Any>,
    val Likes: List<Any>,
    val PhotoPosts: List<Any>,
    val User: Any,
    val contentPost: String,
    val idPost: Int,
    val idUser: String,
    val sharePost: Int,
    val timePost: String
)