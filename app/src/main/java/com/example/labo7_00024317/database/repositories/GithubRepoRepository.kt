package com.example.labo7_00024317.database.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.labo7_00024317.database.daos.GithubRepoDao
import com.example.labo7_00024317.database.entities.GithubRepo

class GithubRepoRepository (private val repoDAO: GithubRepoDao){

    fun getAll():LiveData<List<GithubRepo>> = repoDAO.getAll()

    fun nuke()=repoDAO.nuketable()

    @WorkerThread
    suspend fun insert(repo:GithubRepo)=repoDAO.insert(repo)
}