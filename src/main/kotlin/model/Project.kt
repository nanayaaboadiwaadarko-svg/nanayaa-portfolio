package com.nanayaa.model

data class Project(
    val id: Int,
    val title: String,
    val description: String,
    val techStack: List<String>,
    val githubUrl: String,
    val liveUrl: String
)
