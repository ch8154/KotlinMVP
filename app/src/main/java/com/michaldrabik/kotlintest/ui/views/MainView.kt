package com.michaldrabik.kotlintest.ui.views

import com.michaldrabik.kotlintest.data.models.Joke

interface MainView : PresenterView {
  fun onFetchJokesSuccess(jokes: List<Joke>)
  fun onFetchJokesError(error: Throwable)
}