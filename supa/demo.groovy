Widget.metaClass.methodMissing = { String methodName, args ->
        println "In method missing for $methodName"
	def impl = { a , b ->
	      a + b
	}
	Widget.metaClass."${methodName}" = impl
        impl(*args)
}

w = new Widget()
100.times {	
    println w.hello(5,7)
}


