# Microservices using the spring boot cloud

It is multimodule maven project where as each module represent is on role in the Microservice.

## 1. Microservice.ConfigServer
It serves the purpose of the centralizing the external application properties. Following are the maven dependencies used in the module.

```
<dependencies>
	<dependency>
		<groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-config-server</artifactId>
	</dependency>
</dependencies>
<dependencyManagement>
	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-dependencies</artifactId>
			<version>${spring-cloud.version}</version>
			<type>pom</type>
			<scope>import</scope>
		</dependency>
	</dependencies>
</dependencyManagement>
```

### Credits
Author Manoj Pawar
