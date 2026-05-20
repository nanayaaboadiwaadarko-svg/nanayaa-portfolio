package com.nanayaa.model

data class Experience (
    val id: Int,
    val company: String,
    val role: String,
    val description: String,
    val startDate: String,
    val endDate: String,
    val techStack: List<String>

)
