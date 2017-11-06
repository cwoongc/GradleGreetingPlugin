package com.github.cwoongc.plugin
import org.gradle.api.Project
import org.gradle.api.Plugin

//org.gradle.api.Plugin을 implement한 사용자정의 플러그인
class GreetingPlugin implements Plugin<Project> {
    //본 플러그인이 apply될때 호출되는 메소드
    void apply(Project project) {
        //프로젝트에 greeting extension 추가
        project.extensions.create("greeting", GreetingExtension)
        
        //프로젝트에 greet 태스크 추가
        project.task("greet") {
            doLast {
                println "${project.greeting.greeting}, ${project.greeting.target}!"
            }
        }
    }
}