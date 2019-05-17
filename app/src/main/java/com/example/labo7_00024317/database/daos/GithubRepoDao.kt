package com.example.labo7_00024317.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.labo7_00024317.database.entities.GithubRepo


@Dao
interface GithubRepoDao {

    @Query("SELECT * FROM repos")
    fun getAll():LiveData<List<GithubRepo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(repo:GithubRepo)

    @Query("DELETE FROM repos")
    fun nuketable()
}