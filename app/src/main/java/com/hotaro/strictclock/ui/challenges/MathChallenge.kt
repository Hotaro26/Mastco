package com.hotaro.strictclock.ui.challenges

import kotlin.random.Random

data class MathProblem(val expression: String, val answer: Int)

object MathChallenge {
    fun generateProblem(): MathProblem {
        val op = Random.nextInt(3)
        val a: Int
        val b: Int
        val answer: Int
        val expr: String

        when (op) {
            0 -> { // Addition
                a = Random.nextInt(10, 100)
                b = Random.nextInt(10, 100)
                answer = a + b
                expr = "$a + $b"
            }
            1 -> { // Subtraction
                a = Random.nextInt(20, 100)
                b = Random.nextInt(10, a)
                answer = a - b
                expr = "$a - $b"
            }
            else -> { // Multiplication
                a = Random.nextInt(2, 12)
                b = Random.nextInt(2, 12)
                answer = a * b
                expr = "$a * $b"
            }
        }
        return MathProblem(expr, answer)
    }
}
