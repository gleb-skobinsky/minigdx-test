import com.github.minigdx.gradle.plugin.includeAndroid

/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/6.8.2/userguide/multi_project_builds.html
 */

rootProject.name = "minigdx-game-template"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        maven {
            url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }.mavenContent {
            includeVersionByRegex("com.github.minigdx.(.*)", "(.*)", "LATEST-SNAPSHOT")
            includeVersionByRegex("com.github.minigdx", "(.*)", "LATEST-SNAPSHOT")
        }
        mavenLocal()
    }
}


plugins {
    id("com.github.minigdx.settings") version ("LATEST-SNAPSHOT")
}

include("common")
include("jvm")
include("web")
includeAndroid("android")
