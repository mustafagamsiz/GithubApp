package org.gamsiz.githubapp.data

data class QueryResult(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)