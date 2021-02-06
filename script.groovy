def buildApp(){
	echo 'Building an Application...'
}

def testApp(){
	echo 'Testing an Application...'
}

def deployApp(){
	echo "Deploying an Application verison ${params.VERSION}"
}

return this
