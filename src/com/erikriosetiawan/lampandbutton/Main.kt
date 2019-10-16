package com.erikriosetiawan.lampandbutton

private var divisorCount: Int = 0

fun main() {
    print("Please enter the lamp total: ")
    val lampTotal: Long? = readLine()?.toLong()

    lampTotal?.let { lampStatus(it) }
}

fun lampStatus(lampTotal: Long) {
    for (i in 1..lampTotal) if (lampTotal % i == 0L) divisorCount++
    if (divisorCount % 2 == 0) println("The lamp is turn off") else println("The lamp is turn on")
}