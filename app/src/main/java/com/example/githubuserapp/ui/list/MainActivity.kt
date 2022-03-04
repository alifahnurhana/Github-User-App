package com.example.githubuserapp.ui.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.githubuserapp.R
import com.example.githubuserapp.ui.detail.UserDetailActivity
import com.example.githubuserapp.ui.detail.UserDetailActivity.Companion.EXTRA_DATA
import com.example.githubuserapp.util.Constants

class MainActivity : AppCompatActivity() {

    private lateinit var rvUserList: RecyclerView

    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUserList = findViewById(R.id.rv_user_list)

        adapter = UserAdapter(Constants.userList) { user ->
            val intent = Intent(this, UserDetailActivity::class.java)
            intent.putExtra(EXTRA_DATA, user)
            startActivity(intent)
        }
        rvUserList.layoutManager = LinearLayoutManager(this)
        rvUserList.adapter = adapter

    }
}