<html>
	<head>
		<title>TEST</title>

	</head>
	<body>		
	
		<div class="box">	
		<fieldset id="locationData">  
			<h2 class="typo">${session.id} | ${session.stepNumber} <br />${session.sessionSequence}</h2>

    <div class="appaddress">Tip: To access the application from another computer on the same local network, use this address in a web browser:
        ${request.getScheme()}://${java.net.InetAddress.getLocalHost().getHostAddress() + ((request.getLocalPort() != 80) ? ':' + request.getLocalPort() : '') + request.getContextPath()}</div>

		<br />
		
		</fieldset>	
		
		</div>
	</body>
</html>



