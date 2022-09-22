package com.hakancevik.introductiontokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Variables
        println("--------- Variables ---------")

        val luckyNumber = 23
        val myNick = "Agile10"
        val point = 8.8

        println("number: $luckyNumber")  // println("number" + luckyNumber)
        println("nick: $myNick")
        println("point: $point")


        // Constant
        println("--------- Constant ---------")
        val keyNumber = "xRyDeR7860"
        println("Key: $keyNumber")


        // Integer
        println("--------- Integer ---------")

        val age: Int = 21    // Defining         // Initialize
        println(age)


        // Double & Float
        println("--------- Double & Float ---------")

        val piNumber: Double = 3.14
        val avogadro: Float = 6.12f

        println(piNumber)
        println(avogadro)


        // String
        println("--------- String ---------")

        val name: String = "ray Jackson"

        println(name)
        println(name.length)


        // Boolean (operators  -->  ==, !=, >, <, <=, >=, &&, ||)
        println("--------- Boolean ---------")

        val isOpen: Boolean = true
        println(isOpen)


        // Conversion
        println("--------- Conversion ---------")

        val newNumber: Int = 99
        val newString: String = newNumber.toString()
        val newDouble: Double = newNumber.toDouble()

        println(newString)
        println(newDouble)


        // Arrays
        println("--------- Arrays ---------")

        val myArray = arrayOf("Spock", 74, "Michael")
        myArray[0] = "Mr. Spock"
        println(myArray[0])

        val ageArray = intArrayOf(89, 23, 23, 25, 12, 54)
        println(ageArray[4])


        // List - ArrayList
        println("--------- List / ArrayList ---------")

        val teams = arrayListOf<String>("Bayern Munich", "Real Madrid", "Chelsea")
        teams.add("Barcelona")
        teams.add(0, "Lyon")

        println(teams[2])

        val randomList = ArrayList<Any>()
        randomList.add("Hakan")
        randomList.add(21)
        randomList.add(1, "Android Developer")
        randomList.add(99.99)

        println(randomList[0])
        println(randomList[1])
        println(randomList[2])


        // Set
        println("--------- Set ---------")

        val numberSet = setOf<Int>(23, 1, 97, 23, 1, 5, 5, 23)
        println("set size: ${numberSet.size}")

        val nameSet = HashSet<String>()
        nameSet.add("Captain James T. Kirk")
        nameSet.add("Spock")
        nameSet.add("Scotty")


        // For each
        numberSet.forEach { println(it * 3) }


        // Map
        println("--------- Map ---------")

        val country = HashMap<String, Any>()
        country["Istanbul"] = 34    // country.put("Istanbul",34)
        country["Ankara"] = 6       // country.put("Ankara",6)

        println(country["Istanbul"])
        println(country["Ankara"])

        val mHashMap = hashMapOf<String, Int>("Michael" to 1, "Moses" to 3)
        println(mHashMap["Moses"])


        // If Statements
        println("--------- If / Else ---------")

        val offer = 95000

        if (offer >= 100000) {
            println("Sold!")
        } else if (offer > 90000) {
            println("Almost!")
        } else {
            println("On sale")
        }


        // Switch/Case - When
        println("--------- Switch - When ---------")

        val day = 3
        var dayName = ""

        when (day) {

            1 -> dayName = "Monday"
            2 -> dayName = "Tuesday"
            3 -> dayName = "Wednesday"
            else -> dayName = ""
        }
        println(dayName)


        // For Loop
        println("--------- For Loop ---------")

        val doubleArray = doubleArrayOf(6.6, 4.8, 2.3, 5.9)

        for (number in doubleArray) {
            var x = (number / 2) % 3
            println(x)

        }

        // [0,9] loop
        for (i in 0..9) {
            println(i)
        }

        val masterList = ArrayList<String>()
        masterList.add("Wesley So")
        masterList.add("Kasparov")
        masterList.add("Fabiano C.")
        masterList.add("Vladimir K.")

        for (str in masterList) {
            println("Grandmaster: $str")
        }


        // While Loop
        println("--------- While Loop ---------")

        var i = 3
        while (i < 7) {
            println("Beam me up Scotty!")
            i += 1
        }


    }
}