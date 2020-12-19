package com.github.duninvit.myhub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyHubApplication

fun main(args: Array<String>) {
	runApplication<MyHubApplication>(*args)
}
