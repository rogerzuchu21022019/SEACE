package team.hacker.seace.networks

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import team.hacker.seace.models.comments.CommentItem
import team.hacker.seace.models.likes.Like
import team.hacker.seace.models.likes.LikeItem
import team.hacker.seace.models.photoposts.PhotoPost
import team.hacker.seace.models.photoposts.PhotoPostItem
import team.hacker.seace.models.posts.PostItem
import team.hacker.seace.models.stories.StoryItem
import team.hacker.seace.models.users.UserItem

interface APIService {
    @GET("api/likes")
    suspend fun getAllLikes(): Response<List<LikeItem>>

    @GET("api/comments")
    suspend fun getAllComments(): Response<List<CommentItem>>

    @GET("api/posts")
    suspend fun getAllPosts(): Response<List<PostItem>>

    @GET("api/stories")
    suspend fun getAllStories(): Response<List<StoryItem>>

    @GET("api/photos-post")
    suspend fun getAllPhotoPost(): Response<List<PhotoPostItem>>

    @GET("api/users")
    suspend fun getAllUsers(): Response<List<UserItem>>




    @FormUrlEncoded
    @POST("api/likes")
    suspend fun createNewLike(
        @Field("idLike",)idLike: Int,
        @Field("idPost",)idPost: Int,
        @Field("idUser",)idUser: String,
        @Field("typeLike",)typeLike: Int
    ):LikeItem

    @FormUrlEncoded
    @POST("api/comments")
    suspend fun createNewComment(
        @Field("contentComment") contentComment: String,
        @Field("idComment") idComment: Int,
        @Field("idPost")idPost: Int,
        @Field("idUser")idUser: String
    ):CommentItem

    @FormUrlEncoded
    @POST("api/posts")
    suspend fun createNewPost(
        @Field("contentPost")contentPost: String,
        @Field("idPost")idPost: Int,
        @Field("idUser")idUser: String,
        @Field("sharePost")sharePost: Int,
        @Field("timePost")timePost: String
    ):PostItem
    @FormUrlEncoded
    @POST("api/stories")
    suspend fun createNewStory(
        @Field("contentStory")contentStory: String,
        @Field("idStory")idStory: Int,
        @Field("idUser")idUser: String,
        @Field("srcImage")srcImage: String,
        @Field("timeStoryUp")timeStoryUp: String
    ):StoryItem
    @FormUrlEncoded
    @POST("api/users")
    suspend fun createNewUser(
        @Field("address")address: String,
        @Field("age")age: Int,
        @Field("avatar")avatar: String,
        @Field("email")email: String,
        @Field("fullname")fullname: String,
        @Field("job")job: String,
        @Field("password")password: String,
        @Field("phone")phone: String
    ):UserItem
    @FormUrlEncoded
    @POST("api/photos-post")
    suspend fun createNewPhotoPost(
        @Field("idPhotoPost")idPhotoPost: Int,
        @Field("idPost")idPost: Int,
        @Field("srcPhotoPost")srcPhotoPost: String
    ):PhotoPostItem
}