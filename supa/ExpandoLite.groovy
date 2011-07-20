public class ExpandoLite {
       private dynamicProperties = [:]

	void setProperty(String name,value){
	     dynamicProperties[name] = value
	}
        
	def getProperty(String name){
	    dynamicProperties[name]
	}

	def methodMissing(String methodName,args){
	    def prop = dynamicProperties[methodName]

            if(prop instanceof Closure ){
	      return prop(*args)
	    }
	}
}

