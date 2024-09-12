package com.milly.Ev01Movies.paging

interface Pagination<Key, Item> {
    suspend fun loadNextPage()
    fun reset()
}