package com.example.githubuserapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.githubuserapp.R
import com.example.githubuserapp.domain.model.GithubUser
import com.example.githubuserapp.util.loadImage

class UserDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "EXTRA_DATA"
    }

    private lateinit var ivAvatar: ImageView
    private lateinit var tvUserName: TextView
    private lateinit var tvName: TextView
    private lateinit var tvCompany: TextView
    private lateinit var tvLocation: TextView
    private lateinit var tvRepository: TextView
    private lateinit var tvFollower: TextView
    private lateinit var tvFollowing: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        ivAvatar = findViewById(R.id.iv_avatar)
        tvUserName = findViewById(R.id.tv_user_name)
        tvName = findViewById(R.id.tv_name)
        tvCompany = findViewById(R.id.tv_company)
        tvLocation = findViewById(R.id.tv_location)
        tvRepository = findViewById(R.id.tv_repository)
        tvFollower = findViewById(R.id.tv_follower)
        tvFollowing = findViewById(R.id.tv_following)

        val user = intent.getParcelableExtra<GithubUser>(EXTRA_DATA)

        ivAvatar.loadImage(user?.avatar)
        tvName.text = user?.name
        tvUserName.text = user?.userName
        tvCompany.text = user?.company
        tvLocation.text = user?.location
        tvRepository.text = user?.repository.toString()
        tvFollower.text = user?.follower.toString()
        tvFollowing.text = user?.following.toString()

    }
}