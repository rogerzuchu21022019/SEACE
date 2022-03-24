package team.hacker.seace.models.likes

data class LikeItem(
    val Post: Any,
    val User: Any,
    val idLike: Int,
    val idPost: Int,
    val idUser: String,
    val typeLike: Int
)