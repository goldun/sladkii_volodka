1. CONFIGURE MAVEN
	a)Add profile in settings.xml
		Example
		-------------------------------------------------------------------------------------------------------
		<profile>
			<id>wildfly-core</id>
			<properties>
				<wildfly-home>/home/evdut/projects/Restaurant
					Project/wildfly-8.1.0.Final</wildfly-home>
				<wildfly-hostname>127.0.0.1</wildfly-hostname>
				<wildfly-port>9990</wildfly-port>
				<wildfly.username>admin</wildfly.username>
				<wildfly.password>admin</wildfly.password>
				<jdbc.connection.url>jdbc:postgresql://localhost:5432/postgres</jdbc.connection.url>
				<jdbc.jndi.name>java:jboss/jdbc/restDatasource</jdbc.jndi.name>
			</properties>
		</profile>
		-------------------------------------------------------------------------------------------------------
2) EXECUTE MAVEN GOALS
	a) wildfly:deploy will deploy application and jdbc driver
	b) wildfly:add-resource will deploy jdbc resource to server.
