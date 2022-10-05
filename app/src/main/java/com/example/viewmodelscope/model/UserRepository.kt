package com.example.viewmodelscope.model

import kotlinx.coroutines.delay

class UserRepository
{
    //Real world situation - API CALL HERE!

    suspend fun getUSers(): List<User>
    {
        delay(8000)
        val users: List<User> = listOf(
            User(1, "James"),
            User(2, "Hellena"),
            User(3, "Pedro"),
            User(4, "Macamito"),
        )

        return users
    }
}