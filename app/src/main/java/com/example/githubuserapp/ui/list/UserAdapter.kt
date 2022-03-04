package com.example.githubuserapp.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.githubuserapp.R
import com.example.githubuserapp.domain.model.GithubUser
import com.example.githubuserapp.util.loadImage

class UserAdapter(
    private val listUser: ArrayList<GithubUser>,
    private val onClick: (GithubUser) -> Unit
) : RecyclerView.Adapter<UserAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listUser[position]
        holder.ivAvatar.loadImage(user.avatar)
        holder.tvName.text = user.name
        holder.tvUserName.text = user.userName
        holder.itemView.setOnClickListener {
            onClick(user)
        }
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvUserName: TextView = itemView.findViewById(R.id.tv_item_username)
        var ivAvatar: ImageView = itemView.findViewById(R.id.avatar)
    }

}