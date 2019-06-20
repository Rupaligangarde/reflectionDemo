class Test() {
    private var firstName = ""
    private fun firstName() {
        firstName = "firstName"
    }

    fun testMethod1() {
        println("firstName is $firstName")
    }

    fun testMethod2(age: Int) {
        println("the age is $age")
    }

    private fun testMethod3(){
        println("private method is invoked")
    }
}




