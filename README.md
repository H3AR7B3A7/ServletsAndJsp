# Servlets & JSP

[Doc: JavaEE application](https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-ee-application.html)

## Deployment
### TomCat or GlassFish

Tomcat is simply an HTTP server and a Java servlet container. Glassfish is a complete Java EE application server, including an EJB container and all the other features of this stack. ... By comparison, Tomcat server administration is easier than Glassfish administration, since there are fewer moving parts in Tomcat.

### Default URL
http://localhost:8080/ServletsAndJsp_war_exploded/  
Where "ServletsAndJsp" is the project name.  
This can be changed in the 'Run/Debug configurations'.

## Servlets
[Interface](https://docs.oracle.com/javaee/7/api/javax/servlet/Servlet.html)  
[HttpServlet](https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html)  
[GenericServlet](https://docs.oracle.com/javaee/7/api/javax/servlet/GenericServlet.html)  
[FacesServlet](https://docs.oracle.com/javaee/7/api/javax/faces/webapp/FacesServlet.html)

## File structure
The server hides the WEB-INF file from users.
