package lec01

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }
}