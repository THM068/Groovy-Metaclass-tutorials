public class ExpandoLiteTest extends GroovyTestCase {
	
	void testProperty(){
	  ExpandoLite ex = new ExpandoLite()
          ex.car = "Mazda"
	  assertEquals "Mazda",ex.car
	}

	void testMethodInvocation(){
	   def ex = new ExpandoLite()
           ex.addNumbers = { a,b ->
	      a + b
	   }

	   assertEquals 100 , ex.addNumbers(40,60)
	}


}
