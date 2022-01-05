package com.gmail.pavlovsv93.whattosee.domain

interface RepositoryInterface {
    fun addNewMovie(id: Int,name: String, tell: String)
    fun deleteMovie(id: Int)
    fun updateMovie(id: Int)
    fun copyMovie(movie: Movie)
}