package com.github.zhangxiong402.testplugin.services

import com.github.zhangxiong402.testplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
