package com.ezatpanah.themoviedb_api_mvp.repository

import com.ezatpanah.themoviedb_api_mvp.db.MoviesDao
import com.ezatpanah.themoviedb_api_mvp.db.MoviesEntity
import javax.inject.Inject

class DatabaseRepository @Inject constructor(private val dao : MoviesDao) {

    fun getAllFavoriteList ()=dao.getAllMovies()
    suspend fun insertMovie(entity: MoviesEntity) = dao.insertMovie(entity)
    suspend fun deleteMovie(entity: MoviesEntity) = dao.deleteMovie(entity)
    suspend fun existMovie(id: Int) = dao.existMovie(id)

}