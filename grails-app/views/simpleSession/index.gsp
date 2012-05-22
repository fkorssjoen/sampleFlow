<html>
	<head>
		<title>TEST</title>

	</head>
	<body>		
	
		<div class="box">	
		<fieldset id="locationData">  
			<h2 class="typo">${session.sessionSequence}</h2>

    <div class="appaddress">Tip: To access the application from another computer on the same local network, use this address in a web browser:
        ${request.getScheme()}://${java.net.InetAddress.getLocalHost().getHostAddress() + ((request.getLocalPort() != 80) ? ':' + request.getLocalPort() : '') + request.getContextPath()}</div>

		<br />
		
	<%! import java.util.*  %>
	<%! import javax.management.*  %>
	

JMX testing..

<%

    ArrayList list = MBeanServerFactory.findMBeanServer(null);

	
	list.each{
		MBeanServer mbeanServer = it;
		out.print("<hr />")
		out.print("MBeanServer: ${mbeanServer} <br>");
		
		String domain = mbeanServer.getDefaultDomain();
	
		out.print("Default domain: ${domain} <br>");
	
		Set namesSet = mbeanServer.queryNames(null, null);
	
		Object[] objectNames = namesSet.toArray();
	
		out.print("mbean object names: <br>");
	
		for (int x = 0; x < objectNames.length; x++)
	
		{
	
			out.print("${objectNames[x]} <br>");
	
		}
		
		}


%>

		
		</fieldset>	
		
		</div>
	</body>
</html>



