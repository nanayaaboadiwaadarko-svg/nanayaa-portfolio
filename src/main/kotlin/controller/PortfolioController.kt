package com.nanayaa.controller

import com.nanayaa.service.PortfolioService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PortfolioController(private val portfolioService: PortfolioService) {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("about", portfolioService.getAbout())
        model.addAttribute("projects", portfolioService.getProjects())
        model.addAttribute("experience", portfolioService.getExperience())
        return "index"
    }
}