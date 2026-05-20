package com.nanayaa.model

data class About(
    val name: String,
    val title: String,
    val bio: String,
    val email: String,
    val linkedInUrl: String,
    val githubUrl: List<String>,
    val skills: List<String>
)