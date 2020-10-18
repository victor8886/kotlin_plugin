package com.github.victor8886.kotlinplugin.services

import com.intellij.openapi.project.Project
import com.github.victor8886.kotlinplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
