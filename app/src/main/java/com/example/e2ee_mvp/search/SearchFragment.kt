package com.example.e2ee_mvp.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e2ee_mvp.R
import com.example.e2ee_mvp.model.User

class SearchFragment() : Fragment(R.layout.fragment_search), SearchContract.View {

    override lateinit var presenter: SearchContract.Presenter

    override fun showUser(listUser: List<User>) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun addSuccess() {

    }

    override fun addFail() {

    }
}