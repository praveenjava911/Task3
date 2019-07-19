package com.praveen.reactive.repository;

import com.praveen.reactive.Movie;

import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}
