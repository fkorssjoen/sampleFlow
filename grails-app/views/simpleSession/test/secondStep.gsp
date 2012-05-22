<html>
	<head>
		<title>Paso 2</title>

	</head>
	<body>		
	
		<div class="box">	
		<fieldset id="locationData">  
			<h2 class="typo">${session.sessionSequence}</h2>

    <div class="appaddress">${actualStep} | ${stepNumber}</div>

		<br />
		
		<g:form>
		
		<g:submitButton name="back"/>	
		<g:submitButton name="next"/>
			
		
		</g:form>
		


		
		</fieldset>	
		
		</div>
	</body>
</html>



