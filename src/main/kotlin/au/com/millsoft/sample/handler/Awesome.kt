package au.com.millsoft.sample.handler

class Awesome (val mname : String){
    private val msg = "G'day from "

    fun getMessage() : String {
        return msg
    }

    fun getAnotherMessage() : String = mname
}