package com.nanayaa.service

import com.nanayaa.model.About
import com.nanayaa.model.Experience
import com.nanayaa.model.Project
import org.springframework.stereotype.Service

@Service
class PortfolioService {

    fun getAbout(): About {
        return About(
            name = "Hannah Nana Yaa Sarfo Darko",
            title = "Junior Software Developer",
            bio = "I am a junior software developer with a passion for building clean, efficient, and meaningful applications. " +
                    "With hands-on experience in Kotlin, Java, JavaScript, and database management using PostgreSQL, " +
                    "I enjoy solving real-world problems through technology. I am currently expanding my skills in " +
                    "backend development and enterprise application design, with a strong focus on writing maintainable " +
                    "and scalable code. I am eager to grow, contribute, and make an impact in the tech industry.",
            email = "nanayaaboadiwaadarko@gmail.com",
            linkedInUrl = "https://www.linkedin.com/in/hannah-nana-yaa-sarfo-darko-57a8b9233",
            githubUrl = listOf(
                "https://github.com/ndarko-genkey",
                "https://github.com/nanayaaboadiwaadarko-svg"
            ),
            skills = listOf("Kotlin", "Java", "Spring Boot", "Docker",
                "PostgreSQL", "Jmix", "JWT", "REST APIs",
                "Spring Security", "Gradle", "JavaScript")
        )
    }

    fun getProjects(): List<Project> {
        return listOf(
            Project(
                id = 1,
                title = "Personal Portfolio API",
                description = "A Spring Boot REST API built with Kotlin to serve my personal portfolio data including projects, experience, and about information.",
                techStack = listOf("Kotlin", "Spring Boot", "Gradle"),
                githubUrl = "",
                liveUrl = ""
            ),

            Project(
                    id = 2,
            title = "Todo List API",
            description = "A secure REST API where users can register, log in, and manage tasks. " +
                    "Implements JWT-based authentication using Spring Security and Dockerized for deployment.",
            techStack = listOf("Spring Boot", "JWT", "Spring Security", "PostgreSQL", "Docker"),
            githubUrl = "",
            liveUrl = ""
        ),

            Project(
                id = 3,
                title = "Student Management System",
                description = "A monolithic application to manage student records built with Spring Boot. " +
                        "Uses Spring Data JPA for database interaction and JMIX for frontend visualization.",
                techStack = listOf("Spring Boot", "JPA", "PostgreSQL", "Jmix"),
                githubUrl = "",
                liveUrl = ""
            ),

            Project(
                id = 4,
                title = "MeAgain",
                description = "A facial recognition identity platform built with Kotlin and Spring Boot. " +
                        "Integrates CompreFace for face detection and verification, secured with JWT authentication.",
                techStack = listOf("Kotlin", "Spring Boot", "CompreFace", "JWT", "Docker", "PostgreSQL"),
                githubUrl = "",
                liveUrl = ""


            )
        )

    }

    fun getExperience(): List<Experience> {
        return listOf(
            Experience(
                id = 1,
                company = "Genkey Africa",
                role = "Junior Software Developer",
                description = "Currently interning in the backend development department, gaining hands-on experience in building and maintaining server-side applications and contributing to real-world software solutions.",
                startDate = "2025",
                endDate = "Present",
                techStack = listOf("Kotlin", "Java", "PostgreSQL", "Spring Boot", "Jmix", "Docker")
            )
        )
    }
}