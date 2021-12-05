# github-actions-cd-template-jvm

[![Java CI with Gradle](https://github.com/rpanic/github-actions-cd-template-jvm/actions/workflows/gradle.yml/badge.svg)](https://github.com/rpanic/github-actions-cd-template-jvm/actions/workflows/gradle.yml)

A Template for a Github Actions Pipeline for building and publishing Gradle-JVM Applications
It build a executable shadow-jar using `gradle shadowJar` and then pushes it to a SSH Server using RSync and (re-)starts it using a bash-script

`gradle.yml` can be used in combinating with the shadow-jar gradle plugin without depending on the Example used in `src`
