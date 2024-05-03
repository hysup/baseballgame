package org.example

import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    // ctrl + alt + l
    fun Randomanswer(): Int {
//        val Randomanswer = Random.nextInt(1, 9).toString()
        val set = mutableSetOf<Int>()
        while (set.size <= 3) {
            set.add(Random.nextInt(0, 9))
        }
        return set.toString().toInt()

    }
    fun inputvalidcheck (input:String): Boolean {
        if (input.length != 3) {
            return false
        }
        val set = mutableSetOf<Int>()
        if (set.size <= 3) {
            set.add(input.toInt())
            return true
        }


    fun Game() {
        while (true) {
            print("세자리 수를 입력하세요")
            val input = readLine()!!

            if (inputvalidcheck(input)) {
                println("서로 다른 3자리수를 입력하세요")

            }

            val strike =
            val ball =










        // 1. 유저에게 입력값을 받음 (input 기억하시나요?!)

        // 2. 정수로 변환되지 않는 경우 반복문 처음으로 돌아가기

        // 3. 세자리가 아니거나, 0을 가지거나 특정 숫자가 두번 사용된 경우 반복문 처음으로 돌아가기

        // 4. 정답과 유저의 입력값을 비교하여 스트라이크/볼을 출력하기
        // 만약 정답이라면 break 호출하여 반복문 탈출

