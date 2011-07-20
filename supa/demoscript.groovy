ex = new Expando()
ex.name = "Thando"
ex.surname="Mafela"

println ex.name
println ex.surname

ex.add = {a,b,c->
   a+b+c	
}

println "The answer is ${ex.add(4,4,4)}"

def foo = "I am a foo"
def metaClass = foo.metaClass

metaClass.methods.each {
    println it.name

}

metaClass.properties.each {
   println it.name
}

Dog.metaClass.bark = { "Bark" }
Dog dog = new Dog()
println dog.bark()

Dog.metaClass.getBreed = {"Poodle"}
println "The dog breed is ${dog.breed}"

dog.metaClass.properties.each {
   println it.name
}

Dog.metaClass.constructor = { String name->
	new Dog(name:name)
}

println "My name is " + new Dog('Buster').name	


class Dog { 
  def name
}
