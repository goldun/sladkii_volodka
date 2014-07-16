1. CONFIGURE MAVEN
	a)Add profile in settings.xml
		Example
		-------------------------------------------------------------------------------------------------------
		<profile>
			<id>wildfly-web</id>
			<properties>
				<wildfly-home>/home/evdut/projects/Restaurant
					Project/wildfly-8.1.0.Final</wildfly-home>
				<wildfly-hostname>127.0.0.1</wildfly-hostname>
				<wildfly-port>9990</wildfly-port>
				<wildfly.username>admin</wildfly.username>
				<wildfly.password>admin</wildfly.password>
			</properties>
		</profile>
		-------------------------------------------------------------------------------------------------------
2) EXECUTE MAVEN GOALS
	a) wildfly:deploy will deploy application
