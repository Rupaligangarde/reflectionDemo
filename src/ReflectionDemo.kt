fun main(args: Array<String>) {

    val test = Test()

    //class name
    val testClass = test.javaClass
    println("Name of the class is: ${testClass.name}")

    //get constructor
    val constructor = testClass.getConstructor()
    println("Name of the constructor is : ${constructor.name}")

    //get all methods
    val methods = testClass.methods
    methods.forEach {
        println("Method Name is ${it.name}")
    }

    //invoke method using param type
    val declaredMethod = testClass.getDeclaredMethod("testMethod2", Int::class.java)
    declaredMethod.invoke(test, 19)


    //modify field value
    val declaredField = testClass.getDeclaredField("firstName")
    declaredField.trySetAccessible()
    declaredField.set(test, "John")

    val testMethod1 = testClass.getDeclaredMethod("testMethod1")
    testMethod1.invoke(test)


    //access private method
    val testMethod3 = testClass.getDeclaredMethod("testMethod3")
    testMethod3.trySetAccessible()
    testMethod3.invoke(test)
}