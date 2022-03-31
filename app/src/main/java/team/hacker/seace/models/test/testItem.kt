package team.hacker.seace.models.test

import team.hacker.seace.models.comments.CommentItem
import team.hacker.seace.models.posts.PostItem
import team.hacker.seace.models.stories.StoryItem

data class testItem(
    val Comments: List<CommentItem>,
    val Posts: List<PostItem>,
    val Stories: List<StoryItem>,
    val address: String,
    val age: Int,
    val avatar: String,
    val email: String,
    val fullname: String,
    val idUser: String,
    val job: String,
    val passwords: String,
    val phone: String
)