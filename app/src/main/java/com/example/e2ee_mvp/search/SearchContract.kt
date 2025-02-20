package com.example.e2ee_mvp.search

import com.example.e2ee_mvp.BasePresenter
import com.example.e2ee_mvp.BaseView
import com.example.e2ee_mvp.model.User
import com.example.e2ee_mvp.model.UserFriend

interface SearchContract {
    interface View : BaseView<Presenter> {
        fun showUser(listUser: List<User>)
        fun addSuccess()
        fun addFail()
    }

    interface Presenter : BasePresenter {
        fun getCurrentUserFriend()
        fun getUsers(friends: HashMap<String, UserFriend?>)
        fun addToContact(friendId: String)
    }
}