package com.example.myapplication.repository

import com.example.myapplication.module.family

class familyPerson {
    fun familyMembers ():List<family>{
        return listOf(
            family(
                0,
                "mouad",
                16
            ),
            family(
                1,
                "rachid",
                45
            ),
            family(
                2,
                "laila",
                42
            ),
            family(
                3,
                "mohamed",
                13
            ),
            family(
                4,
                "hassan",
                67
            ),
            family(
                5,
                "alalia",
                63
            ),
        )
    }
}