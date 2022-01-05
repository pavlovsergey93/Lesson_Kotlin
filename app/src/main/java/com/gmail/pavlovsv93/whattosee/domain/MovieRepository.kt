package com.gmail.pavlovsv93.whattosee.domain

class MovieRepository() : RepositoryInterface {

    private val moviesList: MutableList<Movie> = TODO()

    override fun addNewMovie(id: Int, name: String, tell: String) {
        val movie = Movie(id = id, nameMovie = name, brieflyTell = tell)
        moviesList.add(movie)
    }

    override fun deleteMovie(id: Int) {
        moviesList.remove(moviesList.get(id))
    }

    override fun updateMovie(id: Int) {
        TODO("Not yet implemented")
    }

    override fun copyMovie(movie: Movie) {

    }

    fun getMovie(id: Int): Movie {
        return moviesList.get(id)
    }
}
